/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpNetworks extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord> {

	private static final long serialVersionUID = -424031568;

	/**
	 * The singleton instance of <code>cloud.op_networks</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.OpNetworks OP_NETWORKS = new org.apache.cloudstack.db.jooq.generated.tables.OpNetworks();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord.class;
	}

	/**
	 * The column <code>cloud.op_networks.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.op_networks.mac_address_seq</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord, java.lang.Long> MAC_ADDRESS_SEQ = createField("mac_address_seq", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.op_networks.nics_count</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord, java.lang.Integer> NICS_COUNT = createField("nics_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.op_networks.gc</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord, java.lang.Byte> GC = createField("gc", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.op_networks.check_for_gc</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord, java.lang.Byte> CHECK_FOR_GC = createField("check_for_gc", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>cloud.op_networks</code> table reference
	 */
	public OpNetworks() {
		super("op_networks", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.op_networks</code> table reference
	 */
	public OpNetworks(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.OpNetworks.OP_NETWORKS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_OP_NETWORKS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_OP_NETWORKS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.OpNetworksRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_OP_NETWORKS__ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.OpNetworks as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.OpNetworks(alias);
	}
}