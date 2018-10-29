package com.qos.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qos.model.model.Convenio;

public class ConvenioDao implements ConvenioDaoInterface{

	@PersistenceContext(unitName="QoS_Academia")
	private EntityManager entityManager;
	
	@Override
	public Convenio salvarConvenio(Convenio convenio) {
		entityManager.persist(convenio);
		return convenio;
	}

	@Override
	public void alterarConvenio(Convenio convenio) {
		Convenio convenioMerge = entityManager.merge(convenio);
		entityManager.persist(convenioMerge);
		
	}

	@Override
	public void excluirConvenio(Convenio convenio) {
		Convenio convenioMerge = entityManager.merge(convenio);
		entityManager.remove(convenioMerge);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Convenio> getConvenios() {
		Query query = entityManager.createQuery("from Convenio");
		return query.getResultList();
	}

}
