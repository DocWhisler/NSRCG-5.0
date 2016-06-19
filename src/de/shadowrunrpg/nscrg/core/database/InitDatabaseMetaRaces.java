package de.shadowrunrpg.nscrg.core.database;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.shadowrunrpg.nscrg.core.dto.Metarace;
import de.shadowrunrpg.nscrg.core.dto.MetaraceCategory;

public class InitDatabaseMetaRaces {
	public EntityManagerFactory factory;
	public String metaRaceTableName;

	public InitDatabaseMetaRaces(String metaRaceTableName) {
		this.metaRaceTableName = metaRaceTableName;
	}

	boolean CheckIfTableHasEntries(String metaRaceTableName) {
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory(metaRaceTableName);
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		Query q = em.createQuery("SELECT t FROM Metarace t");
		@SuppressWarnings("unchecked")
		List<Metarace> todoList = q.getResultList();
		if (todoList.size() > 0) {
			return true;
		}
		return false;
	}

	void createMetaraces() {
		factory = Persistence.createEntityManagerFactory("metaraces");
		EntityManager em = factory.createEntityManager();

		// create new Race
		em.getTransaction().begin();
		Metarace race = new Metarace();
		createRaceCategory(em, race, "A", 5);
		createRaceCategory(em, race, "B", 0);
		race.setRaceName("Troll");
		race.setLanguage("de");
		em.persist(race);
		em.getTransaction().commit();

		em.getTransaction().begin();
		race = new Metarace();
		createRaceCategory(em, race, "A", 8);
		createRaceCategory(em, race, "B", 6);
		createRaceCategory(em, race, "C", 3);
		createRaceCategory(em, race, "D", 0);
		race.setRaceName("Elf");
		race.setLanguage("de");
		em.persist(race);
		em.getTransaction().commit();

		em.getTransaction().begin();
		race = new Metarace();
		createRaceCategory(em, race, "A", 9);
		createRaceCategory(em, race, "B", 7);
		createRaceCategory(em, race, "C", 5);
		createRaceCategory(em, race, "D", 3);
		createRaceCategory(em, race, "E", 1);
		race.setRaceName("Mensch");
		race.setLanguage("de");
		em.persist(race);
		em.getTransaction().commit();

		em.getTransaction().begin();
		race = new Metarace();
		createRaceCategory(em, race, "A", 7);
		createRaceCategory(em, race, "B", 4);
		createRaceCategory(em, race, "C", 1);
		race.setRaceName("Zwerg");
		race.setLanguage("de");
		em.persist(race);
		em.getTransaction().commit();

		em.getTransaction().begin();
		race = new Metarace();
		createRaceCategory(em, race, "A", 7);
		createRaceCategory(em, race, "B", 4);
		createRaceCategory(em, race, "C", 0);
		race.setRaceName("Ork");
		race.setLanguage("de");
		em.persist(race);
		em.getTransaction().commit();

	}

	private void createRaceCategory(EntityManager em, Metarace race, String categoryType, int points) {
		MetaraceCategory category = new MetaraceCategory();
		category.setCategory(categoryType);
		category.setFreePoints(points);
		category.setConnectedRace(race);
		race.getCategories().add(category);
		em.persist(category);
		em.persist(race);
	}
}