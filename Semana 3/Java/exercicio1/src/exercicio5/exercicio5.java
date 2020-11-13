package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva quantos anos você tem: ");
		int anos = sc.nextInt();
		System.out.println("Escreva quantos meses faz que você fez aniversário: ");
		int meses = sc.nextInt();
		System.out.println("Escreva quantos dias faz que foi o dia do seu aniversário: ");
		int dias = sc.nextInt();
		
		int dataEmDias = (anos*365) + (meses*30) + dias;
		System.out.println("Sua idade em dias é " + dataEmDias);
		sc.close();
	}

}
