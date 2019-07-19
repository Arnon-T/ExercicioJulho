package com.banco.domain;

public class AgenciaTest {

	public static void main(String[] args) {

		Agencia agencia01 = new Agencia(1111);
		Agencia agencia02 = new Agencia(2222);
		
		System.out.printf("Agência: %d.\n", agencia01.numeroAgencia);
		System.out.printf("Agência: %d.\n", agencia02.numeroAgencia);

	}

}
