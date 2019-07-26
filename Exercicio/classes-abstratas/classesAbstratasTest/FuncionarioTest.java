package classesAbstratasTest;

import classesAbstratas.Funcionario;
import classesAbstratas.Gerente;

public class FuncionarioTest {

	public static void main(String[] args) {

		Funcionario gerente = new Gerente("Gerente Teste", 10000.00, 15);

		gerente.calculaBonificacao();
		
	}

}
