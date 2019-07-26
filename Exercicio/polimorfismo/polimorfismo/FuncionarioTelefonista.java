package polimorfismo;

public class FuncionarioTelefonista extends Funcionario{

	private int ramal;
	
	public FuncionarioTelefonista(String nomeFunc, double salarioFunc, int ramal) {
		this.setNomeFunc(nomeFunc);
		this.setSalarioFunc(salarioFunc);
		this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
}
