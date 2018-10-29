package com.qos.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="convenio")
public class Convenio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="conv_id")
	private long id;
	
	@Column(name="conv_nomeConvenio", length=50, nullable=true)
	private String nomeConvenio;
	
	@Column(name="conv_quantidadeDeAlunos", length=50, nullable=true)
	private int quantidadeDeAlunos;
	
	@ManyToOne
	@JoinColumn(name="emp_id", referencedColumnName="emp_id")
	Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name="pla_id", referencedColumnName="pla_id")
	Plano plano;
	
	@Column(name="conv_desconto", length=50, nullable=true)
	private Double descontoConv;
	
	
	
	
	
	public Convenio() {
	}
	
	public Convenio(long id, String nomeConvenio, int quantidadeDeAlunos, Empresa empresa, Plano plano, Double descontoConv) {
		this.id = id;
		this.nomeConvenio = nomeConvenio;
		this.quantidadeDeAlunos = quantidadeDeAlunos;
		this.empresa = empresa;
		this.plano = plano;
		this.descontoConv = descontoConv;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNomeConvenio() {
		return nomeConvenio;
	}

	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}

	public int getQuantidadeDeAlunos() {
		return quantidadeDeAlunos;
	}
	public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Plano getPlano() {
		
		return plano;
	}
	public void setPlano(Plano plano) {
		
		this.plano = plano;
	}
	public Double getDescontoConv() {
		return descontoConv;
	}
	public void setDescontoConv(Double descontoConv) {
		this.descontoConv = descontoConv;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convenio other = (Convenio) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
