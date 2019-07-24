package com.escola.service;

import com.escola.domain.Funcionario;

public class TesteFuncionarioService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Funcionario funcionarioTeste = new Funcionario("Funcionário Teste", 947.00);
		Funcionario funcionarioTeste = new Funcionario("Funcionário Teste", 400.00);
		
		
		System.out.println(FuncionarioService.consultaFunc(funcionarioTeste));
		
		FuncionarioService.aumentaSalarioFunc(1000.00, funcionarioTeste);
		
		System.out.println(FuncionarioService.consultaFunc(funcionarioTeste));
		
		System.out.printf("Vale Refeição: %f.\n", funcionarioTeste.getRefeicaoFuncionario());
		FuncionarioService.reajusteRefeicao(funcionarioTeste);
		System.out.printf("Vale Refeição: %f.\n", funcionarioTeste.getRefeicaoFuncionario());
		
	}

}
