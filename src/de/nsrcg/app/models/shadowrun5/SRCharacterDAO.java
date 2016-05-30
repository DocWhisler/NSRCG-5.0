package de.nsrcg.app.models.shadowrun5;

import de.nsrcg.app.db.CRUDDAO;

public interface SRCharacterDAO extends CRUDDAO<SRCharacter, SRCharacterDAO.Selector> {

	public enum Selector{
		SELECT_ALL,
		SELECT_ONE
	}	
}
