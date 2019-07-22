package com.banco.service;

import com.banco.domain.Conta;

abstract public class ContaService {

	public static void depositaConta(double depositaValor, Conta depositaConta) {
		depositaConta.saldoConta += depositaValor;
	}

	public static void sacaConta(double sacaValor, Conta sacaConta) {
		sacaConta.saldoConta -= sacaValor;
	}
	
	public static String imprimeExtrato (Conta consultaConta){
		String extrato = "Extrato da Conta " + consultaConta.numeroConta + ": R$"  + consultaConta.saldoConta + ".\n";
		return extrato;
	}
	
	public static String imprimeSaldo(Conta consultaConta) {
		String saldoDisponivel = "Saldo disponível da Conta " + consultaConta.numeroConta + ": R$" + (consultaConta.limiteConta + consultaConta.saldoConta) + ".\n";
		return saldoDisponivel;
	}
}
