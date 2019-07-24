package com.banco.service;

import com.banco.domain.Conta;

abstract public class ContaService {

	public static void depositaConta(double depositaValor, Conta depositaConta) {
		depositaConta.setSaldoConta(depositaConta.getSaldoConta() + depositaValor);
	}

	public static void sacaConta(double sacaValor, Conta sacaConta) {
		if(sacaConta.getSaldoConta() >= sacaValor) {
			sacaConta.setSaldoConta(sacaConta.getSaldoConta() - sacaValor);
		} else {
			System.out.println("Saldo indispon�ve para saque.");
		}	
	}
	
	public static String imprimeExtrato (Conta consultaConta){
		String extrato = "Extrato da Conta " + consultaConta.getNumeroConta() + ": R$"  + consultaConta.getSaldoConta() + ".\n";
		return extrato;
	}
	
	public static String imprimeSaldo(Conta consultaConta) {
		String saldoDisponivel = "Saldo dispon�vel da Conta " + consultaConta.getNumeroConta() + ": R$" + (consultaConta.getLimiteConta() + consultaConta.getSaldoConta()) + ".\n";
		return saldoDisponivel;
	}
	
	public static void transfereValor(Conta origem, Conta destino, double valor) {
		if (origem.getSaldoConta() >= valor) {
			origem.setSaldoConta(origem.getSaldoConta() - valor);
			destino.setSaldoConta(destino.getSaldoConta() + valor);
		}else {
			System.out.println("Saldo insufici�nte.");
		}			
	}
	
	public static int zeraContador() {
		int antigoContador = Conta.getContador();
		Conta.setContador(0);
		return antigoContador;
	}
	
}
