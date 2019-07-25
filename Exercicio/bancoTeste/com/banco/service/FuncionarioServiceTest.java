package com.banco.service;

import com.banco.domain.Gerente;
import com.banco.domain.Secretaria;
import com.banco.domain.Telefonista;

public class FuncionarioServiceTest {

	public static void main(String[] args) {
		
		Gerente gerente 		= new Gerente("Gerente Nome", 10000.00, "user", "password");
		Secretaria secretaria 	= new Secretaria("Secretaria Nome", 2000.00, 1111);
		Telefonista telefonista = new Telefonista("Telefonista Nome", 1500.00, 12);

		System.out.printf("Nome: %s. Sal�rio: R$%f. Usu�rio: %s Senha: %s\n", gerente.getNomeFunc(), gerente.getSalarioFunc(), gerente.getUsuarioGerente(), gerente.getSenhaGerente());
		System.out.printf("Nome: %s. Sal�rio: R$%f. Ramal: %d.\n", secretaria.getNomeFunc(),secretaria.getSalarioFunc(), secretaria.getNumeroRamal() );
		System.out.printf("Nome: %s. Sal�rio: R$%f. Esta��o: %d\n", telefonista.getNomeFunc(), telefonista.getSalarioFunc(), telefonista.getCodigoEstacao());
								
		System.out.println("\n Bonifica��o de 10%. \n");

		System.out.printf("Bonifica��o Gerente: R$%f.\n", FuncionarioService.calculaBonificacao(gerente));
		System.out.printf("Bonifica��o Secret�ria: R$%f.\n", FuncionarioService.calculaBonificacao(secretaria));
		System.out.printf("Bonifica��o Telefonista: R$%f.\n", FuncionarioService.calculaBonificacao(telefonista));		
		
	}

}
