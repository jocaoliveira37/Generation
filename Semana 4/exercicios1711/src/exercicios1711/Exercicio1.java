package exercicios1711;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double X = 0, Y = 0;
		while ( X == Y)
		{
		System.out.println("Escreva X: ");
		X = ler.nextDouble();
		System.out.println("Escreva Y: ");
		Y = ler.nextDouble();
		if (X > Y)
		{
			System.out.println("O maior é o " +X);
		}
		else
		{
			System.out.println("O maior é o "+ Y);
		}
		}
								
		ler.close();
	}

}
