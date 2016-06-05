package de.shadowrunrpg.nscrg.core;

import java.util.List;

import de.nsrcg.app.models.shadowrun5.SRCharacterOriginal;
import de.shadowrunrpg.nscrg.core.constances.ListType;
import de.shadowrunrpg.nscrg.core.database.DBManager;

public class GeneratorCore {
	
	private DBManager dbmanager;
	
	public GeneratorCore() {
		this.dbmanager = new DBManager(true);
	}

	public List<String> getItemList(ListType name) {
		if(name == ListType.metaraces) {
			return this.dbmanager.getRaces();
		}
		return null;
	}
	
	public List<String> getPossibleRaces(String raceCategory) {
		return this.dbmanager.getSpecficRaces(raceCategory);
	}

	public int validateCharacter(SRCharacterOriginal character) {
		// TODO Auto-generated method stub
		return 0;
	}

}
