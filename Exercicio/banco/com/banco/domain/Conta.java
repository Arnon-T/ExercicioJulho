package com.banco.domain;

public class Conta {
	
	public int		numeroConta;
	public double	saldoConta;
	public double	limiteConta;
	public Agencia	agenciaConta;

	/*
	 * Testes propostos nos exerc�cios 35-37 contemplados pela constru��o inicial da classe.
	 */

	public Conta(int numeroConta, double saldoConta, Agencia agenciaConta){
		this.numeroConta	= numeroConta;
		this.saldoConta		= saldoConta;
		this.limiteConta	= 100.00;					// Altera��o com base na quest�o 10.
		this.agenciaConta	= agenciaConta;
	}
}
