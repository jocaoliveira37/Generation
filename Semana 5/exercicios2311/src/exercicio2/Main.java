package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String horas;
		System.out.println("Que horas s�o: ");
		horas = leia.next();
		Airplane azul = new Airplane();
		azul.setHoras(horas);
		azul.setnVoo("6565");
		azul.setSaida("Campinas");
		azul.setDestino("Maceio");
		azul.setnAcento(195);
		azul.setPesoMala(45);
		azul.setQuantPassageiro(160);
		
		System.out.println("Agora s�o : "+ azul.getHoras()+ " Horas, e voc� esta indo para "
                + azul.getDestino() + "\nO n�mero do seu acento � : " + azul.getnAcento()
                + "\nO n�mero do seu voo � : " + azul.getnVoo() + " verifique se esta correto"
                        + "\nO peso maximo permitido da bagagem � de: " + azul.getPesoMala()
                        + "\nA sa�da do seu voo est� programada para as " + azul.getSaida()
                        + "\nE o status do seu voo �: " + azul.getStatus());
		
		leia.close();
	}

}
