package com.escola.domain;

public class TesteAluno {

/**
 * 
 * Implementa Classe TesteAluno
 * 
 */
	
	public static void main(String[] args) {
		
		Turma turma01	= new Turma("matutino", 1, "A", "presencial");
		Turma turma02	= new Turma("noturno", 2, "B", "EAD");
		
		Aluno aluno01 	= new Aluno("Aluno01", 11111111, "01/01/2001", turma01);
		Aluno aluno02 	= new Aluno("Aluno02", 11111111, "02/02/2002", turma02);
		
		System.out.printf("Nome: %s, RG: %d, Data de nascimento: %s. Período: %s, série: %dª - %s. Tipo de Ensino: %s.\n", aluno01.nomeAluno, aluno01.rgAluno, aluno01.dataNascAluno, aluno01.turmaAluno.periodoTurma, aluno01.turmaAluno.serieTurma, aluno01.turmaAluno.siglaTurma, aluno01.turmaAluno.tipoEnsinoTurma);
		System.out.printf("Nome: %s, RG: %d, Data de nascimento: %s. Período: %s, série: %dª - %s. Tipo de Ensino: %s.\n", aluno02.nomeAluno, aluno02.rgAluno, aluno02.dataNascAluno, aluno02.turmaAluno.periodoTurma, aluno02.turmaAluno.serieTurma, aluno02.turmaAluno.siglaTurma, aluno02.turmaAluno.tipoEnsinoTurma);
		
	}

}
