package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o custo de f�brica do carro produzido? ");
		double valor = sc.nextDouble();
		double valorTotal = valor + (valor * 0.28) + (valor * 0.45);
		System.out.println("O valor total do carro ser�: " + valorTotal);
		sc.close();
	}

}
