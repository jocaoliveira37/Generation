package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva sua idade: ");
		double N = ler.nextDouble();
		if (N >= 5 && N <= 7)
		{
			System.out.println("INFANTIL A");
		}
		else if (N >= 8  && N <= 11 )
		{
			System.out.println("INFANTIL B");
		}
		else if ( N >= 12 && N <= 13)
		{
			System.out.println("JUVENIL A");
		}
		else if (N >= 14 && N <= 17)
		{
			System.out.println("JUVENIL B");
		}
		else if (N < 5)
		{
			System.out.println("Inválido!");
		}
		else 
		{
			System.out.println("Maiores de 18 anos");
		}
			
	ler.close();
	}
	

}