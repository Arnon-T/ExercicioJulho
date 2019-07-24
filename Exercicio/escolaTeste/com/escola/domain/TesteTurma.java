package com.escola.domain;

public class TesteTurma {

	public static void main(String[] args) {

		Turma turma01 = new Turma("matutino", 2,"A","Presencial");
		Turma turma02 = new Turma("noturno", 9,"C","EAD");
		
		System.out.printf("Período: %s, série: %dª - %s. Tipo de Ensino: %s.\n", turma01.getPeriodoTurma(), turma01.getSerieTurma(), turma01.getSiglaTurma(), turma01.getTipoEnsinoTurma());
		System.out.printf("Período: %s, série: %dª - %s. Tipo de Ensino: %s.\n", turma02.getPeriodoTurma(), turma02.getSerieTurma(), turma02.getSiglaTurma(), turma02.getTipoEnsinoTurma());
		
	}

}
