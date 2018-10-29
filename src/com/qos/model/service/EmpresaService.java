package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qos.model.dao.EmpresaDaoInterface;
import com.qos.model.model.Empresa;

public class EmpresaService implements EmpresaServiceInterface {
	
	@Inject
	private EmpresaDaoInterface empresaDaoInterface;

	@Override
	@Transactional
	public Empresa salvarEmpresa(Empresa empresa) {
		return empresaDaoInterface.salvarEmpresa(empresa);
	}

	@Override
	@Transactional
	public void alterarEmpresa(Empresa empresa) {
		empresaDaoInterface.alterarEmpresa(empresa);
		
	}

	@Override
	@Transactional
	public void excluirEmpresa(Empresa empresa) {
		empresaDaoInterface.excluirEmpresa(empresa);
		
	}

	@Override
	public List<Empresa> getEmpresas() {
		return empresaDaoInterface.getEmpresas();
	}

}
