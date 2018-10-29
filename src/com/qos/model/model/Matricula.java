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
@Table(name="matricula")
public class Matricula implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="mat_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="alu_id", referencedColumnName="alu_id")
	Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name="pla_id", referencedColumnName="pla_id")
	Plano plano;
	
	@ManyToOne
	@JoinColumn(name="conv_id", referencedColumnName="conv_id")
	Convenio convenio;
	
	@Column(name="mat_formaPagamentp", length=50, nullable=true)
	private String formaPagamento;
	
	@Column(name="mat_dataVencimento", length=50, nullable=true)
	private String dataVencimento;
	
	@Column(name="mat_valor", length=50, nullable=true)
	private Double valor;
	
	@Column(name="mat_descricao", columnDefinition="TEXT", nullable=true)
	private String descricao;
	
	

	public Matricula() {
	}

	public Matricula(long id, Aluno aluno, Plano plano, Convenio convenio, String formaPagamento, String dataVencimento,
			Double valor, String descricao) {
		this.id = id;
		this.aluno = aluno;
		this.plano = plano;
		this.convenio = convenio;
		this.formaPagamento = formaPagamento;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Matricula other = (Matricula) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
