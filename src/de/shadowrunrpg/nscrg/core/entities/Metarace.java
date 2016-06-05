package de.shadowrunrpg.nscrg.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.eclipse.persistence.annotations.ExistenceChecking;
import org.eclipse.persistence.annotations.ExistenceType;

@Entity
@ExistenceChecking(ExistenceType.CHECK_DATABASE)
public class Metarace {
	// Prim�ry key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String raceName;
	private String language;
	@OneToMany(mappedBy = "connectedRace")
	private List<MetaraceCategory> categories = new ArrayList<MetaraceCategory>();

	public String getRaceName() {
		return raceName;
	}
	
	public List<MetaraceCategory> getCategories() {
		return categories;
	}
	
	public void setCategories(List<MetaraceCategory> categories) {
		this.categories = categories;
	}
	
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}

	
	

}
