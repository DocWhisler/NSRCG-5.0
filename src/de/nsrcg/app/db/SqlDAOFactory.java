package de.nsrcg.app.db;

import de.nsrcg.app.models.shadowrun5.SRCharacterDAO;

public class SqlDAOFactory extends DAOFactory {

	@Override
	public SRCharacterDAO getSRCharacterDAO() {
		return new SqlSRCharacterDAO();
	}
}
