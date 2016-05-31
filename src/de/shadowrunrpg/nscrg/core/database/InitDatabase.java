package de.shadowrunrpg.nscrg.core.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.shadowrunrpg.nscrg.core.entities.Metarace;

public class InitDatabase {

	private EntityManagerFactory factory = null;
	
	public void run(EntityManagerFactory factory) {
		this.factory = factory;
		this.createMetaraces();
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
