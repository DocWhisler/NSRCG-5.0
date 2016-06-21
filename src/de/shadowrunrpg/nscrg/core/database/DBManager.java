package de.shadowrunrpg.nscrg.core.database;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import de.shadowrunrpg.nscrg.core.constances.CategoryType;
import de.shadowrunrpg.nscrg.core.dao.AttributTableDAO;
import de.shadowrunrpg.nscrg.core.dao.ListTableDAO;
import de.shadowrunrpg.nscrg.core.dao.RacesTableDAO;
import de.shadowrunrpg.nscrg.core.database.init.InitDatabase;
import de.shadowrunrpg.nscrg.core.dto.MetaAttributes;
import de.shadowrunrpg.nscrg.core.dto.MetaListElement;
import de.shadowrunrpg.nscrg.core.dto.Metarace;

public class DBManager {
	private static EntityManagerFactory factory;

	private RacesTableDAO racesDAO = null;
	private AttributTableDAO attribDAO = null;
	private ListTableDAO listDAO = null;

	public DBManager(boolean init) {
		if (init == true) {
			InitDatabase initProcess = new InitDatabase();
			initProcess.run(factory);
		}
		this.racesDAO = new RacesTableDAO();
		this.attribDAO = new AttributTableDAO();
		this.listDAO = new ListTableDAO();
	}

	public List<Metarace> getRaces(CategoryType category) {
			return this.racesDAO.getRaceDTO(category.toString());
	}

	public MetaAttributes getAttribute(CategoryType attribut) {
		return this.attribDAO.getAttributDTO(attribut);
	}

	public List<MetaListElement> getAttributList() {
		return this.listDAO.getList("A");
	}
}
