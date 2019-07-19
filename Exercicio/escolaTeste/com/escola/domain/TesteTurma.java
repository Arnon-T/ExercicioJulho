package com.escola.domain;

public class TesteTurma {

	public static void main(String[] args) {

		Turma turma01 = new Turma("matutino", 2,"A","Presencial");
		Turma turma02 = new Turma("noturno", 9,"C","EAD");
		
		System.out.printf("Período: %s, série: %dª - %s. Tipo de Ensino: %s.\n", turma01.periodoTurma, turma01.serieTurma, turma01.siglaTurma, turma01.tipoEnsinoTurma);
		System.out.printf("Período: %s, série: %dª - %s. Tipo de Ensino: %s.\n", turma02.periodoTurma, turma02.serieTurma, turma02.siglaTurma, turma02.tipoEnsinoTurma);
		
	}

}
