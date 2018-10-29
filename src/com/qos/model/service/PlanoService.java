package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qos.model.dao.PlanoDaoInterface;
import com.qos.model.model.Plano;

public class PlanoService implements PlanoServiceInterface {

	
	@Inject
	private PlanoDaoInterface planoDaoInterface;
	
	

	@Override
	@Transactional
	public Plano salvarPlano(Plano plano) {
		
		plano.calcularValorTotal();
		return planoDaoInterface.salvarPlano(plano);
	}

	@Override
	@Transactional
	public void alterarPlano(Plano plano) {
		planoDaoInterface.alterarPlano(plano);
		
	}

	@Override
	@Transactional
	public void excluirPlano(Plano plano) {
		planoDaoInterface.excluirPlano(plano);
		
	}

	@Override
	public List<Plano> getPlanos() {
		return planoDaoInterface.getPlanos();
		
	}
	
		
}
