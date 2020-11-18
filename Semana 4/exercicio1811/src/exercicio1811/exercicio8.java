package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int x = 0, soma = 0, media = 0, contador = 0;
		while (x >= 0)
		{
			System.out.println("Escreva o valor ");
			x = leia.nextInt();
			soma = soma + x;
			contador ++;
			media = soma / contador;
		}
		System.out.println(" A soma é "+ soma + " e a média é " + media);
		
	leia.close();
	}

}
