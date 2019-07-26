package interfaces;

abstract public class Conta implements ClasseInterface{
	
	private int numeroConta;
	private double saldoConta;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}	
	
	public void deposita(double valor, Conta contadestino) {
		contadestino.setSaldoConta(this.getSaldoConta() + valor);
	}
	
	public void saca(double valor, Conta contaorigem) {
		contaorigem.setSaldoConta(contaorigem.getSaldoConta() + valor);
	}
	
	public void geradorExtrato(Conta contaextrato) {
		System.out.printf("Extrato de qualquer tipo de conta.\n"
				+ "1. Conta: %d.\n"
				+ "2. Saldo: %f.\n", contaextrato.getNumeroConta(), contaextrato.getSaldoConta());
	}
}