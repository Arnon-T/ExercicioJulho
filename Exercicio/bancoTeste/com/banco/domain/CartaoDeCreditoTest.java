package com.banco.domain;

public class CartaoDeCreditoTest {

	public static void main(String[] args) {

		Cliente cliente01 = new Cliente("Cliente Teste 01", 11);
		Cliente cliente02 = new Cliente("Cliente Teste 02", 22);
		
		CartaoDeCredito cartao01 = new CartaoDeCredito(11111111, "31/01/2020", cliente01);
		CartaoDeCredito cartao02 = new CartaoDeCredito(22222222, "29/02/2020", cliente02);
		
		System.out.printf("Cartão número: %d, validade %s. Cliente: %s. No Cliente: %d.\n", cartao01.getNumeroCC(), cartao01.getValidadeCC(), cartao01.getClienteCC().getNomeCliente(), cartao01.getClienteCC().getCodigoCliente());
		System.out.printf("Cartão número: %d, validade %s. Cliente: %s. No Cliente: %d.\n", cartao02.getNumeroCC(), cartao02.getValidadeCC(), cartao02.getClienteCC().getNomeCliente(), cartao02.getClienteCC().getCodigoCliente());
		
	}

}
