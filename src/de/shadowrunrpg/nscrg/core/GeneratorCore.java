package de.shadowrunrpg.nscrg.core;

import java.util.List;

import de.nsrcg.app.models.shadowrun5.SRCharacter;
import de.shadowrunrpg.nscrg.core.constances.ListType;
import de.shadowrunrpg.nscrg.core.database.DBManager;

public class GeneratorCore {
	
	private DBManager dbmanager;
	
	public GeneratorCore() {
		this.dbmanager = new DBManager(false);
	}

	public List<String> getItemList(ListType name) {
		if(name == ListType.metaraces) {
			return this.dbmanager.getRaces();
		}
		return null;
	}

	public int validateCharacter(SRCharacter character) {
		// TODO Auto-generated method stub
		return 0;
	}

}
