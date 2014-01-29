package io.github.ibuildthecloud.dstack.server.context;

import io.github.ibuildthecloud.dstack.archaius.util.ArchaiusUtil;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.UUID;

import com.netflix.config.DynamicIntProperty;
import com.netflix.config.DynamicStringProperty;

public class ServerContext {

    private static final DynamicIntProperty HTTP_PORT = ArchaiusUtil.getInt("dstack.http.port");
    private static final DynamicIntProperty HTTPS_PORT = ArchaiusUtil.getInt("dstack.https.port");
    private static final DynamicStringProperty URL_PATH = ArchaiusUtil.getString("dstack.url.path");
    private static final DynamicStringProperty SERVER_IP = ArchaiusUtil.getString("dstack.server.ip");
    private static final DynamicStringProperty SERVER_ID = ArchaiusUtil.getString("dstack.server.id");

    private static final String URL_SETTING_FORMAT = "dstack.%s.url";
    private static final String DEFAULT_URL = "dstack.url";
    private static final String FOUND_SERVER_IP = lookupServerIp();
    private static final String SERVER_ID_FORMAT = "%s-%s";
    private static final String RANDOM_ID = UUID.randomUUID().toString();

    public static ServerAddress getServerAddress() {
        return getServerAddress(null);
    }

    public static ServerAddress getServerAddress(String name) {
        return getServerAddress(null, name);
    }

    public static ServerAddress getServerAddress(String scope, String name) {
        String url = null;

        if ( scope != null ) {
            url = ArchaiusUtil.getString(String.format(URL_SETTING_FORMAT, scope + "." + name)).get();
        }

        if ( url == null ) {
            url = ArchaiusUtil.getString(String.format(URL_SETTING_FORMAT, name)).get();
        }

        if ( url == null ) {
            url = ArchaiusUtil.getString(DEFAULT_URL).get();
        }

        if ( url == null ) {
            StringBuilder buffer = new StringBuilder();
            if ( HTTPS_PORT.get() > 0 ) {
                buffer.append("https://");
                buffer.append(getServerIp());
                buffer.append(":").append(HTTPS_PORT.get());
            } else {
                buffer.append("http://");
                buffer.append(getServerIp());
                buffer.append(":").append(HTTP_PORT.get());
            }

            buffer.append(URL_PATH.get());

            url = buffer.toString();
        }

        return new ServerAddress(url);
    }

    public static String getServerId() {
        String id = SERVER_ID.get();
        String ip = getServerIp();

        if ( id != null ) {
            return String.format(id, ip);
        }

        return String.format(SERVER_ID_FORMAT, ip, RANDOM_ID);
    }

    protected static String getServerIp() {
        String ip = SERVER_IP.get();
        return ip == null ? FOUND_SERVER_IP : ip;
    }

    protected static String lookupServerIp() {
        String address = null;
        String v6Address = null;

        try {
            for ( NetworkInterface iface : Collections.list(NetworkInterface.getNetworkInterfaces()) ) {
                for ( InetAddress addr : Collections.list(iface.getInetAddresses()) ) {
                    if ( addr instanceof Inet6Address ) {
                        v6Address = addr.getHostAddress();
                    } else {
                        if ( ! addr.isLoopbackAddress() && ( address == null || ! addr.isSiteLocalAddress() ) ) {
                            address = addr.getHostAddress();
                        }
                    }
                }
            }

            if ( address != null ) {
                return address;
            } else if ( v6Address != null ) {
                return v6Address;
            } else {
                return "localhost";
            }
        } catch (SocketException e) {
            throw new IllegalStateException("Failed to lookup IP of server", e);
        }
    }

}