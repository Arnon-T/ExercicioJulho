package com.banco.domain;

/**
 * 
 * Implementa Classe CartaoDeCredito. Questão 04.
 * 
 * @author Arnon
 *
 */

public class CartaoDeCredito {
	
	private int 	numeroCC;
	private String 	validadeCC;
	private Cliente clienteCC;
	
	/*
	 * Testes propostos nos exercícios 32-34 contemplados pela construção inicial da classe.
	 */
	
	CartaoDeCredito(int numeroCC, String validadeCC, Cliente clienteCC){
		
		this.clienteCC	= clienteCC;
		this.numeroCC	= numeroCC;
		this.validadeCC = validadeCC;
		
	}

	public int getNumeroCC() {
		return numeroCC;
	}

	public void setNumeroCC(int numeroCC) {
		this.numeroCC = numeroCC;
	}

	public String getValidadeCC() {
		return validadeCC;
	}

	public void setValidadeCC(String validadeCC) {
		this.validadeCC = validadeCC;
	}

	public Cliente getClienteCC() {
		return clienteCC;
	}

	public void setClienteCC(Cliente clienteCC) {
		this.clienteCC = clienteCC;
	}	
	
}
