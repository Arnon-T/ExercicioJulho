package com.escola.service;

import java.util.ArrayList;

import com.escola.domain.Funcionario;

import util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		
		/* 
		 * Crie uma classe chamada TesteFuncionario2. Dentro dessa classe, crie um objeto do tipo Funcionario.
		 *  Receba do teclado o valor para o atributo nome. Depois crie um laço que permita que o usuário possa alterar o nome
		 *   e o salário dos funcionários e também visualizar os dados atuais.
		 */
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		boolean sair = false;
		
		while (sair == false) {
			int operacao = Teclado.lerInt("Selecione uma operação. \n (1)Cadastrar novo funcionário; \n (2)Alterar cadastro de funcionário; \n (3) Listar funcionários cadastrados; \n (4)Sair. \n");
						
			if (operacao == 1) {
				Funcionario funcionario = new Funcionario();
				System.out.println("Cadastro de novo funcionário. \n");
				funcionario.nomeFuncionario = Teclado.lerTexto("Digite o nome do funcionário: ");
				//funcionario.salarioFuncionario = Teclado.lerDouble("Digite o salário do funcionário: "); Questão 40 impõe salário inicial.
				funcionarios.add(funcionario);	
			}
			else if (operacao == 2) {	
				System.out.println("Alteração de cadastro de funcionário. \n");
				int somaFunc = funcionarios.size();
				System.out.println("Selecione um número de funcionário de 1 a " + somaFunc);
				int codigoFunc = Teclado.lerInt("Selecione o código do funcionário.");
					if (codigoFunc >= 0 && codigoFunc <= somaFunc){
						funcionarios.get(codigoFunc - 1).nomeFuncionario = Teclado.lerTexto("Digite o novo nome do funcionário " + codigoFunc + ".");
						funcionarios.get(codigoFunc - 1).salarioFuncionario = Teclado.lerDouble("Digite o novo salário do funcionário " + codigoFunc + ".");
					}
					else {
						System.out.println("Selecione um código de funcionário válido.");
					}
			} 
			else if (operacao == 3) {
				System.out.println("Lista de funcionários cadastrados + salários. \n");
				for (Funcionario todosFunc : funcionarios) {
					System.out.println(FuncionarioService.consultaFunc(todosFunc) + "\n");				
				}			
			}
			else if (operacao == 4) {
				System.out.println("Encerrando programa.");
				sair = true;
			}
			else {
				System.out.println("Digite uma operação válida.");
			}
		}
	}
}