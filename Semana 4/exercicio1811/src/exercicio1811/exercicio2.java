package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int par = 0, impar = 0;
		for (int x = 0; x < 10; x ++)
		{
			System.out.println("Escreva um valor: ");
			int Y = leia.nextInt();
			if (Y % 2 == 0)
			{
				par ++;
			}
			else
			{
				impar ++;
			}
		}
		System.out.println("Foram escritos "+ par +" valores pares e "+ impar +" valores impares.");
		leia.close();
	}

}
