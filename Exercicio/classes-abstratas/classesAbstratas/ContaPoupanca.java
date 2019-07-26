package classesAbstratas;

import classesAbstratas.Conta;

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
	
	public void imprimeExtratoDetalhado() {
		System.out.printf("Numero Conta Poupan�a: %d. Saldo conta: R$%f. Taxa rendimento: %f.\n", this.getNumeroConta(), this.getSaldoConta(), this.getTaxaRendimento());
	}
	
}