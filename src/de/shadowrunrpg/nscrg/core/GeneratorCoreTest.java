package de.shadowrunrpg.nscrg.core;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.shadowrunrpg.nscrg.core.constances.CategoryType;
import de.shadowrunrpg.nscrg.core.dto.Metarace;
import de.shadowrunrpg.nscrg.core.request.MetaModelRequest;
import de.shadowrunrpg.nscrg.core.response.MetaModelResponse;

public class GeneratorCoreTest {

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
	public void raceListCategoryA() {
		request.setRace(CategoryType.A);
		request.setAttribut(CategoryType.B);
		
		MetaModelResponse respone = core.getMetaModelForCategories(request);
		
		assertEquals("Number of races", 5, respone.getRaceList().size());
		assertEquals("Troll", "Troll", respone.getRaceList().get(0).getRaceName());
		assertEquals("Elf", "Elf", respone.getRaceList().get(1).getRaceName());
		assertEquals("Mensch", "Mensch", respone.getRaceList().get(2).getRaceName());
		assertEquals("Zwerg", "Zwerg", respone.getRaceList().get(3).getRaceName());
		assertEquals("Ork", "Ork", respone.getRaceList().get(4).getRaceName());
		
		assertEquals("test", 20, respone.getAttributes().getAttribut());
	}
	
	@Test
	public void raceListCategoryB() {
		request.setRace(CategoryType.B);
		request.setAttribut(CategoryType.A);
		respone = core.getMetaModelForCategories(request);
		assertEquals("Troll", "Troll", respone.getRaceList().get(0).getRaceName());
		assertEquals("Elf", "Elf", respone.getRaceList().get(1).getRaceName());
		assertEquals("Mensch", "Mensch", respone.getRaceList().get(2).getRaceName());
		assertEquals("Zwerg", "Zwerg", respone.getRaceList().get(3).getRaceName());
		assertEquals("Ork", "Ork", respone.getRaceList().get(4).getRaceName());
		
		assertEquals("test", 24, respone.getAttributes().getAttribut());
	}
	
	@Test
	public void raceListCategoryC() {
		request.setRace(CategoryType.C);
		respone = core.getMetaModelForCategories(request);
		assertEquals("Elf", "Elf", respone.getRaceList().get(0).getRaceName());
		assertEquals("Mensch", "Mensch", respone.getRaceList().get(1).getRaceName());
		assertEquals("Zwerg", "Zwerg", respone.getRaceList().get(2).getRaceName());
		assertEquals("Ork", "Ork", respone.getRaceList().get(3).getRaceName());
	}
	
	@Test
	public void raceListCategoryD() {
		request.setRace(CategoryType.D);
		respone = core.getMetaModelForCategories(request);
		assertEquals("Elf", "Elf", respone.getRaceList().get(0).getRaceName());
		assertEquals("Mensch", "Mensch", respone.getRaceList().get(1).getRaceName());
	}

	@Test
	public void raceListCategoryE() {
		request.setRace(CategoryType.E);
		respone = core.getMetaModelForCategories(request);
		assertEquals("Number of races", 1, respone.getRaceList().size());
		assertEquals("Mensch", "Mensch", respone.getRaceList().get(0).getRaceName());
	}

}
