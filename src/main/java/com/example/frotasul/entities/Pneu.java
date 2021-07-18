package com.example.frotasul.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.frotasul.enums.CondicaoPneu;
import com.example.frotasul.enums.TipoPneu;

@Entity
@Table(name = "Pneu")
public class Pneu implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer numeroFogo;
	private String dot;
	private TipoPneu tipoPneu;
	private CondicaoPneu condPneu;
	
	public Pneu() {
		
	}

	public Pneu(Long id, Integer numeroFogo, String dot, TipoPneu tipoPneu, CondicaoPneu condPneu) {
		super();
		this.id = id;
		this.numeroFogo = numeroFogo;
		this.dot = dot;
		this.tipoPneu = tipoPneu;
		this.condPneu = condPneu;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumeroFogo() {
		return numeroFogo;
	}

	public void setNumeroFogo(Integer numeroFogo) {
		this.numeroFogo = numeroFogo;
	}

	public String getDot() {
		return dot;
	}

	public void setDot(String dot) {
		this.dot = dot;
	}

	public TipoPneu getTipoPneu() {
		return tipoPneu;
	}

	public void setTipoPneu(TipoPneu tipoPneu) {
		this.tipoPneu = tipoPneu;
	}

	public CondicaoPneu getCondPneu() {
		return condPneu;
	}

	public void setCondPneu(CondicaoPneu condPneu) {
		this.condPneu = condPneu;
	}
	
}
