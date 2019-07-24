package com.banco.domain;

public class Conta {
	
	public 			int			numeroConta;
	public 			double		saldoConta;
	public 			double		limiteConta;
	public 			Agencia		agenciaConta;
	public static	int			contador;
	public			int			numUnicoConta;

	/*
	 * Testes propostos nos exercícios 35-37 contemplados pela construção inicial da classe.
	 */

	public Conta(int numeroConta, double saldoConta, Agencia agenciaConta){
		this.numeroConta	= numeroConta;
		this.saldoConta		= saldoConta;
		this.limiteConta	= 100.00;					// Alteração com base na questão 10.
		this.agenciaConta	= agenciaConta;
		contador++;
		this.numUnicoConta	= Math.round((contador * Math.round(Math.random() * 1000000))) % 10000;
	}
}
