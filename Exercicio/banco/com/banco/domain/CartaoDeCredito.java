package com.banco.domain;

/**
 * 
 * Implementa Classe CartaoDeCredito. Questão 04.
 * 
 * @author Arnon
 *
 */

public class CartaoDeCredito {
	public	int 	numeroCC;
	public	String 	validadeCC;
	public	Cliente clienteCC;
	
	CartaoDeCredito(int numeroCC, String validadeCC, Cliente clienteCC){
		
		this.clienteCC	= clienteCC;
		this.numeroCC	= numeroCC;
		this.validadeCC = validadeCC;
		
	}
}
