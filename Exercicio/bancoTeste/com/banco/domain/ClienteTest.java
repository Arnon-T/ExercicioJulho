package com.banco.domain;

/**
 * 
 * Testes Classe Cliente.
 * 
 * @author Arnon
 *
 */

public class ClienteTest {

	public static void main(String[] args) {

/*-
 * Testes referentes � quest�o 3.
 */
		
	Cliente cliente01 = new Cliente("ClienteTeste01", 1);
	Cliente cliente02 = new Cliente("ClienteTeste02", 2);
	
	System.out.printf("Cliente %s, c�digo: %d.\n", cliente01.getNomeCliente() , cliente01.getCodigoCliente());
	System.out.printf("Cliente %s, c�digo: %d.\n", cliente02.getNomeCliente() , cliente02.getCodigoCliente());
	
	}	
}
