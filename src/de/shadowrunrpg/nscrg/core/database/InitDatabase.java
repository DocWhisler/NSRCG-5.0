package de.shadowrunrpg.nscrg.core.database;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.shadowrunrpg.nscrg.core.entities.Metarace;

public class InitDatabase {

	private EntityManagerFactory factory = null;

	public void run(EntityManagerFactory factory) {
		this.factory = factory;
		
		String metaRaceTableName = "metaraces";
		
		if(CheckIfTableHasEntries(metaRaceTableName) == false) {
			this.createMetaraces();
		};
		
	}

	private boolean CheckIfTableHasEntries(String metaRaceTableName) {
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory(metaRaceTableName);
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		Query q = em.createQuery("SELECT t FROM Metarace t");
		@SuppressWarnings("unchecked")
		List<Metarace> todoList = q.getResultList();
		if(todoList.size() >0) {
			return true;
		}
		return false;
	}

	private void createMetaraces() {
		factory = Persistence.createEntityManagerFactory("metaraces");
		EntityManager em = factory.createEntityManager();
		// create new Race
		em.getTransaction().begin();
		Metarace todo = new Metarace();
		todo.setRaceName("Troll");
		todo.setLanguage("de");
		em.persist(todo);
		em.getTransaction().commit();

		em.getTransaction().begin();
		todo = new Metarace();
		todo.setRaceName("Elf");
		todo.setLanguage("de");
		em.persist(todo);
		em.getTransaction().commit();

		em.getTransaction().begin();
		todo = new Metarace();
		todo.setRaceName("Mensch");
		todo.setLanguage("de");
		em.persist(todo);
		em.getTransaction().commit();

		em.getTransaction().begin();
		todo = new Metarace();
		todo.setRaceName("Zwerg");
		todo.setLanguage("de");
		em.persist(todo);
		em.getTransaction().commit();

		em.getTransaction().begin();
		todo = new Metarace();
		todo.setRaceName("Ork");
		todo.setLanguage("de");
		em.persist(todo);
		em.getTransaction().commit();

	}
}
