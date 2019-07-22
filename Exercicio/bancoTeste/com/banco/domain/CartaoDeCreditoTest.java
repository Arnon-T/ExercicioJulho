package com.banco.domain;

public class CartaoDeCreditoTest {

	public static void main(String[] args) {

		Cliente cliente01 = new Cliente("Cliente Teste 01", 11);
		Cliente cliente02 = new Cliente("Cliente Teste 02", 22);
		
		CartaoDeCredito cartao01 = new CartaoDeCredito(11111111, "31/01/2020", cliente01);
		CartaoDeCredito cartao02 = new CartaoDeCredito(22222222, "29/02/2020", cliente02);
		
		System.out.printf("Cartão número: %d, validade %s. Cliente: %s. No Cliente: %d.\n", cartao01.numeroCC, cartao01.validadeCC, cartao01.clienteCC.nomeCliente, cartao01.clienteCC.codigoCliente);
		System.out.printf("Cartão número: %d, validade %s. Cliente: %s. No Cliente: %d.\n", cartao02.numeroCC, cartao02.validadeCC, cartao02.clienteCC.nomeCliente, cartao02.clienteCC.codigoCliente);
		
	}

}
