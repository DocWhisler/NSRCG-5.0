package de.shadowrunrpg.nscrg.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.eclipse.persistence.annotations.ExistenceChecking;
import org.eclipse.persistence.annotations.ExistenceType;

@Entity
@ExistenceChecking(ExistenceType.CHECK_DATABASE)
public class MetaraceCategory {
	// Primäry key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String category;
	public int freePoints;
	private Metarace connectedRace;
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@ManyToOne
	public Metarace getConnectedRace() {
		return connectedRace;
	}
	public void setConnectedRace(Metarace connectedRace) {
		this.connectedRace = connectedRace;
	}
	public void setFreePoints(int points) {
		this.freePoints = points;
	}
	
	public int getFreePoints() {
		return this.freePoints;
	}
}