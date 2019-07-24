package com.escola.domain;

public class Funcionario {
	
	private	String	nomeFuncionario;
	private	double	salarioFuncionario = 1000.00;
	private	double	refeicaoFuncionario;
	
	public Funcionario() {}
	
	public Funcionario(String nomeFuncionario, double refeicaoFuncionario){
		this.nomeFuncionario		= nomeFuncionario;
		this.refeicaoFuncionario 	= refeicaoFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public double getRefeicaoFuncionario() {
		return refeicaoFuncionario;
	}

	public void setRefeicaoFuncionario(double refeicaoFuncionario) {
		this.refeicaoFuncionario = refeicaoFuncionario;
	}		
}
