package de.shadowrunrpg.nscrg.core;

import java.util.List;

import de.nsrcg.app.models.shadowrun5.SRCharacterOriginal;
import de.shadowrunrpg.nscrg.core.constances.ListType;
import de.shadowrunrpg.nscrg.core.database.DBManager;
import de.shadowrunrpg.nscrg.core.dto.Metarace;
import de.shadowrunrpg.nscrg.core.request.MetaModelRequest;
import de.shadowrunrpg.nscrg.core.response.MetaModelResponse;

public class GeneratorCore {
	
	private DBManager dbmanager;
	
	public GeneratorCore() {
		this.dbmanager = new DBManager(true);
	}

	public List<Metarace> getItemList(ListType name) {
		if(name == ListType.metaraces) {
			return this.dbmanager.getRaces(null);
		}
		return null;
	}

	public int validateCharacter(SRCharacterOriginal character) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public MetaModelResponse getMetaModelForCategories(MetaModelRequest request) {
		MetaModelResponse response = new MetaModelResponse();
		
		response.setAttributes(this.dbmanager.getAttribute(request.getAttribut()));
		response.setRaceList(this.dbmanager.getRaces(request.getRace()));
		response.setListOfAttributes(this.dbmanager.getAttributList());
		
		return response;
	}
}
