package de.shadowrunrpg.nscrg.core.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.eclipse.persistence.annotations.ExistenceChecking;
import org.eclipse.persistence.annotations.ExistenceType;

@Entity
@ExistenceChecking(ExistenceType.CHECK_DATABASE)

@NamedQueries({
	@NamedQuery(
			name = "ListDAO.getSpecificList", 
			query = "SELECT t FROM MetaListElement t where t.elementType like :type") 
})
public class MetaListElement {
	// Primäry key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String elementType;
	private String elementName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getElementType() {
		return elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

}
