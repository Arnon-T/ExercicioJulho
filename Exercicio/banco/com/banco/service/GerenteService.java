package com.banco.service;

import com.banco.domain.Gerente;

public class GerenteService extends FuncionarioService{

	public static double calculaBonificacao(Gerente gerente){
		return gerente.getSalarioFunc() * 0.25;
	}
	
	public static void mostraDados(Gerente func) {
		System.out.printf("Nome: %s. Sal�rio: R$%f. Bonifica��o: R$%f.\n", func.getNomeFunc(), func.getSalarioFunc(), calculaBonificacao(func));
	}
	
/*
 *  C�digo comentado ap�s altera��es da quest�o 68.
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
//		String resultConsulta = "Gerente: " + gerente.getNomeFunc() + ". Sal�rio: R$" + gerente.getSalarioFunc() + ".\n";
//		return resultConsulta;
//	}
}
