package polimorfismo;

public class ContaCorrente extends Conta {
	
	private double limiteCredito;
	
	public ContaCorrente(int numeroConta, double saldoConta, double limiteCredito) {
		this.setNumeroConta(numeroConta);
		this.setSaldoConta(saldoConta);
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}		
	
}
