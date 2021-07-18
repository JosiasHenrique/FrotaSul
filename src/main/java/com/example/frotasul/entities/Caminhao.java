package com.example.frotasul.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Caminhao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String placa;
	private String modelo;
	
	@OneToMany
	private List<Pneu> pneusCaminhao = new ArrayList<>();
	
	@OneToOne
	private Carreta carreta;
	
	@OneToOne
	private Motorista motorista;
	
	public Caminhao() {
		
	}

	public Caminhao(Long id, String placa, String modelo, Carreta carreta, Motorista motorista) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.carreta = carreta;
		this.motorista = motorista;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Carreta getCarreta() {
		return carreta;
	}

	public void setCarreta(Carreta carreta) {
		this.carreta = carreta;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public List<Pneu> getPneusCaminhao() {
		return pneusCaminhao;
	}
	
}
