package de.shadowrunrpg.nscrg.core.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
	private Connection dbConn = H2ConnectionManager.getH2Connection();
	private Statement initStatement;
	
	public DBManager(boolean init) {
		if(init == true) {
			InitDatabase initProcess = new InitDatabase();
			initProcess.run(this.dbConn);
		}
	}
	
	public List<String> getRaces() {
		List<String> resultList = new ArrayList<String>();
		try {
			initStatement = this.dbConn.createStatement();
			String sql = "SELECT name FROM races";
			ResultSet rs = initStatement.executeQuery(sql);
			while (rs.next()) {
				resultList.add(rs.getString("name"));
			}
			initStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultList;
	}
}
