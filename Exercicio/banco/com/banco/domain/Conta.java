package com.banco.domain;

public class Conta {
	
	public int		numeroConta;
	public double	saldoConta;
	public double	limiteConta;


	Conta(int numeroConta, double saldoConta){
		this.numeroConta	= numeroConta;
		this.saldoConta		= saldoConta;
		this.limiteConta	= 100.00;					// Alteração com base na questão 10.
	}
	
}
