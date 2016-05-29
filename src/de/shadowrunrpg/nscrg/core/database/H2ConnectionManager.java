package de.shadowrunrpg.nscrg.core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2ConnectionManager {
	
	private static H2ConnectionManager manager = null;
	private Connection currentConnection = null;
	
	public H2ConnectionManager() throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		currentConnection = DriverManager.getConnection("jdbc:h2:./resources/nsrcg50Server", "Nsrcg-5.0", "nsrcg");
	}
	
	public static Connection getH2Connection() {
		if(manager == null) {
			try {
				manager = new H2ConnectionManager();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return manager.getCurrentConnection();		
	}
	
	public Connection getCurrentConnection() {
		return currentConnection;
	}
}
