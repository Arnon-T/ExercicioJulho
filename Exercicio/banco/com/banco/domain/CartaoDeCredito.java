package com.banco.domain;

/**
 * 
 * Implementa Classe CartaoDeCredito. Quest�o 04.
 * 
 * @author Arnon
 *
 */

public class CartaoDeCredito {
	
	private int 	numeroCC;
	private String 	validadeCC;
	private Cliente clienteCC;
	
	/*
	 * Testes propostos nos exerc�cios 32-34 contemplados pela constru��o inicial da classe.
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
