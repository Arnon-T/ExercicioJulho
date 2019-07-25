package com.banco.service;

import com.banco.domain.Secretaria;

public class SecretariaService extends FuncionarioService{

	public static void mostraDados(Secretaria func) {
		System.out.printf("Nome: %s. Salário: R$%f. Bonificação: R$%f.\n", func.getNomeFunc(), func.getSalarioFunc(), FuncionarioService.calculaBonificacao(func));
	}	
}
