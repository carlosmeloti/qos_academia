package com.qos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.qos.model.model.Modalidade;

public class ModalidadeDao implements ModalidadeDaoInterface {

	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;

	@Override
	public Modalidade salvarModalidade(Modalidade modalidade) {
		entityManager.persist(modalidade);
		return modalidade;
	}

	@Override
	public void alterarModalidade(Modalidade modalidade) {
		Modalidade modalidadeMerge = entityManager.merge(modalidade);
		entityManager.persist(modalidadeMerge);
		
	}

	@Override
	public void excluirModalidade(Modalidade modalidade) {
		Modalidade modalidadeMerge = entityManager.merge(modalidade);
		entityManager.remove(modalidadeMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Modalidade> getModalidades() {
		Query query = entityManager.createQuery("from Modalidade");
		return query.getResultList();
	}
	

}
