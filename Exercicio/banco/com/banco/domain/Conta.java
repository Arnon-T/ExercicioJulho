package com.banco.domain;

public class Conta {
	
	private int			numeroConta;
	private double		saldoConta;
	private double		limiteConta;
	private Agencia		agenciaConta;
	private static	int	contador;
	private int			numUnicoConta;

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

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public double getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}

	public Agencia getAgenciaConta() {
		return agenciaConta;
	}

	public void setAgenciaConta(Agencia agenciaConta) {
		this.agenciaConta = agenciaConta;
	}

	public int getNumUnicoConta() {
		return numUnicoConta;
	}

	public void setNumUnicoConta(int numUnicoConta) {
		this.numUnicoConta = numUnicoConta;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Conta.contador = contador;
	}
	
}
