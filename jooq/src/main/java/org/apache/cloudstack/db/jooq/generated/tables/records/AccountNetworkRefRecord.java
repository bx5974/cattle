/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "account_network_ref", schema = "cloud")
public class AccountNetworkRefRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.AccountNetworkRefRecord> implements org.jooq.Record4<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Short> {

	private static final long serialVersionUID = -1307753672;

	/**
	 * Setter for <code>cloud.account_network_ref.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.account_network_ref.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.account_network_ref.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.account_network_ref.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cloud.account_network_ref.network_id</code>. 
	 */
	public void setNetworkId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.account_network_ref.network_id</code>. 
	 */
	@javax.persistence.Column(name = "network_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.account_network_ref.is_owner</code>. 
	 */
	public void setIsOwner(java.lang.Short value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.account_network_ref.is_owner</code>. 
	 */
	@javax.persistence.Column(name = "is_owner", nullable = false, precision = 5)
	public java.lang.Short getIsOwner() {
		return (java.lang.Short) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Short> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Short> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.AccountNetworkRef.ACCOUNT_NETWORK_REF.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.AccountNetworkRef.ACCOUNT_NETWORK_REF.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.AccountNetworkRef.ACCOUNT_NETWORK_REF.NETWORK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.AccountNetworkRef.ACCOUNT_NETWORK_REF.IS_OWNER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getNetworkId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value4() {
		return getIsOwner();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AccountNetworkRefRecord
	 */
	public AccountNetworkRefRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.AccountNetworkRef.ACCOUNT_NETWORK_REF);
	}

	/**
	 * Create a detached, initialised AccountNetworkRefRecord
	 */
	public AccountNetworkRefRecord(java.lang.Long id, java.lang.Long accountId, java.lang.Long networkId, java.lang.Short isOwner) {
		super(org.apache.cloudstack.db.jooq.generated.tables.AccountNetworkRef.ACCOUNT_NETWORK_REF);

		setValue(0, id);
		setValue(1, accountId);
		setValue(2, networkId);
		setValue(3, isOwner);
	}
}