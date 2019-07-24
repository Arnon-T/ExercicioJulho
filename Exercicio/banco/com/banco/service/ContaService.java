package com.banco.service;

import com.banco.domain.Conta;

abstract public class ContaService {

	public static void depositaConta(double depositaValor, Conta depositaConta) {
		depositaConta.saldoConta += depositaValor;
	}

	public static void sacaConta(double sacaValor, Conta sacaConta) {
		if(sacaConta.saldoConta >= sacaValor) {
			sacaConta.saldoConta -= sacaValor;
		} else {
			System.out.println("Saldo indisponíve para saque.");
		}	
	}
	
	public static String imprimeExtrato (Conta consultaConta){
		String extrato = "Extrato da Conta " + consultaConta.numeroConta + ": R$"  + consultaConta.saldoConta + ".\n";
		return extrato;
	}
	
	public static String imprimeSaldo(Conta consultaConta) {
		String saldoDisponivel = "Saldo disponível da Conta " + consultaConta.numeroConta + ": R$" + (consultaConta.limiteConta + consultaConta.saldoConta) + ".\n";
		return saldoDisponivel;
	}
	
	public static void transfereValor(Conta origem, Conta destino, double valor) {
		if (origem.saldoConta >= valor) {
			origem.saldoConta 	-= valor;
			destino.saldoConta 	+= valor;
		}else {
			System.out.println("Saldo insuficiênte.");
		}			
	}
	
	public static int zeraContador() {
		int antigoContador = Conta.contador;
		Conta.contador = 0;
		return antigoContador;
	}
	
}
