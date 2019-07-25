package com.banco.service;

import com.banco.domain.Gerente;
import com.banco.domain.Secretaria;
import com.banco.domain.Telefonista;

public class FuncionarioServiceTest {

	public static void main(String[] args) {
		
		Gerente gerente 		= new Gerente("Gerente Nome", 10000.00, "user", "password");
		Secretaria secretaria 	= new Secretaria("Secretaria Nome", 2000.00, 1111);
		Telefonista telefonista = new Telefonista("Telefonista Nome", 1500.00, 12);

		System.out.printf("Nome: %s. Salário: R$%f. Usuário: %s Senha: %s\n", gerente.getNomeFunc(), gerente.getSalarioFunc(), gerente.getUsuarioGerente(), gerente.getSenhaGerente());
		System.out.printf("Nome: %s. Salário: R$%f. Ramal: %d.\n", secretaria.getNomeFunc(),secretaria.getSalarioFunc(), secretaria.getNumeroRamal() );
		System.out.printf("Nome: %s. Salário: R$%f. Estação: %d\n", telefonista.getNomeFunc(), telefonista.getSalarioFunc(), telefonista.getCodigoEstacao());
								
		System.out.println("\n Bonificação de 10%. \n");

		System.out.printf("Bonificação Gerente: R$%f.\n", FuncionarioService.calculaBonificacao(gerente));
		System.out.printf("Bonificação Secretária: R$%f.\n", FuncionarioService.calculaBonificacao(secretaria));
		System.out.printf("Bonificação Telefonista: R$%f.\n", FuncionarioService.calculaBonificacao(telefonista));		
		
	}

}
