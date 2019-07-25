package com.banco.service;

import com.banco.domain.Funcionario;

abstract public class FuncionarioService {

	public static double calculaBonificacao(Funcionario func) {
		return	func.getSalarioFunc() * 0.1;
	}

	public static void mostraDados(Funcionario func) {
		System.out.printf("Nome: %s. Salário: R$%f. Bonificação: R$%f.\n", func.getNomeFunc(), func.getSalarioFunc(), calculaBonificacao(func));
	}
}

