package de.nsrcg.app.models.shadowrun5;

import de.nsrcg.app.constances.CharacterGender;

public class SRCharacter {
	private String firstName;
	private String familyName;
	private String streetName;	
	private String age;
    private String weight;
    private String size;
    private String streetCall;
    private String description;	    

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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getStreetCall() {
		return streetCall;
	}
	public void setStreetCall(String streetCall) {
		this.streetCall = streetCall;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void show() {
		System.out.println("Name: " + firstName + " " + familyName);
		System.out.println("Geschlecht: " +  charGender);
		System.out.println("Strassenname: " +  streetName);
		System.out.println("Alter: " +  age);
		System.out.println("Gewicht: " +  weight);
		System.out.println("Größe: " +  size);
		System.out.println("Strassenruf: " +  streetCall);
		System.out.println("Beschreibung: " +  description);
	}	
}
