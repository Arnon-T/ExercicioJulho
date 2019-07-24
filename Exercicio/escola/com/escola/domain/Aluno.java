package com.escola.domain;

public class Aluno {
	
	private String	nomeAluno;
	private int		rgAluno;
	private String	dataNascAluno;
	private Turma	turmaAluno;
	
	Aluno(String nomeAluno, int rgAluno, String dataNascAluno, Turma turmaAluno){
		
		this.nomeAluno		= nomeAluno;
		this.rgAluno		= rgAluno;
		this.dataNascAluno	= dataNascAluno;
		this.turmaAluno		= turmaAluno;
		
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getRgAluno() {
		return rgAluno;
	}

	public void setRgAluno(int rgAluno) {
		this.rgAluno = rgAluno;
	}

	public String getDataNascAluno() {
		return dataNascAluno;
	}

	public void setDataNascAluno(String dataNascAluno) {
		this.dataNascAluno = dataNascAluno;
	}

	public Turma getTurmaAluno() {
		return turmaAluno;
	}

	public void setTurmaAluno(Turma turmaAluno) {
		this.turmaAluno = turmaAluno;
	}	
	
}
