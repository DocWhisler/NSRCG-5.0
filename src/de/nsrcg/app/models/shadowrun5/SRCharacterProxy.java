package de.nsrcg.app.models.shadowrun5;

import de.nsrcg.app.constances.CharacterGender;

public class SRCharacterProxy implements SRCharacter{

	private SRCharacter state;
	
	@Override
	public String getFirstName() {
		return state.getFirstName();
	}

	@Override
	public void setFirstName(String firstName) {
		state.setFirstName(firstName);		
	}

	@Override
	public String getFamilyName() {
		return state.getFamilyName();
	}

	@Override
	public void setFamilyName(String familyName) {
		state.setFamilyName(familyName);
	}

	@Override
	public String getStreetName() {
		return state.getStreetName();
	}

	@Override
	public void setStreetName(String streetName) {
		state.setStreetName(streetName);
	}

	@Override
	public CharacterGender getCharGender() {
		return state.getCharGender();
	}

	@Override
	public void setCharGender(CharacterGender charGender) {
		state.setCharGender(charGender);
	}

	@Override
	public String getAge() {
		return state.getAge();
	}

	@Override
	public void setAge(String age) {
		state.setAge(age);
	}

	@Override
	public String getWeight() {
		return state.getWeight();
	}

	@Override
	public void setWeight(String weight) {
		state.setWeight(weight);
	}

	@Override
	public String getSize() {
		return state.getSize();
	}

	@Override
	public void setSize(String size) {
		state.setSize(size);
	}

	@Override
	public String getStreetCall() {
		return state.getStreetCall();
	}

	@Override
	public void setStreetCall(String streetCall) {
		state.setStreetCall(streetCall);
	}

	@Override
	public String getDescription() {
		return state.getDescription();
	}

	@Override
	public void setDescription(String description) {
		state.setDescription(description);
	}
}
