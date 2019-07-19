package com.escola.domain;

public class TesteAluno {

/**
 * 
 * Implementa Classe TesteAluno
 * 
 */
	
	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno("Aluno01", 11111111, "01/01/2001");
		Aluno aluno02 = new Aluno("Aluno02", 11111111, "02/02/2002");
		
		System.out.printf("Nome: %s, RG: %d, Data de nascimento: %s.\n", aluno01.nomeAluno, aluno01.rgAluno, aluno01.dataNascAluno);
		System.out.printf("Nome: %s, RG: %d, Data de nascimento: %s.\n", aluno02.nomeAluno, aluno02.rgAluno, aluno02.dataNascAluno);
		
	}

}
