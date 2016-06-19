package de.shadowrunrpg.nscrg.core.request;

import de.shadowrunrpg.nscrg.core.constances.CategoryType;

public class MetaModelRequest {
	private CategoryType race;
	private CategoryType skill;
	private CategoryType attribut;
	private CategoryType resources;
	private CategoryType magic;
	
	public MetaModelRequest(CategoryType race, CategoryType skill, CategoryType attrib, CategoryType res, CategoryType magic) {
		this.race = race;
		this.skill = skill;
		this.attribut = attrib;
		this.resources = res;
		this.magic = magic;
	}

	public CategoryType getRace() {
		return race;
	}

	public void setRace(CategoryType race) {
		this.race = race;
	}

	public CategoryType getSkill() {
		return skill;
	}

	public void setSkill(CategoryType skill) {
		this.skill = skill;
	}

	public CategoryType getAttribut() {
		return attribut;
	}

	public void setAttribut(CategoryType attribut) {
		this.attribut = attribut;
	}

	public CategoryType getResources() {
		return resources;
	}

	public void setResources(CategoryType resources) {
		this.resources = resources;
	}

	public CategoryType getMagic() {
		return magic;
	}

	public void setMagic(CategoryType magic) {
		this.magic = magic;
	}

}
