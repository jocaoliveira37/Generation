package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o valor  positivo de A: ");
		int A = sc.nextInt();
		System.out.println("Escreva o valor positivo de B: ");
		int B = sc.nextInt();
		System.out.println("Escreva o valor positivo de C: ");
		int C = sc.nextInt();	
		if (A > 0 && B > 0 && C > 0) {
			int R = (int) Math.pow((A + B), 2);
			int S = (int) Math.pow((B + C), 2);
			int D = (R + S) / 2;
			System.out.println("O valor de D é: " + D);
		} else {
			System.out.println("Alguns dos valores não é positivo, recomece!");
		}
		sc.close();
	}
}
