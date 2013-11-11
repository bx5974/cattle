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
public class ProjectAccount extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord> {

	private static final long serialVersionUID = 670319709;

	/**
	 * The singleton instance of <code>cloud.project_account</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.ProjectAccount PROJECT_ACCOUNT = new org.apache.cloudstack.db.jooq.generated.tables.ProjectAccount();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord.class;
	}

	/**
	 * The column <code>cloud.project_account.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.project_account.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.project_account.account_role</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, java.lang.String> ACCOUNT_ROLE = createField("account_role", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.project_account.project_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, java.lang.Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.project_account.project_account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, java.lang.Long> PROJECT_ACCOUNT_ID = createField("project_account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.project_account.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>cloud.project_account</code> table reference
	 */
	public ProjectAccount() {
		super("project_account", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.project_account</code> table reference
	 */
	public ProjectAccount(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.ProjectAccount.PROJECT_ACCOUNT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_PROJECT_ACCOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_PROJECT_ACCOUNT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_PROJECT_ACCOUNT_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_PROJECT_ACCOUNT_ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ProjectAccountRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_PROJECT_ACCOUNT__ACCOUNT_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_PROJECT_ACCOUNT__PROJECT_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_PROJECT_ACCOUNT__PROJECT_ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.ProjectAccount as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.ProjectAccount(alias);
	}
}