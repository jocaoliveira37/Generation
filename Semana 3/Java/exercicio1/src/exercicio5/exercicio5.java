package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva quantos anos voc� tem: ");
		int anos = sc.nextInt();
		System.out.println("Escreva quantos meses faz que voc� fez anivers�rio: ");
		int meses = sc.nextInt();
		System.out.println("Escreva quantos dias faz que foi o dia do seu anivers�rio: ");
		int dias = sc.nextInt();
		
		int dataEmDias = (anos*365) + (meses*30) + dias;
		System.out.println("Sua idade em dias � " + dataEmDias);
		sc.close();
	}

}
