package com.qos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qos.model.model.Matricula;



public class MatriculaDao implements MatriculaDaoInterface{
	
	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;
	
	@Override
	public Matricula salvarMatricula(Matricula matricula) {
		entityManager.persist(matricula);
		return matricula;
	}
	
	@Override
	public void alterarMatricula(Matricula matricula) {
		Matricula matriculaMerge = entityManager.merge(matricula);
		entityManager.persist(matriculaMerge);
		
	}
	
	@Override
	public void excluirMatricula(Matricula matricula) {
		Matricula matriculaMerge = entityManager.merge(matricula);
		entityManager.remove(matriculaMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Matricula> getMatriculas() {
		Query query = entityManager.createQuery("from Matricula");
		return query.getResultList();
	}
	
	

}
