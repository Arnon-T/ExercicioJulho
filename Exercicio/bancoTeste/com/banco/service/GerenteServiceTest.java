package com.banco.service;

import com.banco.domain.Gerente;

public class GerenteServiceTest {

	public static void main(String[] args) {
		
		Gerente gerente01 = new Gerente("Gerente Teste 01", 10000.00, "user", "password");
		Gerente gerente02 = new Gerente("Gerente Teste 02", 20000.00, "user", "password");

		System.out.printf("Bonificação Gerente: R$%f.\n", GerenteService.calculaBonificacao(gerente01));
		System.out.printf("Bonificação Gerente: R$%f.\n", GerenteService.calculaBonificacao(gerente02));
		
		
/*
 * Código suprimido após questão 68.
 */
		
//		System.out.println(GerenteService.consultaGerente(gerente01));
//		System.out.println(GerenteService.consultaGerente(gerente02));
//		
//		GerenteService.aumentoPadraoGerente(gerente01);
//		GerenteService.aumentoVariavelGerente(1.25, gerente02);
//
//		System.out.println(GerenteService.consultaGerente(gerente01));
//		System.out.println(GerenteService.consultaGerente(gerente02));						
		
	}

}
