package com.banco.domain;

public class Gerente extends Funcionario{
	
	private	String	usuarioGerente;
	private String	senhaGerente;
	
	public Gerente(String nomeGerente, double salarioGerente, String usuarioGerente, String senhaGerente) {
		this.setNomeFunc(nomeGerente);
		this.setSalarioFunc(salarioGerente);
		this.usuarioGerente	= usuarioGerente;
		this.senhaGerente	= senhaGerente;
	}

	public String getUsuarioGerente() {
		return usuarioGerente;
	}

	public void setUsuarioGerente(String usuarioGerente) {
		this.usuarioGerente = usuarioGerente;
	}

	public String getSenhaGerente() {
		return senhaGerente;
	}

	public void setSenhaGerente(String senhaGerente) {
		this.senhaGerente = senhaGerente;
	}			
	
	
/*
 * Linhas comentadas após alterações da questão 64.
 */
	
//	public String getNomeGerente() {
//		return this.no;
//	}
//
//	public void setNomeGerente(String nomeGerente) {
//		this.nomeGerente = nomeGerente;
//	}
//
//	public double getSalarioGerente() {
//		return salarioGerente;
//	}
//
//	public void setSalarioGerente(double salarioGerente) {
//		this.salarioGerente = salarioGerente;
//	}	
}
