package de.shadowrunrpg.nscrg.core.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import de.shadowrunrpg.nscrg.core.constances.CategoryType;

@Entity
@NamedQueries({
		@NamedQuery(
				name = "AttributTableDAO.getSpecificAttribut", 
				query = "SELECT t FROM MetaAttributes t where t.relatedCategory like :category") 
	})
public class MetaAttributes {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public Long id;
	private int attribut;
	private int maxAttribut;
	public CategoryType relatedCategory;

	public CategoryType getRelatedCategory() {
		return relatedCategory;
	}

	public void setRelatedCategory(CategoryType relatedCategory) {
		this.relatedCategory = relatedCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAttribut() {
		return attribut;
	}

	public void setAttribut(int attribut) {
		this.attribut = attribut;
	}

	public void setMaxAttribut(int max) {
		this.maxAttribut = max;
	}
	
	public int getMaxAttribut() {
		return this.maxAttribut;
	}
	
	

}