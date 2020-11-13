package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a nota da P1: ");
		double notas1 = sc.nextDouble();
		System.out.println("Escreva a nota da P2: ");
		double notas2 = sc.nextDouble();
		System.out.println("Escreva a nota da P3: ");
		double notas3 = sc.nextDouble();

		double media = ((notas1 * 2) + (notas2 * 3) + (notas3 * 5)) / 10;
		System.out.println("Sua média ponderada será: " + media);

		sc.close();
	}
}
