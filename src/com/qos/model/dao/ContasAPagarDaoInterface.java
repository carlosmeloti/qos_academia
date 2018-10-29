package com.qos.model.dao;

import java.util.List;

import com.qos.model.model.ContasAPagar;

public interface ContasAPagarDaoInterface {
	
	ContasAPagar salvarContasAPagar(ContasAPagar contasAPagar); 
	void alterarContasAPagar(ContasAPagar contasAPagar);
	void excluirContasAPagar(ContasAPagar contasAPagar);
	List<ContasAPagar> getContasAPagar();

}
