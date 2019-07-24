package com.escola.domain;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Funcionario funcionario01 = new Funcionario("Funcionario01", 1000.00);
		//Funcionario funcionario02 = new Funcionario("Funcionario02", 2000.00);
		
		Funcionario funcionario01 = new Funcionario("Funcionario01", 400.00);
		Funcionario funcionario02 = new Funcionario("Funcionario02", 400.00);
		
		System.out.printf("Nome: %s, salário: R$%f. Vale refeição: %f.\n", funcionario01.pegaNomeFuncionario(), funcionario01.pegaSalarioFuncionario(), funcionario01.pegaRefeicaoFuncionario());
		System.out.printf("Nome: %s, salário: R$%f. Vale refeição: %f.\n", funcionario02.pegaNomeFuncionario(), funcionario02.pegaSalarioFuncionario(), funcionario02.pegaRefeicaoFuncionario());		
		
	}
	
}
