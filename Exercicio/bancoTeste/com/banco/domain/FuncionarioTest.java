package com.banco.domain;

import com.banco.service.GerenteService;
import com.banco.service.SecretariaService;
import com.banco.service.TelefonistaService;

public class FuncionarioTest {

	/*
	 * Classe testa novas classes herdadas (Gerente, Secretaria, Telefonista) da pai (Funcionario).
	 */
	
	public static void main(String[] args) {

		Gerente 	gerente 	= new Gerente("Gerente Nome", 10000.00, "user", "password");
		Secretaria 	secretaria 	= new Secretaria("Secretaria Nome", 2000.00, 1111);
		Telefonista telefonista = new Telefonista("Telefonista Nome", 1500.00, 12);

		System.out.printf("Nome: %s. Salário: R$%f. Usuário: %s Senha: %s\n", gerente.getNomeFunc(), gerente.getSalarioFunc(), gerente.getUsuarioGerente(), gerente.getSenhaGerente());
		System.out.printf("Nome: %s. Salário: R$%f. Ramal: %d.\n", secretaria.getNomeFunc(),secretaria.getSalarioFunc(), secretaria.getNumeroRamal() );
		System.out.printf("Nome: %s. Salário: R$%f. Estação: %d\n", telefonista.getNomeFunc(), telefonista.getSalarioFunc(), telefonista.getCodigoEstacao());
		
		System.out.println("\n Teste método mostraDados().\n");
		
		GerenteService.mostraDados(gerente);
		SecretariaService.mostraDados(secretaria);
		TelefonistaService.mostraDados(telefonista);
		                   
	}

}
