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
		
		System.out.printf("Nome: %s, RG: %d, Data de nascimento: %s. Período: %s, série: %dª - %s. Tipo de Ensino: %s.\n", aluno01.getNomeAluno(), aluno01.getRgAluno(), aluno01.getDataNascAluno(), aluno01.getTurmaAluno().getPeriodoTurma(), aluno01.getTurmaAluno().getSerieTurma(), aluno01.getTurmaAluno().getSiglaTurma(), aluno01.getTurmaAluno().getTipoEnsinoTurma());
		System.out.printf("Nome: %s, RG: %d, Data de nascimento: %s. Período: %s, série: %dª - %s. Tipo de Ensino: %s.\n", aluno02.getNomeAluno(), aluno02.getRgAluno(), aluno02.getDataNascAluno(), aluno02.getTurmaAluno().getPeriodoTurma(), aluno02.getTurmaAluno().getSerieTurma(), aluno02.getTurmaAluno().getSiglaTurma(), aluno02.getTurmaAluno().getTipoEnsinoTurma());
		
	}

}
