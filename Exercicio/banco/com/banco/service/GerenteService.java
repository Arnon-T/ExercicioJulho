package com.banco.service;

import com.banco.domain.Gerente;

public class GerenteService extends FuncionarioService{

	public static double calculaBonificacao(Gerente gerente){
		return gerente.getSalarioFunc() * 0.25;
	}
	
	public static void mostraDados(Gerente func) {
		System.out.printf("Nome: %s. Salário: R$%f. Bonificação: R$%f.\n", func.getNomeFunc(), func.getSalarioFunc(), calculaBonificacao(func));
	}
	
/*
 *  Código comentado após alterações da questão 68.
 */
//	public static void aumentoPadraoGerente(Gerente gerente) {
//		gerente.setSalarioFunc(gerente.getSalarioFunc() * 1.1);
//	}
//	
//	public static void aumentoVariavelGerente(double taxa, Gerente gerente) {
//		gerente.setSalarioFunc(gerente.getSalarioFunc() * taxa);
//	}
//	
//	public static String consultaGerente (Gerente gerente) {
//		String resultConsulta = "Gerente: " + gerente.getNomeFunc() + ". Salário: R$" + gerente.getSalarioFunc() + ".\n";
//		return resultConsulta;
//	}
}
