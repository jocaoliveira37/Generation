package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int idade = 0 , menor21 = 0, maior50 = 0;
		while ( idade != -99 )
		{
			System.out.println("Escreva uma idade");
			idade = leia.nextInt();
			if (idade < 21 && idade > 0)
			{
				menor21 ++;
			}
			else if (idade > 50)
			{
				maior50 ++;
			}
		}
		System.out.println("Foram " + menor21 +" menores de 21 e " + maior50 +" maior de 50");
	leia.close();
	}
}
