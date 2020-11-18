package exercicios1711;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantas maçãs você quer comprar? ");
		int quant = ler.nextInt();
		double valor = 0;
			if (quant < 12 || quant < 0)
			{
				 valor = 0.3*quant;
			}
			else
			{
				 valor = 0.25*quant;
			}
		System.out.println(" O valor foi de " + valor);
		ler.close();
		
	}

}
