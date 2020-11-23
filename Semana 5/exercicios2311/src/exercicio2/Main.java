package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String horas;
		System.out.println("Que horas são: ");
		horas = leia.next();
		Airplane azul = new Airplane();
		azul.setHoras(horas);
		azul.setnVoo("6565");
		azul.setSaida("Campinas");
		azul.setDestino("Maceio");
		azul.setnAcento(195);
		azul.setPesoMala(45);
		azul.setQuantPassageiro(160);
		
		System.out.println("Agora são : "+ azul.getHoras()+ " Horas, e você esta indo para "
                + azul.getDestino() + "\nO número do seu acento é : " + azul.getnAcento()
                + "\nO número do seu voo é : " + azul.getnVoo() + " verifique se esta correto"
                        + "\nO peso maximo permitido da bagagem é de: " + azul.getPesoMala()
                        + "\nA saída do seu voo está programada para as " + azul.getSaida()
                        + "\nE o status do seu voo é: " + azul.getStatus());
		
		leia.close();
	}

}
