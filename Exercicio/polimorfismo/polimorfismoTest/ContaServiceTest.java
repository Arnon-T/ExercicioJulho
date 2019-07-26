package polimorfismoTest;

import polimorfismo.*;


public class ContaServiceTest {

	public static void main(String[] args) {
		
		Conta contaCorrente = new ContaCorrente(1111, 10000.00, 1000.00);
		Conta contaPoupanca = new ContaPoupanca(2222, 22000.00, 1.0045);
				
		System.out.printf("Saldo Conta Corrente: R$%f.\n", ContaService.geradorExtrato(contaCorrente));
		System.out.printf("Saldo Conta Poupança: R$%f.\n", ContaService.geradorExtrato(contaPoupanca));
		
	}

}
