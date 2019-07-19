package com.banco.domain;

public class ContaTest {

	public static void main(String[] args) {

		Conta conta01 = new Conta(11, 111.11);				// Alteração com base na questão 10.
		Conta conta02 = new Conta(22, 222.22);				// Alteração com base na questão 10.
		
		System.out.printf("Número Conta: %d. Saldo: R$%f. Limite: R$%f.\n", conta01.numeroConta, conta01.saldoConta, conta01.limiteConta);
		System.out.printf("Número Conta: %d. Saldo: R$%f. Limite: R$%f.\n", conta02.numeroConta, conta02.saldoConta, conta02.limiteConta);
		
	}

}
