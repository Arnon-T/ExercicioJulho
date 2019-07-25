package com.banco.service;

import com.banco.domain.Telefonista;

public class TelefonistaService extends FuncionarioService {

	public static void mostraDados(Telefonista func) {
		System.out.printf("Nome: %s. Salário: R$%f. Bonificação: R$%f.\n", func.getNomeFunc(), func.getSalarioFunc(), FuncionarioService.calculaBonificacao(func));
	}
	
}
