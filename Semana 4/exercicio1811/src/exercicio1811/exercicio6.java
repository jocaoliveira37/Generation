package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int contador = 0, total = 0, totalFilhos = 0, menor100 = 0;
		for (int x = 0; x < 20; x ++)
		{
			System.out.println("Escreva o valor do sal�rio: ");
			int salario = leia.nextInt();
			total = total + salario;
			System.out.println("Escreva a quantidade de filhos: ");
			int filhos = leia.nextInt();
			contador ++;
			totalFilhos = totalFilhos + filhos;
			if ( salario <= 100)
			{
				menor100 ++;
			}
			
		}
		int mediaSalario = total / contador;
		int mediaFilhos = totalFilhos / contador;
		int percentual = (menor100 * 100)/20;
		System.out.println("A m�dia do sal�rio � " + mediaSalario + " e "
				+ "a m�dia de filho � "+ mediaFilhos+ " e o percentual � de " + percentual+"%");
		leia.close();
	}

}
