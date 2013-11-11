/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AffinityGroupView extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord> {

	private static final long serialVersionUID = 1589152391;

	/**
	 * The singleton instance of <code>cloud.affinity_group_view</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.AffinityGroupView AFFINITY_GROUP_VIEW = new org.apache.cloudstack.db.jooq.generated.tables.AffinityGroupView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord.class;
	}

	/**
	 * The column <code>cloud.affinity_group_view.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.affinity_group_view.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.affinity_group_view.type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.affinity_group_view.description</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(4096), this);

	/**
	 * The column <code>cloud.affinity_group_view.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.affinity_group_view.acl_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> ACL_TYPE = createField("acl_type", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this);

	/**
	 * The column <code>cloud.affinity_group_view.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.affinity_group_view.account_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> ACCOUNT_UUID = createField("account_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.affinity_group_view.account_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>cloud.affinity_group_view.account_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.Integer> ACCOUNT_TYPE = createField("account_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.affinity_group_view.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.Long> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.affinity_group_view.domain_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> DOMAIN_UUID = createField("domain_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.affinity_group_view.domain_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.affinity_group_view.domain_path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> DOMAIN_PATH = createField("domain_path", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.affinity_group_view.vm_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.Long> VM_ID = createField("vm_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.affinity_group_view.vm_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> VM_UUID = createField("vm_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.affinity_group_view.vm_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> VM_NAME = createField("vm_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.affinity_group_view.vm_state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> VM_STATE = createField("vm_state", org.jooq.impl.SQLDataType.VARCHAR.length(32), this);

	/**
	 * The column <code>cloud.affinity_group_view.vm_display_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AffinityGroupViewRecord, java.lang.String> VM_DISPLAY_NAME = createField("vm_display_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>cloud.affinity_group_view</code> table reference
	 */
	public AffinityGroupView() {
		super("affinity_group_view", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.affinity_group_view</code> table reference
	 */
	public AffinityGroupView(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.AffinityGroupView.AFFINITY_GROUP_VIEW);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.AffinityGroupView as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.AffinityGroupView(alias);
	}
}