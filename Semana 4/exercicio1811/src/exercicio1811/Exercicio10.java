package exercicio1811;

import java.util.Locale;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int x = 233;
		do
		{				
			System.out.printf("%d ", x);
			if (x >= 300 && x <= 400)
			{
				x += 5;
			}
			else
			{
				x += 3;
			}
		}while (x <= 456);
	}

}
