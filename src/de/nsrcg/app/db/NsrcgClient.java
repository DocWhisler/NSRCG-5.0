package de.nsrcg.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NsrcgClient {

	public void startConnection() throws ClassNotFoundException, SQLException{
				
		//		DROP TABLE IF EXISTS TEST;
		//		CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));
		//		INSERT INTO TEST VALUES(1, 'Hello');
		//		INSERT INTO TEST VALUES(2, 'World');
		//		SELECT * FROM TEST ORDER BY ID;
		//		UPDATE TEST SET NAME='Hi' WHERE ID=1;
		//		DELETE FROM TEST WHERE ID=2;
				
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:./resources/nsrcg50", "Nsrcg-5.0", "nsrcg");
		
		Statement stmnt = conn.createStatement();
		ResultSet rs = stmnt.executeQuery("SELECT * FROM TEST");
		
		while (rs.next()) {
			System.out.println("Name '" + rs.getString("NAME") + "'");			
		}
		
		conn.close();
	}
}
