package de.nsrcg.app.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NsrcgClient {

	private Connection connection;
	
	public NsrcgClient(boolean forceInit) throws Exception, SQLException {
		this.startConnection();		
		this.getTableInformations();
			
//		ResultSet rset = connection.getMetaData().getTables(null, null, "%", null);
		ResultSet rset = connection.getMetaData().getTables(null, null, "SRCHARACTER", null);
		if (!rset.next() || forceInit)
		{
			System.out.println("INIT");
			this.initDatabase();
		}	
		else
		{
			System.out.println("Datenbank ist bereits initialisiert");
		}		
	}
	
	public void connectionClose() throws SQLException{
		this.connection.close();
	}

	private void initDatabase() {
		InitDatabsae init = null;
		
		try {
			init = new InitDatabsae(this.connection);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}		
		
		System.out.println("Init erfolgreich");
	}

	private void startConnection() throws ClassNotFoundException, SQLException{					
		Class.forName("org.h2.Driver");
		this.connection = DriverManager.getConnection("jdbc:h2:./resources/nsrcg50", "Nsrcg-5.0", "nsrcg");
		System.out.println(connection.getCatalog());
		
		Statement stmnt = connection.createStatement();
		ResultSet rs = stmnt.executeQuery("SELECT * FROM TEST");
		
		while (rs.next()) {
			System.out.println("Name '" + rs.getString("NAME") + "'");			
		}		
	}
	
	private void getTableInformations() throws SQLException {		
		DatabaseMetaData metaData = this.connection.getMetaData();
		String [] types = {"TABLE", "SYSTEM TABLE"};
		
		ResultSet metaRS = metaData.getTables(null, null, "%", types);
		while (metaRS.next()) {
			// Catalog
            String tableCatalog = metaRS.getString(1);
            System.out.println("Catalog: " + tableCatalog);

            // Schemata
            String tableSchema = metaRS.getString(2);
            System.out.println("Tabellen-Schema: " + tableSchema);

            // Tabellennamen
            String tableName = metaRS.getString(3);
            System.out.println("Tabellen-Name: " + tableName);            

            // Tabellentyp
            String tableType = metaRS.getString(4);
            System.out.println("Tabellen-Typ: " + tableType + "\n"); 			
		}	
	}
	
	public Connection getConnection() {
		return connection;
	}
}
