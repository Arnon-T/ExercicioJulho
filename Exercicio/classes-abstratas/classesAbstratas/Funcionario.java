package classesAbstratas;

abstract public class Funcionario {

	private String 	nomeFunc;
	private double	salarioFunc;
	
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	abstract public void calculaBonificacao();
			
}
