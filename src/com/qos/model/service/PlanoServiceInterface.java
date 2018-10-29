package com.qos.model.service;

import java.util.List;

import com.qos.model.model.Plano;

public interface PlanoServiceInterface {

	Plano salvarPlano(Plano plano); 
	void alterarPlano(Plano plano); 
	void excluirPlano(Plano plano);
	List<Plano> getPlanos();
}
