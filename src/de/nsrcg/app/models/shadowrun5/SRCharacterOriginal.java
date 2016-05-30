package de.nsrcg.app.models.shadowrun5;

import de.nsrcg.app.constances.CharacterGender;

public class SRCharacterOriginal implements SRCharacter{
	private String firstName;
	private String familyName;
	private String streetName;	
	private String age;
    private String weight;
    private String size;
    private String streetCall;
    private String description;	    

	private CharacterGender charGender;
	
	@Override
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String getFamilyName() {
		return familyName;
	}
	
	@Override
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	@Override
	public String getStreetName() {
		return streetName;
	}
	
	@Override
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	@Override
	public CharacterGender getCharGender() {
		return charGender;
	}
	
	@Override
	public void setCharGender(CharacterGender charGender) {
		this.charGender = charGender;
	}
	
	@Override
	public String getAge() {
		return age;
	}
	
	@Override
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String getWeight() {
		return weight;
	}
	
	@Override
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	@Override
	public String getSize() {
		return size;
	}
	
	@Override
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String getStreetCall() {
		return streetCall;
	}
	
	@Override
	public void setStreetCall(String streetCall) {
		this.streetCall = streetCall;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
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
