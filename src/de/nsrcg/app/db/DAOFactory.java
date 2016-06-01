package de.nsrcg.app.db;

import de.nsrcg.app.models.shadowrun5.SRCharacterDAO;

public abstract class DAOFactory {

	public enum Backend {
		SQL
	}
	
	public abstract SRCharacterDAO getSRCharacterDAO();
	
	public static DAOFactory createSqlDAOFactory(Backend backend)
	{
		switch (backend) {
		case SQL:
			return new SqlDAOFactory();
		default:
			return null;
		}
	}	
}
