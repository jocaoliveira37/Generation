package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva um n�mero: ");
		int N = ler.nextInt();
		if (N % 2 == 0)
		{
			System.out.println("N�mero Par");
		}
		else {
			System.out.println("N�mero Impar");
		}
		if (N > 0 )
		{
			System.out.println("Positivo");
		}
		else
		{
			System.out.println("Negativo");
		}
	ler.close();
	}
	

}