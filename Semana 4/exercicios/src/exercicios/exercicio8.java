package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int X;
		System.out.println("Escreva um n�mero: ");
		X = ler.nextInt();
		if ( X > 100)
		{
			System.out.println(" O valor � "+ X);
		}
		else
		{
			X = 0;
			System.out.println("Desculpe seu valor n�o � maior que 100 ent�o o resultado � " + X);
		}
		ler.close();
	}

}
