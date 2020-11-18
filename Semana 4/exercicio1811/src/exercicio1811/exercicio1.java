package exercicio1811;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		for (int x = 1000; x <= 1999; x ++ )
		{
			if (x % 11 == 5)
			{
				System.out.println("O valor é: " + x);
			}
		}
		ler.close();
	}
}
