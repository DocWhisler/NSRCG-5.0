package de.shadowrunrpg.nscrg.core.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDatabase {

	private Connection dbconn = null;
	private Statement initStatement = null;
	
	public void run(Connection conn) {
		this.dbconn = conn;
		this.createMetaraces();
	}
	
	private void createMetaraces() {
		try {
			initStatement = this.dbconn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS races "
					+ "(id								INTEGER PRIMARY KEY AUTO_INCREMENT(-1,1),"
					+ "	name							TEXT    NOT NULL,"
					+ "	language						TEXT    NOT NULL)";
			initStatement.executeUpdate(sql);
			initStatement.close();
			this.dbconn.commit();
			Statement stmt = this.dbconn.createStatement();
			String sql2 = "INSERT into races (name, language)"
					+ "VALUES ('Elf' , 'de'), ('Mensch', 'de') , ('Ork', 'de') , ('Troll', 'de') , ('Zwerg', 'de');";
			stmt.executeUpdate(sql2);
			stmt.close();
			this.dbconn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
