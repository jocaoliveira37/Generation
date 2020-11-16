package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int C;
		double N;
		System.out.println("Escreva o codigo do funcionário: ");
		C = ler.nextInt();
		System.out.println("Escreva as horas trabalhadas: ");
		N = ler.nextDouble();
		
		if (N > 50)
		{
			double excedente = N - 50;
			double valorExcedente = excedente * 20;
			System.out.println("O funcionário "+ C + " recebeu de salário R$500 e o extra foi de R$"+ valorExcedente +" referente a "+ excedente +" horas excedentes");
			
		}
		else 
		{
			double valor = N * 10;
			System.out.println("O funcionário recebeu R$"+ valor +" por "+ N+" horas trabalhadas");
			
		}
		ler.close();
			
	}

}
