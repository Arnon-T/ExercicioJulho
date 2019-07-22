package com.banco.service;

import com.banco.domain.Agencia;
import com.banco.domain.Conta;

public class ContaServiceTest {
	
	public static void main(String[] args) {
			
	Agencia	ag01 = new Agencia(11011);
	
	Conta conta01 = new Conta(11, 1000.00, ag01);
	
	System.out.printf("INICIAL:        Saldo: R$%f.\n", conta01.saldoConta);
	
	ContaService.depositaConta(100.00, conta01);
	
	System.out.printf("TESTE DEPOSITO: Saldo: R$%f.\n", conta01.saldoConta);
	
	ContaService.sacaConta(200.00, conta01);
	
	System.out.printf("TESTE SAQUE:    Saldo: R$%f.\n\n", conta01.saldoConta);

	System.out.println(ContaService.imprimeExtrato(conta01));
	
	System.out.println(ContaService.imprimeSaldo(conta01));
	
	
	
	
	}
}
