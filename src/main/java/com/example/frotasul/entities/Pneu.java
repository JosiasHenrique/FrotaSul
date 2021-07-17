package com.example.frotasul.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.frotasul.enums.CondicaoPneu;
import com.example.frotasul.enums.TipoPneu;

@Entity
@Table(name = "Pneu")
public class Pneu {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Pneu other = (Pneu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
