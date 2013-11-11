/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "nic_secondary_ips", schema = "cloud")
public class NicSecondaryIps implements java.io.Serializable {

	private static final long serialVersionUID = -524395144;

	private java.lang.Long     id;
	private java.lang.String   uuid;
	private java.lang.Long     vmid;
	private java.lang.Long     nicid;
	private java.lang.String   ip4Address;
	private java.lang.String   ip6Address;
	private java.lang.Long     networkId;
	private java.sql.Timestamp created;
	private java.lang.Long     accountId;
	private java.lang.Long     domainId;

	public NicSecondaryIps() {}

	public NicSecondaryIps(
		java.lang.Long     id,
		java.lang.String   uuid,
		java.lang.Long     vmid,
		java.lang.Long     nicid,
		java.lang.String   ip4Address,
		java.lang.String   ip6Address,
		java.lang.Long     networkId,
		java.sql.Timestamp created,
		java.lang.Long     accountId,
		java.lang.Long     domainId
	) {
		this.id = id;
		this.uuid = uuid;
		this.vmid = vmid;
		this.nicid = nicid;
		this.ip4Address = ip4Address;
		this.ip6Address = ip6Address;
		this.networkId = networkId;
		this.created = created;
		this.accountId = accountId;
		this.domainId = domainId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "vmId", precision = 20)
	public java.lang.Long getVmid() {
		return this.vmid;
	}

	public void setVmid(java.lang.Long vmid) {
		this.vmid = vmid;
	}

	@javax.persistence.Column(name = "nicId", nullable = false, precision = 20)
	public java.lang.Long getNicid() {
		return this.nicid;
	}

	public void setNicid(java.lang.Long nicid) {
		this.nicid = nicid;
	}

	@javax.persistence.Column(name = "ip4_address", length = 40)
	public java.lang.String getIp4Address() {
		return this.ip4Address;
	}

	public void setIp4Address(java.lang.String ip4Address) {
		this.ip4Address = ip4Address;
	}

	@javax.persistence.Column(name = "ip6_address", length = 40)
	public java.lang.String getIp6Address() {
		return this.ip6Address;
	}

	public void setIp6Address(java.lang.String ip6Address) {
		this.ip6Address = ip6Address;
	}

	@javax.persistence.Column(name = "network_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(java.lang.Long networkId) {
		this.networkId = networkId;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.Long domainId) {
		this.domainId = domainId;
	}
}