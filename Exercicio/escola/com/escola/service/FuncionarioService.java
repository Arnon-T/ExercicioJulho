package com.escola.service;

import com.escola.domain.Funcionario;

abstract public class FuncionarioService {

	public static void aumentaSalarioFunc(double aumentoSalario, Funcionario funcionario) {
		funcionario.setSalarioFuncionario(funcionario.getSalarioFuncionario() + aumentoSalario);
	}
	
	public static String consultaFunc(Funcionario funcionario) {
		String resultConsulta = "Funcionário: " + funcionario.getNomeFuncionario() + ". Salário: R$" + funcionario.getSalarioFuncionario() + ".";
		return resultConsulta;
				
	}
	
	public static void reajusteRefeicao(Funcionario func) {
		double taxa = 1.1;
		func.setRefeicaoFuncionario(func.getRefeicaoFuncionario() * taxa);		
	}
	
	
}
