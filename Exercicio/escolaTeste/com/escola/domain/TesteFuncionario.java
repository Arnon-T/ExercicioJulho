package com.escola.domain;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Funcionario funcionario01 = new Funcionario("Funcionario01", 1000.00);
		//Funcionario funcionario02 = new Funcionario("Funcionario02", 2000.00);
		
		Funcionario funcionario01 = new Funcionario("Funcionario01", 400.00);
		Funcionario funcionario02 = new Funcionario("Funcionario02", 400.00);
		
		System.out.printf("Nome: %s, salário: R$%f. Vale refeição: %f.\n", funcionario01.nomeFuncionario, funcionario01.salarioFuncionario, funcionario01.refeicaoFuncionario);
		System.out.printf("Nome: %s, salário: R$%f. Vale refeição: %f.\n", funcionario02.nomeFuncionario, funcionario02.salarioFuncionario, funcionario02.refeicaoFuncionario);		
		
	}
	
}
