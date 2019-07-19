package com.banco.domain;

public class Conta {
	
	public int		numeroConta;
	public double	saldoConta;
	public double	limiteConta;
	
	Conta(int numeroConta, double saldoConta, double limiteConta){
		this.numeroConta	= numeroConta;
		this.saldoConta		= saldoConta;
		this.limiteConta	= limiteConta;
	}
	
}
