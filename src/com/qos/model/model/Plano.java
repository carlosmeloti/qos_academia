package com.qos.model.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="plano")
public class Plano implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="pla_id")
	private long id;
	
	@Column(name="pla_nomePlano", length=50, nullable=false)
	private String nomePlano;
	
	@Column(name="pla_valor", length=50, nullable=false)
	Double valor;
	
	@Column(name="pla_desconto", length=50, nullable=true)
	private Double desconto;
	
	@Column(name="pla_valorTotal", length=50, nullable=true)
	private Double valorTotal;
	
	@Column(name="pla_descricao", columnDefinition="TEXT", nullable=true)
	private String descricao;
	
	
	public void calcularValorTotal(){
		valorTotal = valor - desconto;
	}
	
	

	public Plano() {
	}



	public Plano(long id, String nomePlano, Double valor, Double desconto, Double valorTotal, String descricao) {
		super();
		this.id = id;
		this.nomePlano = nomePlano;
		this.valor = valor;
		this.desconto = desconto;
		this.valorTotal = valorTotal;
		this.descricao = descricao;
		
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNomePlano() {
		return nomePlano;
	}



	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}



	public Double getDesconto() {
		return desconto;
	}



	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}



	public Double getValorTotal() {
		
		valorTotal = valor - desconto;
		
		return valorTotal;
	}



	public void setValorTotal(Double valorTotal) {
		
		valorTotal = valor - desconto;
		
		this.valorTotal = valorTotal;
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
		Plano other = (Plano) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}

	
	