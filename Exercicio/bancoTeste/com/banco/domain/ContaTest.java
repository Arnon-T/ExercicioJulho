package com.banco.domain;

public class ContaTest {

	public static void main(String[] args) {

		Agencia agencia01 = new	Agencia(11011);
		Agencia agencia02 = new	Agencia(22022);
		
		Conta conta01 = new Conta(11, 111.11, agencia01);				// Altera��o com base na quest�o 10.
		Conta conta02 = new Conta(22, 222.22, agencia02);				// Altera��o com base na quest�o 10.
		
		System.out.printf("N�mero Conta: %d. Saldo: R$%f. Limite: R$%f. Ag�ncia: %d.\n", conta01.numeroConta, conta01.saldoConta, conta01.limiteConta, conta01.agenciaConta.numeroAgencia);
		System.out.printf("N�mero Conta: %d. Saldo: R$%f. Limite: R$%f. Ag�ncia: %d.\n", conta02.numeroConta, conta02.saldoConta, conta02.limiteConta, conta02.agenciaConta.numeroAgencia);
		
	}

}
