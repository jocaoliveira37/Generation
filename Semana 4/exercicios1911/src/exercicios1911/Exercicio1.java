package exercicios1911;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[10];
		int soma = 0, contador = 0, maior = 0, vezes = 0;
		Random dado = new Random();
		for (int y = 0; y < 10; y++) {
			x[y] = dado.nextInt(6);
			if ((x[y] + 1) > maior) {
				maior = (x[y] + 1);
			}
		}
		for (int y = 0; y < 10; y++) {
			System.out.printf("[" + (x[y] + 1) + "]");
			soma = soma + (x[y] + 1);
			contador++;

			if ((x[y] + 1) == maior) {
				vezes++;
			}
		}

		System.out.println("\nA média é " + (soma / contador));
		System.out.println("O maior número foi " + maior + " e saiu " + vezes + " vezes.");
	}

}
