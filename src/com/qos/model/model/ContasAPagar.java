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
@Table(name="contasAPagar")
public class ContasAPagar implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="contPag_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="for_id", referencedColumnName="for_id")
	Fornecedor fornecedor;
	
	@Column(name="contPag_centroDeCusto", length=50, nullable=true)
	private String centroDeCusto;
	
	@Column(name="contPag_dataEmissao", length=50, nullable=false)
    private String dataEmissao;
	
	@Column(name="contPag_dataVencimento", length=50, nullable=false)
    private String dataVencimento;
	
	@Column(name="contPag_numeroDocumento", length=50, nullable=true)
    private String numeroDocumento;
	
	@Column(name="contPag_valorDocumento", length=50, nullable=false)
	Double valorDocumento;
	
	@Column(name="contPag_acrescimo", length=50, nullable=true)
	Double acrescimo;
	
	@Column(name="contPag_descontos", length=50, nullable=true)
	Double descontos;
	
	@Column(name="contPag_valorPago", length=50, nullable=false)
	Double valorPago;
	
	@Column(name="contPag_descricao", columnDefinition="TEXT", nullable=true)
	private String descricao;
	
	

	public ContasAPagar() {
	}

	public ContasAPagar(long id, Fornecedor fornecedor, String centroDeCusto, String dataEmissao, String dataVencimento,
			String numeroDocumento, Double valorDocumento, Double acrescimo, Double descontos, Double valorPago,
			String descricao) {
		this.id = id;
		this.fornecedor = fornecedor;
		this.centroDeCusto = centroDeCusto;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.numeroDocumento = numeroDocumento;
		this.valorDocumento = valorDocumento;
		this.acrescimo = acrescimo;
		this.descontos = descontos;
		this.valorPago = valorPago;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getCentroDeCusto() {
		return centroDeCusto;
	}

	public void setCentroDeCusto(String centroDeCusto) {
		this.centroDeCusto = centroDeCusto;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Double getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(Double valorDocumento) {
		this.valorDocumento = valorDocumento;
	}

	public Double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Double acrescimo) {
		this.acrescimo = acrescimo;
	}

	public Double getDescontos() {
		return descontos;
	}

	public void setDescontos(Double descontos) {
		this.descontos = descontos;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
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
		ContasAPagar other = (ContasAPagar) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
