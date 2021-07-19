package com.example.frotasul.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.frotasul.enums.StatusViagem;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Viagem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date data;
	private String origem, destino;
	private Integer kmSaida, kmChegada;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "caminhao_id")
	private Caminhao caminhao;
	private String numDanfe, numCte;
	private Double valorFrete;
	private StatusViagem status;
	
	public Viagem() {
		
	}

	public Viagem(Long id, Date data, String origem, String destino, Integer kmSaida, Caminhao caminhao,
			Double valorFrete, StatusViagem status) {
		super();
		this.id = id;
		this.data = data;
		this.origem = origem;
		this.destino = destino;
		this.kmSaida = kmSaida;
		this.caminhao = caminhao;
		this.valorFrete = valorFrete;
		this.status = status;
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

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Integer getKmSaida() {
		return kmSaida;
	}

	public void setKmSaida(Integer kmSaida) {
		this.kmSaida = kmSaida;
	}

	public Integer getKmChegada() {
		return kmChegada;
	}

	public void setKmChegada(Integer kmChegada) {
		this.kmChegada = kmChegada;
	}

	public Caminhao getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
	}

	public String getNumDanfe() {
		return numDanfe;
	}

	public void setNumDanfe(String numDanfe) {
		this.numDanfe = numDanfe;
	}

	public String getNumCte() {
		return numCte;
	}

	public void setNumCte(String numCte) {
		this.numCte = numCte;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public StatusViagem getStatus() {
		return status;
	}

	public void setStatus(StatusViagem status) {
		this.status = status;
	}
	
	public Double getKmPercorrido() {
		double kmPercorrido = this.kmChegada - this.kmSaida ;
		return kmPercorrido;
	}

}
