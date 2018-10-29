package com.qos.model.dao;

import java.util.List;

import com.qos.model.model.Plano;

public interface PlanoDaoInterface {
	
	Plano salvarPlano(Plano plano); 
	void alterarPlano(Plano plano); 
	void excluirPlano(Plano plano);
	List<Plano> getPlanos();

}
