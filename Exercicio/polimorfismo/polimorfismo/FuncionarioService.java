package polimorfismo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract public class FuncionarioService {
	
	static DateTimeFormatter formata = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
	
	public static void registraEntrada(Funcionario func) {
		func.setRegistroEntrada(LocalDateTime.now());		
	}

	public static void registraSaida(Funcionario func) {
		func.setRegistroSaida(LocalDateTime.now());		
	}	
	public static void imprimeRegistro(Funcionario func) {
		System.out.printf("Nome: %s. Salário: R$%f. Entrada: %s. Saída: %s.\n", func.getNomeFunc(), func.getSalarioFunc(), formata.format(func.getRegistroEntrada()), formata.format(func.getRegistroSaida()));
	}
	
}
