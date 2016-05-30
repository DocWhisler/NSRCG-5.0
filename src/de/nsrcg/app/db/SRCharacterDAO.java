package de.nsrcg.app.db;

import de.nsrcg.app.models.shadowrun5.SRCharacter;

public interface SRCharacterDAO extends CRUDDAO<SRCharacter, SRCharacterDAO.Selector> {

	public enum Selector{
		SELECT_ALL,
		SELECT_ONE
	}	
}
