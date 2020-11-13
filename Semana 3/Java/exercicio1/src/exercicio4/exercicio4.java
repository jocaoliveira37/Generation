package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto tempo durou a operação? ");
		int tempo = sc.nextInt();
		int horas = tempo / 3600;
		int minutos = (tempo % 3600) / 60;
		int segundos = ((tempo % 3600) % 60);
		System.out.println(
				"O tempo de trabalho foi de " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
		sc.close();

	}

}
