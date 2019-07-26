package classesAbstratasTest;

import classesAbstratas.*;

public class ContaTest {

	public static void main(String[] args) {
		Conta poupanca = new ContaPoupanca(11, 10000.00, 1.0045);
		
		poupanca.imprimeExtratoDetalhado();
		
	}

}
