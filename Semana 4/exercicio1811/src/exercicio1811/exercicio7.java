package exercicio1811;

import java.util.Locale;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int soma = 0;
		for ( int x = 0; x <= 500; x ++)
		{
			if (x % 3 == 0 && x != 0 && x % 2 != 0)
			{
				soma = soma + x;
			}
		}
		System.out.println("A soma é igual " + soma);
	}

}
