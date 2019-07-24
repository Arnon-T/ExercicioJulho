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

	public String pegaNomeFuncionario() {
		return this.nomeFuncionario;
	}
	
	public void indicaNomeFuncionario(String novoNome) {
		this.nomeFuncionario = novoNome;
	}
	
	public double pegaSalarioFuncionario() {
		return this.salarioFuncionario;
	}
	
	public void indicaSalarioFuncionario(double novoSalario) {
		this.salarioFuncionario = novoSalario;
	}

	public double pegaRefeicaoFuncionario() {
		return this.refeicaoFuncionario;
	}
	
	public void indicaRefeicaoFuncionario(double novoVR) {
		this.refeicaoFuncionario = novoVR;
	}	
}
