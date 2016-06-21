package de.shadowrunrpg.nscrg.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.shadowrunrpg.nscrg.core.dto.MetaListElement;

public class ListTableDAO {
	private EntityManagerFactory factory;

	public List<MetaListElement> getList(String type) {
		factory = Persistence.createEntityManagerFactory("metaraces");
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		Query q;
		q = em.createNamedQuery("ListDAO.getSpecificList");
		q.setParameter("type", type);
		@SuppressWarnings("unchecked")
		List<MetaListElement> resultList = (List<MetaListElement>) q.getResultList();

		em.close();
		return resultList;
	}

}
