package com.banco.domain;

public class CartaoDeCreditoTest {

	public static void main(String[] args) {

		CartaoDeCredito cartao01 = new CartaoDeCredito(11111111, "31/01/2020");
		CartaoDeCredito cartao02 = new CartaoDeCredito(22222222, "29/02/2020");
		
		System.out.printf("Cartão número: %d, validade %s.\n", cartao01.numeroCC, cartao01.validadeCC);
		System.out.printf("Cartão número: %d, validade %s.\n", cartao02.numeroCC, cartao02.validadeCC);
		
	}

}
