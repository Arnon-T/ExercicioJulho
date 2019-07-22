package com.escola.service;

import com.escola.domain.Funcionario;

abstract public class FuncionarioService {

	public static void aumentaSalarioFunc(double aumentoSalario, Funcionario funcionario) {
		funcionario.salarioFuncionario += aumentoSalario;
	}
	
	public static String consultaFunc(Funcionario funcionario) {
		String resultConsulta = "Funcion�rio: " + funcionario.nomeFuncionario + ". Sal�rio: R$" + funcionario.salarioFuncionario + ".";
		return resultConsulta;
				
	}
	
}
