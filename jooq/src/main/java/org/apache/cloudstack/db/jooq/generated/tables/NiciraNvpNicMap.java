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
public class NiciraNvpNicMap extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord> {

	private static final long serialVersionUID = -438996382;

	/**
	 * The singleton instance of <code>cloud.nicira_nvp_nic_map</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpNicMap NICIRA_NVP_NIC_MAP = new org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpNicMap();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord.class;
	}

	/**
	 * The column <code>cloud.nicira_nvp_nic_map.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.nicira_nvp_nic_map.logicalswitch</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord, java.lang.String> LOGICALSWITCH = createField("logicalswitch", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.nicira_nvp_nic_map.logicalswitchport</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord, java.lang.String> LOGICALSWITCHPORT = createField("logicalswitchport", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.nicira_nvp_nic_map.nic</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord, java.lang.String> NIC = createField("nic", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>cloud.nicira_nvp_nic_map</code> table reference
	 */
	public NiciraNvpNicMap() {
		super("nicira_nvp_nic_map", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.nicira_nvp_nic_map</code> table reference
	 */
	public NiciraNvpNicMap(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpNicMap.NICIRA_NVP_NIC_MAP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_NICIRA_NVP_NIC_MAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_NICIRA_NVP_NIC_MAP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpNicMapRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_NICIRA_NVP_NIC_MAP_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_NICIRA_NVP_NIC_MAP_LOGICALSWITCHPORT, org.apache.cloudstack.db.jooq.generated.Keys.KEY_NICIRA_NVP_NIC_MAP_NIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpNicMap as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpNicMap(alias);
	}
}