package de.shadowrunrpg.nscrg.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.shadowrunrpg.nscrg.core.constances.CategoryType;
import de.shadowrunrpg.nscrg.core.request.MetaModelRequest;
import de.shadowrunrpg.nscrg.core.response.MetaModelResponse;

public class CoreAttributTest {

	private GeneratorCore core;
	private MetaModelRequest request;
	private MetaModelResponse respone;
	@Before
	public void initCore() {
		this.core = new GeneratorCore();
		this.request = new MetaModelRequest(CategoryType.A, CategoryType.C, CategoryType.A, CategoryType.D, CategoryType.E);
		this.respone = new MetaModelResponse();
	}
	
	@Test
	public void ListOfSkillTest() {
		MetaModelResponse response = core.getMetaModelForCategories(request);
		response.getListOfAttributes();
		assertEquals("Number of Attributes", 10, response.getListOfAttributes().size());
	}
	
	@Test
	public void skillTestCategoryA() {
		request.setAttribut(CategoryType.A);
		MetaModelResponse respone = core.getMetaModelForCategories(request);
		assertEquals("Attributs Point Category A", 24, respone.getAttributes().getAttribut());
	}
	
	@Test
	public void skillTestCategoryB() {
		request.setAttribut(CategoryType.B);
		respone = core.getMetaModelForCategories(request);		
		assertEquals("Attributs Point Category B", 20, respone.getAttributes().getAttribut());
	}
	
	@Test
	public void skillTestCategoryC() {
		request.setAttribut(CategoryType.C);
		respone = core.getMetaModelForCategories(request);		
		assertEquals("Attributs Point Category C", 16, respone.getAttributes().getAttribut());
	}
	
	@Test
	public void skillTestCategoryD() {
		request.setAttribut(CategoryType.D);
		respone = core.getMetaModelForCategories(request);		
		assertEquals("Attributs Point Category D", 14, respone.getAttributes().getAttribut());
	}

	@Test
	public void skillTestCategoryE() {
		request.setAttribut(CategoryType.E);
		respone = core.getMetaModelForCategories(request);		
		assertEquals("Attributs Point Category E", 12, respone.getAttributes().getAttribut());
	}

}
