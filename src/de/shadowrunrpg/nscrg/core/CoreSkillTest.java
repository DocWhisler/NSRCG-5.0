package de.shadowrunrpg.nscrg.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.shadowrunrpg.nscrg.core.constances.CategoryType;
import de.shadowrunrpg.nscrg.core.request.MetaModelRequest;
import de.shadowrunrpg.nscrg.core.response.MetaModelResponse;

public class CoreSkillTest {

	private GeneratorCore core;
	private MetaModelRequest request;
	private MetaModelResponse respone;
	@Before
	public void initCore() {
		this.core = new GeneratorCore();
		this.request = new MetaModelRequest(CategoryType.A, CategoryType.C, CategoryType.A, CategoryType.D, CategoryType.E);
		this.respone = new MetaModelResponse();
	}

}
