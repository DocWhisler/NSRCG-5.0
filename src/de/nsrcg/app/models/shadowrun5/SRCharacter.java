package de.nsrcg.app.models.shadowrun5;

import de.nsrcg.app.constances.CharacterGender;

public interface SRCharacter {

	public String getFirstName();
	public void setFirstName(String firstName);
	
	public String getFamilyName();
	public void setFamilyName(String familyName);
	
	public String getStreetName();
	public void setStreetName(String streetName);
	
	public CharacterGender getCharGender();
	public void setCharGender(CharacterGender charGender);
	
	public String getAge();
	public void setAge(String age);
	
	public String getWeight();
	public void setWeight(String weight);
	
	public String getSize();	
	public void setSize(String size);
	
	public String getStreetCall();	
	public void setStreetCall(String streetCall);
	
	public String getDescription();	
	public void setDescription(String description);	
}
