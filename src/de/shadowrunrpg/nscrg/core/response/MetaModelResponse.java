package de.shadowrunrpg.nscrg.core.response;

import java.util.List;

import de.shadowrunrpg.nscrg.core.dto.MetaAttributes;
import de.shadowrunrpg.nscrg.core.dto.Metarace;
import de.shadowrunrpg.nscrg.core.dto.MetaraceCategory;

public class MetaModelResponse {
	private List<Metarace> raceList;
	private MetaAttributes attributes;
	private MetaraceCategory freepoins;
	private MetaSkill skills;

	public void setRaceList(List<Metarace> races) {
		this.raceList = races;
	}

	public List<Metarace> getRaceList() {
		return raceList;
	}

	public MetaAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(MetaAttributes attributes) {
		this.attributes = attributes;
	}

}
