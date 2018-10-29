package com.qos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qos.model.model.Plano;

public class PlanoDao implements PlanoDaoInterface {

	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;
	
	@Override
	public Plano salvarPlano(Plano plano) {
		entityManager.persist(plano);
		return plano;
	}

	@Override
	public void alterarPlano(Plano plano) {
		Plano planoMerge = entityManager.merge(plano);
		entityManager.persist(planoMerge);
		
	}

	@Override
	public void excluirPlano(Plano plano) {
		Plano planoMerge = entityManager.merge(plano);
		entityManager.remove(planoMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Plano> getPlanos() {
		Query query = entityManager.createQuery("from Plano");
		return query.getResultList();
	}

}
