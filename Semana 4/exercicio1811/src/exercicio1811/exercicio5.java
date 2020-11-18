package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int contador = 0, soma = 0, valor = 0;
		do {
			System.out.println("Escreva um valor: ");
			if (valor % 3 == 0 && valor != 0) {
				contador++;
				soma = soma + valor;
			}
			valor = leia.nextInt();
		} while (valor != 0);
		int media = soma / contador;
		System.out.println("A média dos multiplos de 3 é " + media);
		leia.close();
	}

}
