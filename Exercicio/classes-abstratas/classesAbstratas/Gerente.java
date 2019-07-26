package classesAbstratas;

public class Gerente extends Funcionario {

	private int pessoasEquipe;
	
	public Gerente(String nomeFunc, double salarioFunc, int pessoasEquipe) {
		this.setNomeFunc(nomeFunc);
		this.setSalarioFunc(salarioFunc);
		this.pessoasEquipe = pessoasEquipe;
	}

	public int getPessoasEquipe() {
		return pessoasEquipe;
	}

	public void setPessoasEquipe(int pessoasEquipe) {
		this.pessoasEquipe = pessoasEquipe;
	}

	public void calculaBonificacao() {
		double calculo = this.getSalarioFunc() * 0.2; 
		System.out.printf("Bonificação: R$%f.", calculo);
	}
}