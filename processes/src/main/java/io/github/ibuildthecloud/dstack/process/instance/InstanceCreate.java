package io.github.ibuildthecloud.dstack.process.instance;

import static io.github.ibuildthecloud.dstack.core.model.tables.NicTable.*;
import static io.github.ibuildthecloud.dstack.core.model.tables.VolumeTable.*;
import io.github.ibuildthecloud.dstack.core.constants.InstanceConstants;
import io.github.ibuildthecloud.dstack.core.constants.VolumeConstants;
import io.github.ibuildthecloud.dstack.core.model.Instance;
import io.github.ibuildthecloud.dstack.core.model.Nic;
import io.github.ibuildthecloud.dstack.core.model.Volume;
import io.github.ibuildthecloud.dstack.engine.handler.HandlerResult;
import io.github.ibuildthecloud.dstack.engine.process.ProcessInstance;
import io.github.ibuildthecloud.dstack.engine.process.ProcessState;
import io.github.ibuildthecloud.dstack.json.JsonMapper;
import io.github.ibuildthecloud.dstack.object.ObjectManager;
import io.github.ibuildthecloud.dstack.object.process.ObjectProcessManager;
import io.github.ibuildthecloud.dstack.object.util.DataUtils;
import io.github.ibuildthecloud.dstack.process.base.AbstractDefaultProcessHandler;
import io.github.ibuildthecloud.dstack.transport.TransportFactory;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

//@Named
public class InstanceCreate extends AbstractDefaultProcessHandler {

    JsonMapper jsonMapper;
    TransportFactory transportFactory;
    ObjectProcessManager processManager;
    ObjectManager objectManager;

    @Override
    public HandlerResult handle(ProcessState state, ProcessInstance process) {
        Instance instance = (Instance)state.getResource();
        List<Volume> volumes = objectManager.children(instance, Volume.class);
        List<Nic> nics = objectManager.children(instance, Nic.class);

        defineVolumes(instance, volumes);
        defineNics(instance, nics);

        start(instance);

        return new HandlerResult();
    }

    protected void start(Instance instance) {
        Boolean doneStart = DataUtils.getField(instance.getData(), InstanceConstants.DATA_START_ON_CREATE, Boolean.class);

        if ( doneStart != null && ! doneStart.booleanValue() ) {
            return;
        }

        ProcessInstance process = processManager.createProcessInstance("start.instance", instance, null);
        process.execute();
    }

    protected void defineVolumes(Instance instance, List<Volume> volumes) {
        long deviceId = 0;
        if ( createRoot(instance, volumes) ) {
            deviceId++;
        }

        List<Long> volumeOfferingIds = DataUtils.getFieldList(instance.getData(), InstanceConstants.DATA_VOLUME_OFFERING_IDS, Long.class);

        outer:
        for ( int i = 0 ; i < volumeOfferingIds.size() ; i++ ) {
            long deviceNumber = deviceId + i;
            for ( Volume volume : volumes ) {
                if ( volume.getDeviceNumber().intValue() == deviceNumber ) {
                    continue outer;
                }
            }

            objectManager.create(Volume.class,
                    VOLUME.ACCOUNT_ID, instance.getAccountId(),
                    VOLUME.INSTANCE_ID, instance.getId(),
                    VOLUME.OFFERING_ID, volumeOfferingIds.get(i),
                    VOLUME.DEVICE_NUMBER, deviceNumber,
                    VOLUME.ATTACHED_STATE, VolumeConstants.STATE_ATTACHED
                    );
        }
    }

    protected boolean createRoot(Instance instance, List<Volume> volumes) {
        if ( instance.getImageId() == null ) {
            return false;
        }

        for ( Volume volume : volumes ) {
            if ( volume.getDeviceNumber().intValue() == 0 ) {
                return true;
            }
        }

        objectManager.create(Volume.class,
                VOLUME.ACCOUNT_ID, instance.getAccountId(),
                VOLUME.INSTANCE_ID, instance.getId(),
                VOLUME.IMAGE_ID, instance.getImageId(),
                VOLUME.DEVICE_NUMBER, 0,
                VOLUME.ATTACHED_STATE, VolumeConstants.STATE_ATTACHED
                );

        return true;
    }

    protected void defineNics(Instance instance, List<Nic> nics) {
        List<Long> networkIds = DataUtils.getFieldList(instance.getData(), InstanceConstants.DATA_NETWORK_IDS, Long.class);
        if ( networkIds == null )
            return;

        for ( int i = 0 ; i < networkIds.size() ; i++ ) {
            Number createId = networkIds.get(i);
            Nic existing = null;
            for ( Nic nic : nics ) {
                if ( nic.getNetworkId() == createId.longValue() ) {
                    existing = nic;
                    break;
                }
            }

            if ( existing == null ) {
                objectManager.create(Nic.class,
                        NIC.ACCOUNT_ID, instance.getAccountId(),
                        NIC.NETWORK_ID, createId,
                        NIC.INSTANCE_ID, instance.getId(),
                        NIC.DEVICE_NUMBER, i);
            }
        }
    }

    public JsonMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(JsonMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

    public TransportFactory getTransportFactory() {
        return transportFactory;
    }

    @Inject
    public void setTransportFactory(TransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }

    @Override
    public ObjectManager getObjectManager() {
        return objectManager;
    }

    @Override
    @Inject
    public void setObjectManager(ObjectManager objectManager) {
        this.objectManager = objectManager;
    }

    public ObjectProcessManager getProcessManager() {
        return processManager;
    }

    @Inject
    public void setProcessManager(ObjectProcessManager processManager) {
        this.processManager = processManager;
    }

}