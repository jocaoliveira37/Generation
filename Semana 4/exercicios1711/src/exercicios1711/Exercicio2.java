package exercicios1711;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Locale.setDefault(Locale.US);
			Scanner ler = new Scanner(System.in); 
			int senha;
			do
			{
				System.out.println("Escreva uma senha ");
				senha = ler.nextInt();
				if (senha == 1234)
				{
					System.out.println("Acesso Permitido");
				}
				else
				{
					System.out.println("Acesso Negado");
				}
			}
			while (senha != 1234);
	ler.close();
	}

}
