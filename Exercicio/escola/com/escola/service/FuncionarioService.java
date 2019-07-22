package com.escola.service;

import com.escola.domain.Funcionario;

abstract public class FuncionarioService {

	public static void aumentaSalarioFunc(double aumentoSalario, Funcionario funcionario) {
		funcionario.salarioFuncionario += aumentoSalario;
	}
	
	public static String consultaFunc(Funcionario funcionario) {
		String resultConsulta = "Funcionário: " + funcionario.nomeFuncionario + ". Salário: R$" + funcionario.salarioFuncionario + ".";
		return resultConsulta;
				
	}
	
}
