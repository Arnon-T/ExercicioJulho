package interfaces;

public class InterfacesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta poupanca = new ContaPoupanca(111, 1000.00, 1.0045);
		
		poupanca.geradorExtrato(poupanca);
		
	}

}
