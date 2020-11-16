package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double V1, V2, V3, V4;
		System.out.println("Escreva o primeiro valor: ");
		V1= ler.nextDouble();
		System.out.println("Escreva o segundo valor: ");
		V2 = ler.nextDouble();
		System.out.println("Escreva o terceiro valor: ");
		V3 = ler.nextDouble();
		System.out.println("Escreva o quarto valor: ");
		V4 = ler.nextDouble();
		double V1q = Math.pow(V1, 2.0);
		double V2q = Math.pow(V2, 2.0);
		double V3q = Math.pow(V3, 2.0);
		double V4q = Math.pow(V4, 2.0);
		
		if (V3q >= 1000)
		{
			System.out.println("Encerrado");
		}
		else 
		{
			System.out.println("O valores são "+ V1q+ " para "+V1);
			System.out.println("O valores são "+ V2q+ " para "+V2);
			System.out.println("O valores são "+ V3q+ " para "+V3);
			System.out.println("O valores são "+ V4q+ " para "+V4);
		}			
		ler.close();
		
	}

}
