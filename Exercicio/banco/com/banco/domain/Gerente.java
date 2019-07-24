package com.banco.domain;

public class Gerente {
	private String nomeGerente;
	private double salarioGerente;
	
	public Gerente(String nomeGerente, double salarioGerente) {
		this.nomeGerente	= nomeGerente;
		this.salarioGerente	= salarioGerente;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}

	public double getSalarioGerente() {
		return salarioGerente;
	}

	public void setSalarioGerente(double salarioGerente) {
		this.salarioGerente = salarioGerente;
	}	
	
}
