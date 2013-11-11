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
public class VirtualRouterProviders extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord> {

	private static final long serialVersionUID = -1213187284;

	/**
	 * The singleton instance of <code>cloud.virtual_router_providers</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.VirtualRouterProviders VIRTUAL_ROUTER_PROVIDERS = new org.apache.cloudstack.db.jooq.generated.tables.VirtualRouterProviders();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord.class;
	}

	/**
	 * The column <code>cloud.virtual_router_providers.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.virtual_router_providers.nsp_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, java.lang.Long> NSP_ID = createField("nsp_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.virtual_router_providers.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.virtual_router_providers.type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.virtual_router_providers.enabled</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, java.lang.Integer> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.virtual_router_providers.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>cloud.virtual_router_providers</code> table reference
	 */
	public VirtualRouterProviders() {
		super("virtual_router_providers", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.virtual_router_providers</code> table reference
	 */
	public VirtualRouterProviders(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.VirtualRouterProviders.VIRTUAL_ROUTER_PROVIDERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_VIRTUAL_ROUTER_PROVIDERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_VIRTUAL_ROUTER_PROVIDERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_VIRTUAL_ROUTER_PROVIDERS_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_VIRTUAL_ROUTER_PROVIDERS_UC_VIRTUAL_ROUTER_PROVIDERS__UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.VirtualRouterProvidersRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_VIRTUAL_ROUTER_PROVIDERS__NSP_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.VirtualRouterProviders as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.VirtualRouterProviders(alias);
	}
}