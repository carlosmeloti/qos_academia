package com.qos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qos.model.model.Fornecedor;

public class FornecedorDao implements FornecedorDaoInterface {

	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;
	
	@Override
	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		entityManager.persist(fornecedor);
		return fornecedor;
	}

	@Override
	public void alterarFornecedor(Fornecedor fornecedor) {
		Fornecedor fornecedorMerge = entityManager.merge(fornecedor);
		entityManager.persist(fornecedorMerge);
		
	}

	@Override
	public void excluirFornecedor(Fornecedor fornecedor) {
		Fornecedor fornecedorMerge = entityManager.merge(fornecedor);
		entityManager.remove(fornecedorMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Fornecedor> getFornecedores() {
		Query query = entityManager.createQuery("from Fornecedor");
		return query.getResultList();
	}

}
