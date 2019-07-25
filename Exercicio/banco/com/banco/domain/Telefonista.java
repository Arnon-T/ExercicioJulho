package com.banco.domain;

public class Telefonista extends Funcionario{

	private int codigoEstacao;
	
	public Telefonista(String nome, double salario, int codigoEstacao){		
		this.setNomeFunc(nome);
		this.setSalarioFunc(salario);
		this.codigoEstacao 	= codigoEstacao;
	}

	public int getCodigoEstacao() {
		return codigoEstacao;
	}

	public void setCodigoEstacao(int codigoEstacao) {
		this.codigoEstacao = codigoEstacao;
	}		
	
}
