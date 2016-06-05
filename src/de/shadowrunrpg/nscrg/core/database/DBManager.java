package de.shadowrunrpg.nscrg.core.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import de.shadowrunrpg.nscrg.core.entities.Metarace;

public class DBManager {
	private static EntityManagerFactory factory;
	
	public DBManager(boolean init) {

		if (init == true) {
			 InitDatabase initProcess = new InitDatabase();
			 initProcess.run(factory);
		}
	}

	public List<String> getRaces() {
		List<String> resultList = new ArrayList<String>();
		factory = Persistence.createEntityManagerFactory("metaraces");
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		Query q = em.createQuery("SELECT t FROM Metarace t");
		@SuppressWarnings("unchecked")
		List<Metarace> todoList = q.getResultList();
		for (Metarace todo : todoList) {
			resultList.add(todo.getRaceName());
		}
		em.close();		
		return resultList;
	}
}
