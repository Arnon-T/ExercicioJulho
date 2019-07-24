package com.banco.domain;

/**
 * 
 * Implementa classe Cliente. Questão 02.
 * 
 * @author Arnon
 *
 * */

public class Cliente {
	private String 	nomeCliente;
	private int		codigoCliente;

	Cliente (String nomeCliente, int codigoCliente){
		this.nomeCliente	= nomeCliente;
		this.codigoCliente	= codigoCliente; 
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
			
}

