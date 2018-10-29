package com.qos.model.service;

import java.util.List;

import com.qos.model.model.Empresa;

public interface EmpresaServiceInterface {

	Empresa salvarEmpresa(Empresa empresa); 
	void alterarEmpresa(Empresa empresa);
	void excluirEmpresa(Empresa empresa);
	List<Empresa> getEmpresas();
	
}
