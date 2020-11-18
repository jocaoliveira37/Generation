package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int X, Y = 0;
		do {
			System.out.println("Entre com um número: ");
			X = leia.nextInt();
			Y += X;
		} while (X != 0);
		System.out.println("A soma dos valores digitados é " + Y);
		leia.close();
	}

}
