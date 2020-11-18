package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva um número: ");
		int X = leia.nextInt();
		int soma = 0, contador = 0;
		do 
		{
			soma += contador;
			contador ++;		
		}while(contador <= X);
		System.out.println(soma);
	leia.close();
	}

}
