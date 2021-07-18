package com.example.frotasul.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abastecimento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date data;
	private String posto;
	private Integer kmAnt, kmAtual;
	private Double qtdLt, valorComb;

	public Abastecimento() {}

	public Abastecimento(Long id, Date data, String posto, Integer kmAnt, Integer kmAtual, Double qtdLt,
			Double valorComb) {
		super();
		this.id = id;
		this.data = data;
		this.posto = posto;
		this.kmAnt = kmAnt;
		this.kmAtual = kmAtual;
		this.qtdLt = qtdLt;
		this.valorComb = valorComb;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getPosto() {
		return posto;
	}

	public void setPosto(String posto) {
		this.posto = posto;
	}

	public Integer getKmAnt() {
		return kmAnt;
	}

	public void setKmAnt(Integer kmAnt) {
		this.kmAnt = kmAnt;
	}

	public Integer getKmAtual() {
		return kmAtual;
	}

	public void setKmAtual(Integer kmAtual) {
		this.kmAtual = kmAtual;
	}

	public Double getQtdLt() {
		return qtdLt;
	}

	public void setQtdLt(Double qtdLt) {
		this.qtdLt = qtdLt;
	}

	public Double getValorComb() {
		return valorComb;
	}

	public void setValorComb(Double valorComb) {
		this.valorComb = valorComb;
	}
	
	public Double getMedia() {
		double media = (this.kmAtual - this.kmAnt) / this.qtdLt;
		return media;
	}
}
