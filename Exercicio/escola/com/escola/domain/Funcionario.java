package com.escola.domain;

public class Funcionario {
	
	private	String	nomeFuncionario;
	private	double	salarioFuncionario = 1000.00;
	private	double	refeicaoFuncionario;
	
	public Funcionario() {}
	
	public Funcionario(String nomeFuncionario, double refeicaoFuncionario){
		this.nomeFuncionario	=	nomeFuncionario;
		this.refeicaoFuncionario = refeicaoFuncionario;
	}	
	
}
