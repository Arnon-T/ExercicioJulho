package polimorfismo;

public class ContaPoupanca extends Conta{
	
	private double taxaRendimento;
	
	public ContaPoupanca(int numeroConta, double saldoConta, double taxaRendimento) {
		this.setNumeroConta(numeroConta);
		this.setSaldoConta(saldoConta);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}	
	
}
