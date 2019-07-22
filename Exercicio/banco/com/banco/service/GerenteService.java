package com.banco.service;

import com.banco.domain.Gerente;

abstract public class GerenteService {

	public static void aumentoPadraoGerente(Gerente gerente) {
		gerente.salarioGerente *= 1.1;
	}
	
	public static void aumentoVariavelGerente(double taxa, Gerente gerente) {
		gerente.salarioGerente *= taxa;
	}
	
	public static String consultaGerente (Gerente gerente) {
		String resultConsulta = "Gerente: " + gerente.nomeGerente + ". Salário: R$" + gerente.salarioGerente + ".\n";
		return resultConsulta;
	}
}
