package de.shadowrunrpg.nscrg.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import de.shadowrunrpg.nscrg.core.constances.CategoryType;
import de.shadowrunrpg.nscrg.core.dto.MetaAttributes;

public class AttributTableDAO {
	private EntityManagerFactory factory;

	public MetaAttributes getAttributDTO(CategoryType category) {
		factory = Persistence.createEntityManagerFactory("metaraces");
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		Query q = em.createNamedQuery("AttributTableDAO.getSpecificAttribut");
		q.setParameter("category", category);
		@SuppressWarnings("unchecked")
		List<MetaAttributes> resultList = (List<MetaAttributes>) q.getResultList();

		em.close();
		return resultList.get(0);
	}
}
