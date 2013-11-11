/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabasechangeloglockDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.DatabasechangeloglockRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock, java.lang.Integer> {

	/**
	 * Create a new DatabasechangeloglockDao without any configuration
	 */
	public DatabasechangeloglockDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK, org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock.class);
	}

	/**
	 * Create a new DatabasechangeloglockDao with an attached configuration
	 */
	public DatabasechangeloglockDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK, org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock> fetchById(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock fetchOneById(java.lang.Integer value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.ID, value);
	}

	/**
	 * Fetch records that have <code>LOCKED IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock> fetchByLocked(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED, values);
	}

	/**
	 * Fetch records that have <code>LOCKGRANTED IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock> fetchByLockgranted(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED, values);
	}

	/**
	 * Fetch records that have <code>LOCKEDBY IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Databasechangeloglock> fetchByLockedby(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY, values);
	}
}