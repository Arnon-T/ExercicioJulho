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
	
	System.out.printf("Cliente %s, c�digo: %d.\n", cliente01.nomeCliente , cliente01.codigoCliente);
	System.out.printf("Cliente %s, c�digo: %d.\n", cliente02.nomeCliente , cliente02.codigoCliente);
	
	}	
}
