package de.nsrcg.app.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDatabsae {
	
	private Connection connection;
	private boolean forceInit;
	
	public InitDatabsae(Connection conn, boolean forceInit) throws SQLException {
		this.connection = conn;
		this.forceInit = forceInit;
		
		if(forceInit)
			this.dropAllTables();
		
//		this.initSRCharacter();
	}

	private void dropAllTables() throws SQLException {
		Statement stmnt = connection.createStatement();
        String tablesQ = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='PUBLIC'";
        ResultSet tablesRS = stmnt.executeQuery(tablesQ);
        
        String query = "DROP TABLE IF EXISTS ";
        String table = "";        
        
        while (tablesRS.next()) {
        	table = tablesRS.getString(1);
        	System.out.println("Drop table " + table);
        	
        	query += table;        	
        	stmnt.execute(query);
		}
		
	}

	private void initSRCharacter() throws SQLException {
		
		//		DROP TABLE IF EXISTS TEST;
		//		CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));
		//		INSERT INTO TEST VALUES(1, 'Hello');
		//		INSERT INTO TEST VALUES(2, 'World');
		//		SELECT * FROM TEST ORDER BY ID;
		//		UPDATE TEST SET NAME='Hi' WHERE ID=1;
		//		DELETE FROM TEST WHERE ID=2;		
		
		String query = "CREATE TABLE IF NOT EXISTS SRCHARACTER"
                + "(ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL, NAME VARCHAR(255))"; 
		Statement stmnt = connection.createStatement();
		stmnt.executeUpdate(query);
		
		System.out.println("SRCHARACTER created");
		this.printTables();
	}
	
	private void printTables() throws SQLException{
		System.out.println("Liste vorhandener Tabellen...");
		Statement stmnt = connection.createStatement();
        String tablesQ = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='PUBLIC'";
        ResultSet tablesRS = stmnt.executeQuery(tablesQ);
        while (tablesRS.next()) {
            System.out.printf("Tabelle %s vorhanden \n",
                    tablesRS.getString(1));
        } 
	}
}
