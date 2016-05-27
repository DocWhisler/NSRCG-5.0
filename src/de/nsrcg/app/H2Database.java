package de.nsrcg.app;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H2Database {

	
//	public H2Database(){
//		
//	}
	
	public void startConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Nsrcg-5.0", "nsrcg");
		
		Statement stmnt = conn.createStatement();
		ResultSet rs = stmnt.executeQuery("SELECT * FROM TEST");
		
		while (rs.next()) {
			System.out.println("Name '" + rs.getString("NAME") + "'");			
		}
		
		conn.close();
	}
}
