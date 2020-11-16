package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva a altura do triângulo: ");
		double X = ler.nextDouble();
		System.out.println("Qual a base do triângulo: ");
		double Y = ler.nextDouble();
		if ( X > 0 && Y > 0)
		{
			double area = X * Y;
			System.out.println("A área do triângulo é "+ area);
		}
		else {
			System.out.println("Número Inválido reinicie o sistema!");
		}
			
		ler.close();		
	}

}
