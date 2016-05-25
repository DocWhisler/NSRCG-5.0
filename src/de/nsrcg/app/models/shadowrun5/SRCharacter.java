package de.nsrcg.app.models.shadowrun5;

import de.nsrcg.app.constances.CharacterGender;

public class SRCharacter {
	private String firstName;
	private String familyName;
	private String streetName;
	private CharacterGender charGender;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public CharacterGender getCharGender() {
		return charGender;
	}
	public void setCharGender(CharacterGender charGender) {
		this.charGender = charGender;
	}
	
	public void show() {
		System.out.println("Name:" + firstName + " " + familyName);
		System.out.println("Geschlecht:" +  charGender);
		System.out.println("Strasse:" +  streetName);
	}
	
	
}
