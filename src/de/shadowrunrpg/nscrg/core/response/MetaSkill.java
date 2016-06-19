package de.shadowrunrpg.nscrg.core.response;

import javax.persistence.Entity;

@Entity
public class MetaSkill {
	private long id;
	private int maxSkillPoints;
	private int skillPoints;
	private int skillGroupPoints;
	//private List<MetaSkillItem> possibleSkill;
}
