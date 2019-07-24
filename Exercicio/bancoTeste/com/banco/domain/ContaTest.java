package com.banco.domain;

import com.banco.service.ContaService;

public class ContaTest {

	public static void main(String[] args) {

		Agencia agencia01 = new	Agencia(11011);
		Agencia agencia02 = new	Agencia(22022);
		
		System.out.printf("Contador: %d.\n", Conta.getContador());
		Conta conta01 = new Conta(11, 111.11, agencia01);				// Alteração com base na questão 10.
		System.out.printf("Contador: %d. Número Único = %d.\n", Conta.getContador(), conta01.getNumUnicoConta());
		Conta conta02 = new Conta(22, 222.22, agencia02);				// Alteração com base na questão 10.
		System.out.printf("Contador: %d. Número Único = %d.\n", Conta.getContador(), conta02.getNumUnicoConta());
		ContaService.zeraContador();
		System.out.printf("Contador após zeraContador: %d.\n", Conta.getContador());
		
		System.out.printf("Número Conta: %d. Saldo: R$%f. Limite: R$%f. Agência: %d.\n", conta01.getNumeroConta(), conta01.getSaldoConta(), conta01.getLimiteConta(), conta01.getAgenciaConta().getNumeroAgencia());
		System.out.printf("Número Conta: %d. Saldo: R$%f. Limite: R$%f. Agência: %d.\n", conta02.getNumeroConta(), conta02.getSaldoConta(), conta02.getLimiteConta(), conta02.getAgenciaConta().getNumeroAgencia());
		
		
		
		
	}

}
