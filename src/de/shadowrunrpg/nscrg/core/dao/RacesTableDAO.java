package de.shadowrunrpg.nscrg.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.shadowrunrpg.nscrg.core.dto.Metarace;

public class RacesTableDAO {

	private EntityManagerFactory factory;

	public List<Metarace> getRaceDTO(String category) {
		factory = Persistence.createEntityManagerFactory("metaraces");
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		Query q;
		if (category == null) {
			q = em.createNamedQuery("RacesTableDAO.getAllRaces");
		} else {
			q = em.createNamedQuery("RacesTableDAO.getSpecificRaces");
			q.setParameter("category", category);
		}
		@SuppressWarnings("unchecked")
		List<Metarace> resultList = (List<Metarace>) q.getResultList();

		em.close();
		return resultList;
	}
}
