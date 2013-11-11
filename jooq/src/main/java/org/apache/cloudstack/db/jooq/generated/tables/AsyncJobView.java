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
public class AsyncJobView extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord> {

	private static final long serialVersionUID = -1478697627;

	/**
	 * The singleton instance of <code>cloud.async_job_view</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.AsyncJobView ASYNC_JOB_VIEW = new org.apache.cloudstack.db.jooq.generated.tables.AsyncJobView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord.class;
	}

	/**
	 * The column <code>cloud.async_job_view.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.async_job_view.account_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> ACCOUNT_UUID = createField("account_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.async_job_view.account_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>cloud.async_job_view.account_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Integer> ACCOUNT_TYPE = createField("account_type", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.async_job_view.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Long> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.async_job_view.domain_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> DOMAIN_UUID = createField("domain_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.async_job_view.domain_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.async_job_view.domain_path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> DOMAIN_PATH = createField("domain_path", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.async_job_view.user_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.async_job_view.user_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> USER_UUID = createField("user_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.async_job_view.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.async_job_view.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.async_job_view.job_cmd</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> JOB_CMD = createField("job_cmd", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.async_job_view.job_status</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Integer> JOB_STATUS = createField("job_status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.async_job_view.job_process_status</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Integer> JOB_PROCESS_STATUS = createField("job_process_status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.async_job_view.job_result_code</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Integer> JOB_RESULT_CODE = createField("job_result_code", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.async_job_view.job_result</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> JOB_RESULT = createField("job_result", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>cloud.async_job_view.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.async_job_view.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.async_job_view.instance_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> INSTANCE_TYPE = createField("instance_type", org.jooq.impl.SQLDataType.VARCHAR.length(64), this);

	/**
	 * The column <code>cloud.async_job_view.instance_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.Long> INSTANCE_ID = createField("instance_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.async_job_view.instance_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobViewRecord, java.lang.String> INSTANCE_UUID = createField("instance_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>cloud.async_job_view</code> table reference
	 */
	public AsyncJobView() {
		super("async_job_view", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.async_job_view</code> table reference
	 */
	public AsyncJobView(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.AsyncJobView.ASYNC_JOB_VIEW);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.AsyncJobView as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.AsyncJobView(alias);
	}
}