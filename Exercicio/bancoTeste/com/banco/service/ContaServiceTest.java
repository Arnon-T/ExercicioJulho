package com.banco.service;

import com.banco.domain.Agencia;
import com.banco.domain.Conta;

public class ContaServiceTest {
	
	public static void main(String[] args) {
			
	Agencia	ag01 = new Agencia(11011);
	Agencia	ag02 = new Agencia(22022);
	
	Conta conta01 = new Conta(11, 1000.00, ag01);
	Conta conta02 = new Conta(22, 2000.00, ag02);
	
	System.out.printf("INICIAL:        Saldo: R$%f.\n", conta01.saldoConta);
	
	ContaService.depositaConta(100.00, conta01);
	
	System.out.printf("TESTE DEPOSITO: Saldo: R$%f.\n", conta01.saldoConta);
	
	ContaService.sacaConta(200.00, conta01);
	
	System.out.printf("TESTE SAQUE:    Saldo: R$%f.\n\n", conta01.saldoConta);

	System.out.println(ContaService.imprimeExtrato(conta01));
	
	System.out.println(ContaService.imprimeExtrato(conta01));
	
	ContaService.transfereValor(conta01, conta02, 500.00);
	
	System.out.println(ContaService.imprimeExtrato(conta01));
	
	System.out.println(ContaService.imprimeSaldo(conta02));
	
	}
}
