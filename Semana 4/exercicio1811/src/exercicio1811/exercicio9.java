package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int X = 0, multi = 0;
		System.out.println("Escreva um valor: ");
		X = leia.nextInt();
		while (X < 100) {
			multi = 3 * X;			
			X = multi;
		System.out.println(" Os valores são: "+ multi);
		}
	leia.close();	
	}
}
