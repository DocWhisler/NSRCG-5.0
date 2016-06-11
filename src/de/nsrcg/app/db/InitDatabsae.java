package de.nsrcg.app.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDatabsae {
	
	private Connection connection;
	
	public InitDatabsae(Connection conn) throws SQLException {
		this.connection = conn;
		this.initSRCharacter();
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
                + "(ID INT PRIMARY KEY AUTO_INCREMENT(1,1) NOT NULL, NAME VARCHAR(255))"; ;		
		Statement stmnt = connection.createStatement();
		stmnt.executeUpdate(query);
		
		String insertQ = "INSERT INTO SRCHARACTER" 
                + " VALUES(TRANSACTION_ID(),'Hello World!')";
        stmnt.executeUpdate(insertQ); 
		
		System.out.println("SRCHARACTER created");
		this.printTables();
	}
	
	private void printTables() throws SQLException{
		System.out.println("Liste Tabellen...");
		Statement stmnt = connection.createStatement();
        String tablesQ = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='PUBLIC'";
        ResultSet tablesRS = stmnt.executeQuery(tablesQ);
        while (tablesRS.next()) {
            System.out.printf("Tabelle %s vorhanden \n",
                    tablesRS.getString(1));
        } 
	}
}
