package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva um número: ");
		double N = ler.nextDouble();
		if (N > 0.05 && N < 0.25)
		{
			System.out.println("Índice aceitável");
		}
		else if (N >= 0.25 && N < 0.4 )
		{
			System.out.println("INTIMAR EMPRESAS DO 1º GRUPO A SUSPENDER ATIVIDADES");
		}
		else if ( N >= 0.4 && N < 0.49)
		{
			System.out.println("INTIMAR EMPRESAS DOS 1º e  2º GRUPOS A SUSPENDEREM ATIVIDADES");
		}
		else if (N >= 0.5)
		{
			System.out.println("SUSPENDER A ATIVIDADE DE TODOS OS GRUPOS DE EMPRESAS");
		}
			
	ler.close();
	}
	

}