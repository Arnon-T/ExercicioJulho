package com.banco.domain;

/**
 * 
 * Implementa Classe CartaoDeCredito. Quest�o 04.
 * 
 * @author Arnon
 *
 */

public class CartaoDeCredito {
	public	int 	numeroCC;
	public	String 	validadeCC;
	public	Cliente clienteCC;
	
	/*
	 * Testes propostos nos exerc�cios 32-34 contemplados pela constru��o inicial da classe.
	 */
	
	CartaoDeCredito(int numeroCC, String validadeCC, Cliente clienteCC){
		
		this.clienteCC	= clienteCC;
		this.numeroCC	= numeroCC;
		this.validadeCC = validadeCC;
		
	}
}
