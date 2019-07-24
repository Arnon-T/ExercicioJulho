package com.banco.service;

import com.banco.domain.Gerente;

abstract public class GerenteService {

	public static void aumentoPadraoGerente(Gerente gerente) {
		gerente.setSalarioGerente(gerente.getSalarioGerente() * 1.1);
	}
	
	public static void aumentoVariavelGerente(double taxa, Gerente gerente) {
		gerente.setSalarioGerente(gerente.getSalarioGerente() * taxa);
	}
	
	public static String consultaGerente (Gerente gerente) {
		String resultConsulta = "Gerente: " + gerente.getNomeGerente() + ". Salário: R$" + gerente.getSalarioGerente() + ".\n";
		return resultConsulta;
	}
}
