package de.shadowrunrpg.nscrg.core.database.init;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.shadowrunrpg.nscrg.core.constances.CategoryType;
import de.shadowrunrpg.nscrg.core.dto.MetaAttributes;
import de.shadowrunrpg.nscrg.core.dto.MetaListElement;

public class InitDatabase {

	private InitDatabaseMetaRaces raceTable = new InitDatabaseMetaRaces("metaraces");

	public void run(EntityManagerFactory factory) {
		this.raceTable.factory = factory;
		if (this.raceTable.CheckIfTableHasEntries(raceTable.metaRaceTableName) == false) {
			this.raceTable.createMetaraces();
			EntityManagerFactory factory1 = Persistence.createEntityManagerFactory("metaraces");
			EntityManager em = factory1.createEntityManager();
			// create new Attribut Set
			createMetaAttribute(em, 24, 8, CategoryType.A);
			createMetaAttribute(em, 20, 8, CategoryType.B);
			createMetaAttribute(em, 16, 8, CategoryType.C);
			createMetaAttribute(em, 14, 8, CategoryType.D);
			createMetaAttribute(em, 12, 8, CategoryType.E);

			createMetaListElement(em, "A", "Konstitution");
			createMetaListElement(em, "A", "Geschicklichtkeit");
			createMetaListElement(em, "A", "Reaktion");
			createMetaListElement(em, "A", "Stärke");
			createMetaListElement(em, "A", "Willensstärke");
			createMetaListElement(em, "A", "Logik");
			createMetaListElement(em, "A", "Intuition");
			createMetaListElement(em, "A", "Charisma");
			createMetaListElement(em, "A", "Edge");
			createMetaListElement(em, "A", "Magie");
		}
	}

	private void createMetaListElement(EntityManager em, String type, String name) {
		em.getTransaction().begin();
		MetaListElement element = new MetaListElement();
		element.setElementType(type);
		element.setElementName(name);
		em.persist(element);
		em.getTransaction().commit();
	}

	private void createMetaAttribute(EntityManager em, int points, int max, CategoryType type) {
		em.getTransaction().begin();
		MetaAttributes attribut = new MetaAttributes();
		attribut.setAttribut(points);
		attribut.setMaxAttribut(max);
		attribut.setRelatedCategory(type);
		em.persist(attribut);
		em.getTransaction().commit();
	}

}
