package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva sua idade em dias: ");
		int idade = sc.nextInt();
		int anos = idade / 365;
		int meses = (idade % 365)/30;
		int dias = (idade % 365) % 30;
		System.out.println("Sua idade � " + anos+ " anos " + meses + " meses " + dias + " dias");
		sc.close();
	}

}
