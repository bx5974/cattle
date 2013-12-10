/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "network", schema = "dstack")
public interface Network extends java.io.Serializable {

	/**
	 * Getter for <code>dstack.network.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Getter for <code>dstack.network.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Getter for <code>dstack.network.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", length = 255)
	public java.lang.String getUuid();

	/**
	 * Getter for <code>dstack.network.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Getter for <code>dstack.network.is_public</code>. 
	 */
	@javax.persistence.Column(name = "is_public", nullable = false, precision = 1)
	public java.lang.Boolean getIsPublic();

	/**
	 * Getter for <code>dstack.network.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Getter for <code>dstack.network.vnet_id</code>. 
	 */
	@javax.persistence.Column(name = "vnet_id", precision = 19)
	public java.lang.Long getVnetId();

	/**
	 * Getter for <code>dstack.network.offering_id</code>. 
	 */
	@javax.persistence.Column(name = "offering_id", precision = 19)
	public java.lang.Long getOfferingId();

	/**
	 * Getter for <code>dstack.network.state</code>. 
	 */
	@javax.persistence.Column(name = "state", length = 255)
	public java.lang.String getState();

	/**
	 * Getter for <code>dstack.network.is_default</code>. 
	 */
	@javax.persistence.Column(name = "is_default", nullable = false, precision = 1)
	public java.lang.Boolean getIsDefault();

	/**
	 * Getter for <code>dstack.network.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated();

	/**
	 * Getter for <code>dstack.network.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved();

	/**
	 * Getter for <code>dstack.network.remove_time</code>. 
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.sql.Timestamp getRemoveTime();

	/**
	 * Getter for <code>dstack.network.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 128)
	public java.lang.String getKind();

	/**
	 * Getter for <code>dstack.network.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();
}