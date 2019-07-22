package com.escola.domain;

public class Aluno {
	
	public String	nomeAluno;
	public int		rgAluno;
	public String	dataNascAluno;
	public Turma	turmaAluno;
	
	Aluno(String nomeAluno, int rgAluno, String dataNascAluno, Turma turmaAluno){
		
		this.nomeAluno		= nomeAluno;
		this.rgAluno		= rgAluno;
		this.dataNascAluno	= dataNascAluno;
		this.turmaAluno		= turmaAluno;
		
	}
	
}
