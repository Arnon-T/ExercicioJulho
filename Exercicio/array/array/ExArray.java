package array;

import java.util.Arrays;

public class ExArray {

	public static void main(String[] args) {
		
		int[] 	numeros	= {3,4,2,1,5};
		int 	soma = 0;
				
		for (int numero : numeros) {
			System.out.println(numero);
		}

		Arrays.sort(numeros);
		
		System.out.println("\n");
				
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		for (int numero : numeros) {
			soma += numero;
		}
		
		double media = soma/numeros.length;
		System.out.printf("Média: %f.\n", media);
		
		int maiorNumero = numeros[numeros.length - 1];
		System.out.printf("Maior número: %d.\n", maiorNumero);
		
		
		
	}

}
