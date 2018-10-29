package com.qos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.qos.model.model.Aluno;

public class AlunoDao implements AlunoDaoInterface {
	
	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;

	@Override
	public Aluno salvarAluno(Aluno aluno) {
		entityManager.persist(aluno);
		return aluno;
	}

	@Override
	public void alterarAluno(Aluno aluno) {
		Aluno alunoMerge = entityManager.merge(aluno);
		entityManager.persist(alunoMerge);
		
	}

	@Override
	public void excluirAluno(Aluno aluno) {
		Aluno alunoMerge = entityManager.merge(aluno);
		entityManager.remove(alunoMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Aluno> getAlunos() {
		Query query = entityManager.createQuery("from Aluno");
		return query.getResultList();
	}

}
