package com.qos.model.service;

import java.util.List;

import com.qos.model.model.ContasAPagar;

public interface ContasAPagarServiceInterface {
	
	ContasAPagar salvarContasAPagar(ContasAPagar contasAPagar); 
	void alterarContasAPagar(ContasAPagar contasAPagar);
	void excluirContasAPagar(ContasAPagar contasAPagar);
	List<ContasAPagar> getContasAPagar();

}
