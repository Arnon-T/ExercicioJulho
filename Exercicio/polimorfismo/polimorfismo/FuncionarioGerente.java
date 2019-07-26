package polimorfismo;

public class FuncionarioGerente extends Funcionario {

	private int pessoasEquipe;
	
	public FuncionarioGerente(String nomeFunc, double salarioFunc, int pessoasEquipe) {
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
	
}
