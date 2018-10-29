package com.qos.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.qos.model.model.Empresa;

public class EmpresaDao implements EmpresaDaoInterface {

	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;
	
	@Override
	public Empresa salvarEmpresa(Empresa empresa) {
		entityManager.persist(empresa);
		return empresa;
	}

	@Override
	public void alterarEmpresa(Empresa empresa) {
		Empresa empresaMerge = entityManager.merge(empresa);
		entityManager.persist(empresaMerge);
		
	}

	@Override
	public void excluirEmpresa(Empresa empresa) {
		Empresa empresaMerge = entityManager.merge(empresa);
		entityManager.remove(empresaMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Empresa> getEmpresas() {
		Query query = entityManager.createQuery("from Empresa");
		return query.getResultList();
		
	}

}
