package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int P, M = 0, E = 0;
		System.out.println("Escreva o peso do tomate: ");
		P = sc.nextInt();
		if (P > 50) {
			M = 4;
			int PE = P - 50;
			E = (PE) * M;
			System.out.println("O peso foi excedido em " + PE + "kG e o valor a pagar é R$" + E);
		} else {
			System.out.println("O peso foi excedido em " + M + "kG e o valor a pagar é R$" + E);
			System.out.println("O peso não foi ultrapssado");
		}
		sc.close();
	}

}
