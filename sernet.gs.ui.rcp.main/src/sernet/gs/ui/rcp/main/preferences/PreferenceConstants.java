package sernet.gs.ui.rcp.main.preferences;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {

	// which method to use to access the BSI catalogues:
	public static final String GSACCESS = "cna_gsaccess"; //$NON-NLS-1$
	public static final String GSACCESS_DIR = "cna_gsaccess_url"; //$NON-NLS-1$
	public static final String GSACCESS_ZIP = "cna_gsaccess_zip"; //$NON-NLS-1$
	
	// locatio of ZIP-file or URL:
	public static final String BSIZIPFILE = "cna_bsizipfile"; //$NON-NLS-1$
	public static final String DSZIPFILE = "cna_dszipfile"; //$NON-NLS-1$
	public static final String BSIDIR = "cna_bsiurl"; //$NON-NLS-1$
	
	public static final String OODIR = "cna_oodir"; //$NON-NLS-1$
	public static final String OOTEMPLATE = "cna_ootemplate"; //$NON-NLS-1$
	public static final String OOTEMPLATE_TEXT = "cna_oodoctemplate"; //$NON-NLS-1$
	
	public static final String FIRSTSTART= "cna_derbywarning"; //$NON-NLS-1$
	public static final String ERRORPOPUPS = "cna_errorpopups"; //$NON-NLS-1$

	public static final String DB_DRIVER = "cna_driver"; //$NON-NLS-1$
	public static final String DB_DRIVER_DERBY = "org.apache.derby.jdbc.EmbeddedDriver"; //$NON-NLS-1$
	public static final String DB_DRIVER_POSTGRES = "org.postgresql.Driver"; //$NON-NLS-1$
	public static final String DB_DRIVER_MYSQL = "org.gjt.mm.mysql.Driver"; //$NON-NLS-1$
	
	// Verinice DB:
	public static final String DB_USER = "cna_dbuser"; //$NON-NLS-1$
	public static final String DB_PASS = "cna_dbpass"; //$NON-NLS-1$
	
	public static final String DB_URL = "cna_dburl"; //$NON-NLS-1$
	public static final String DB_URL_DERBY = "jdbc:derby:%s/verinicedb;create=true"; //$NON-NLS-1$
	public static final String DB_URL_POSTGRES = "jdbc:postgresql://127.0.0.1:5432/verinicedb"; //$NON-NLS-1$
	public static final String DB_URL_MYSQL = "jdbc:mysql://127.0.0.1:3306/verinicedb"; //$NON-NLS-1$

	public static final String DB_DIALECT = "cna_dbdialect"; //$NON-NLS-1$
	public static final String DB_DIALECT_derby = "org.hibernate.dialect.DerbyDialect"; //$NON-NLS-1$
	public static final String DB_DIALECT_postgres= "org.hibernate.dialect.PostgreSQLDialect"; //$NON-NLS-1$
	public static final String DB_DIALECT_mysql = "org.hibernate.dialect.MySQLInnoDBDialect"; //$NON-NLS-1$
	
	
	//gstool db for import:
	public static final String GS_DB_USER = "gs_cna_dbuser"; //$NON-NLS-1$
	public static final String GS_DB_PASS = "gs_cna_dbpass"; //$NON-NLS-1$
	public static final String GS_DB_URL = "gs_cna_dburl"; //$NON-NLS-1$
	
	
}
