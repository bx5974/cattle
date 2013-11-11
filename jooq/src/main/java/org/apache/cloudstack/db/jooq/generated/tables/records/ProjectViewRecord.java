/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "project_view", schema = "cloud")
public class ProjectViewRecord extends org.jooq.impl.TableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectViewRecord> {

	private static final long serialVersionUID = 1715370123;

	/**
	 * Setter for <code>cloud.project_view.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.project_view.id</code>. 
	 */
	@javax.persistence.Column(name = "id", nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.project_view.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.project_view.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.project_view.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.project_view.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.project_view.display_text</code>. 
	 */
	public void setDisplayText(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.project_view.display_text</code>. 
	 */
	@javax.persistence.Column(name = "display_text", length = 255)
	public java.lang.String getDisplayText() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.project_view.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.project_view.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	public java.lang.String getState() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.project_view.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.project_view.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>cloud.project_view.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.project_view.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>cloud.project_view.project_account_id</code>. 
	 */
	public void setProjectAccountId(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.project_view.project_account_id</code>. 
	 */
	@javax.persistence.Column(name = "project_account_id", nullable = false, precision = 20)
	public java.lang.Long getProjectAccountId() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>cloud.project_view.owner</code>. 
	 */
	public void setOwner(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.project_view.owner</code>. 
	 */
	@javax.persistence.Column(name = "owner", length = 100)
	public java.lang.String getOwner() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>cloud.project_view.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.project_view.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", precision = 20)
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(9);
	}

	/**
	 * Setter for <code>cloud.project_view.domain_id</code>. 
	 */
	public void setDomainId(java.lang.Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cloud.project_view.domain_id</code>. 
	 */
	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return (java.lang.Long) getValue(10);
	}

	/**
	 * Setter for <code>cloud.project_view.domain_uuid</code>. 
	 */
	public void setDomainUuid(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cloud.project_view.domain_uuid</code>. 
	 */
	@javax.persistence.Column(name = "domain_uuid", length = 40)
	public java.lang.String getDomainUuid() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>cloud.project_view.domain_name</code>. 
	 */
	public void setDomainName(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cloud.project_view.domain_name</code>. 
	 */
	@javax.persistence.Column(name = "domain_name", length = 255)
	public java.lang.String getDomainName() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>cloud.project_view.domain_path</code>. 
	 */
	public void setDomainPath(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cloud.project_view.domain_path</code>. 
	 */
	@javax.persistence.Column(name = "domain_path", nullable = false, length = 255)
	public java.lang.String getDomainPath() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_id</code>. 
	 */
	public void setTagId(java.lang.Long value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_id</code>. 
	 */
	@javax.persistence.Column(name = "tag_id", precision = 20)
	public java.lang.Long getTagId() {
		return (java.lang.Long) getValue(14);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_uuid</code>. 
	 */
	public void setTagUuid(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_uuid</code>. 
	 */
	@javax.persistence.Column(name = "tag_uuid", length = 40)
	public java.lang.String getTagUuid() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_key</code>. 
	 */
	public void setTagKey(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_key</code>. 
	 */
	@javax.persistence.Column(name = "tag_key", length = 255)
	public java.lang.String getTagKey() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_value</code>. 
	 */
	public void setTagValue(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_value</code>. 
	 */
	@javax.persistence.Column(name = "tag_value", length = 255)
	public java.lang.String getTagValue() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_domain_id</code>. 
	 */
	public void setTagDomainId(java.lang.Long value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_domain_id</code>. 
	 */
	@javax.persistence.Column(name = "tag_domain_id", precision = 20)
	public java.lang.Long getTagDomainId() {
		return (java.lang.Long) getValue(18);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_account_id</code>. 
	 */
	public void setTagAccountId(java.lang.Long value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_account_id</code>. 
	 */
	@javax.persistence.Column(name = "tag_account_id", precision = 20)
	public java.lang.Long getTagAccountId() {
		return (java.lang.Long) getValue(19);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_resource_id</code>. 
	 */
	public void setTagResourceId(java.lang.Long value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_resource_id</code>. 
	 */
	@javax.persistence.Column(name = "tag_resource_id", precision = 20)
	public java.lang.Long getTagResourceId() {
		return (java.lang.Long) getValue(20);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_resource_uuid</code>. 
	 */
	public void setTagResourceUuid(java.lang.String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_resource_uuid</code>. 
	 */
	@javax.persistence.Column(name = "tag_resource_uuid", length = 40)
	public java.lang.String getTagResourceUuid() {
		return (java.lang.String) getValue(21);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_resource_type</code>. 
	 */
	public void setTagResourceType(java.lang.String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_resource_type</code>. 
	 */
	@javax.persistence.Column(name = "tag_resource_type", length = 255)
	public java.lang.String getTagResourceType() {
		return (java.lang.String) getValue(22);
	}

	/**
	 * Setter for <code>cloud.project_view.tag_customer</code>. 
	 */
	public void setTagCustomer(java.lang.String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>cloud.project_view.tag_customer</code>. 
	 */
	@javax.persistence.Column(name = "tag_customer", length = 255)
	public java.lang.String getTagCustomer() {
		return (java.lang.String) getValue(23);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProjectViewRecord
	 */
	public ProjectViewRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.ProjectView.PROJECT_VIEW);
	}

	/**
	 * Create a detached, initialised ProjectViewRecord
	 */
	public ProjectViewRecord(java.lang.Long id, java.lang.String uuid, java.lang.String name, java.lang.String displayText, java.lang.String state, java.sql.Timestamp removed, java.sql.Timestamp created, java.lang.Long projectAccountId, java.lang.String owner, java.lang.Long accountId, java.lang.Long domainId, java.lang.String domainUuid, java.lang.String domainName, java.lang.String domainPath, java.lang.Long tagId, java.lang.String tagUuid, java.lang.String tagKey, java.lang.String tagValue, java.lang.Long tagDomainId, java.lang.Long tagAccountId, java.lang.Long tagResourceId, java.lang.String tagResourceUuid, java.lang.String tagResourceType, java.lang.String tagCustomer) {
		super(org.apache.cloudstack.db.jooq.generated.tables.ProjectView.PROJECT_VIEW);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, name);
		setValue(3, displayText);
		setValue(4, state);
		setValue(5, removed);
		setValue(6, created);
		setValue(7, projectAccountId);
		setValue(8, owner);
		setValue(9, accountId);
		setValue(10, domainId);
		setValue(11, domainUuid);
		setValue(12, domainName);
		setValue(13, domainPath);
		setValue(14, tagId);
		setValue(15, tagUuid);
		setValue(16, tagKey);
		setValue(17, tagValue);
		setValue(18, tagDomainId);
		setValue(19, tagAccountId);
		setValue(20, tagResourceId);
		setValue(21, tagResourceUuid);
		setValue(22, tagResourceType);
		setValue(23, tagCustomer);
	}
}