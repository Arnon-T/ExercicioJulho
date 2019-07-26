package polimorfismoTest;

import com.banco.service.Teclado;

import polimorfismo.Funcionario;
import polimorfismo.FuncionarioGerente;
import polimorfismo.FuncionarioService;
import polimorfismo.FuncionarioTelefonista;

public class FuncionarioServiceTest {

	public static void main(String[] args) {

		boolean sair = false;
		
		Funcionario gerente 	= new FuncionarioGerente("Gerente Teste", 10000.00, 23);
		Funcionario telefonista	= new FuncionarioTelefonista("Telefonista Teste", 2000.00, 41); 
				
		// Teste registro ponto.
		while (sair != true) {
			int opcao = 0;
			
			System.out.println("Op��es: \n"
					+ "1. Registrar entrada Gerente.\n"
					+ "2. Registrar entrada Telefonista.\n"
					+ "3. Registrar sa�da Gerente.\n"
					+ "4. Registrar sa�da Telefonista.\n"
					+ "5. Imprimir registros.\n"
					+ "6. Encerrar programa.\n");
		
			opcao = Teclado.lerInt("Selecione uma op��o:");
			
			if (opcao == 1) {
				FuncionarioService.registraEntrada(gerente);				
			} else if(opcao == 2) {
				FuncionarioService.registraEntrada(telefonista);
			} else if(opcao == 3) {
				FuncionarioService.registraSaida(gerente);
			} else if(opcao == 4) {
				FuncionarioService.registraSaida(telefonista);
			} else if(opcao == 5) {
				FuncionarioService.imprimeRegistro(gerente);
				FuncionarioService.imprimeRegistro(telefonista);
			} else if(opcao == 6) {
				sair = true;
				System.out.println("\nPrograma encerrado.");
			}														
			
		}

	}

}
