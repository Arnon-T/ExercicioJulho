package com.escola.domain;

public class Turma {

	private String 	periodoTurma;
	private int		serieTurma;
	private String	siglaTurma;
	private String	tipoEnsinoTurma;
	
	Turma(String periodoTurma, int serieTurma, String siglaTurma, String tipoEnsinoTurma){
		
		this.periodoTurma		=	periodoTurma;
		this.serieTurma			=	serieTurma;
		this.siglaTurma			=	siglaTurma;
		this.tipoEnsinoTurma	=	tipoEnsinoTurma;
		
	}

	public String getPeriodoTurma() {
		return periodoTurma;
	}

	public void setPeriodoTurma(String periodoTurma) {
		this.periodoTurma = periodoTurma;
	}

	public int getSerieTurma() {
		return serieTurma;
	}

	public void setSerieTurma(int serieTurma) {
		this.serieTurma = serieTurma;
	}

	public String getSiglaTurma() {
		return siglaTurma;
	}

	public void setSiglaTurma(String siglaTurma) {
		this.siglaTurma = siglaTurma;
	}

	public String getTipoEnsinoTurma() {
		return tipoEnsinoTurma;
	}

	public void setTipoEnsinoTurma(String tipoEnsinoTurma) {
		this.tipoEnsinoTurma = tipoEnsinoTurma;
	}
		
}
