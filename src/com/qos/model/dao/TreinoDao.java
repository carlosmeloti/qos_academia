package com.qos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qos.model.model.Treino;

public class TreinoDao implements TreinoDaoInterface{
	
	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;
	
	@Override
	public Treino salvarTreino(Treino treino) {
		entityManager.persist(treino);
		return treino;
	}

	@Override
	public void alterarTreino(Treino treino) {
		Treino treinoMerge = entityManager.merge(treino);
		entityManager.persist(treinoMerge);
		
	}

	@Override
	public void excluirTreino(Treino treino) {
		Treino treinoMerge = entityManager.merge(treino);
		entityManager.remove(treinoMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Treino> getTreinos() {
		Query query = entityManager.createQuery("from Treino");
		return query.getResultList();
	}

}
