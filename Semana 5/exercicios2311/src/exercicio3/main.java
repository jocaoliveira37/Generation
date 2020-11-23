package exercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int parcelas;
		
		Eletronico tv8k = new Eletronico("televisor", "Xaomi", 16000.00, true);
		if (tv8k.isaPrazo())
		{
			System.out.println("Escreva a quantidade de parcelas: ");
		parcelas = leia.nextInt();
		tv8k.setQuantParcela(parcelas);
		}
		System.out.println("Você adquiriu: "+ tv8k.getTipo() + " marca: "+ tv8k.getMarca()+ " no valor de: " + tv8k.getValor()+ ""
				+ " e o status da sua compra é : " + tv8k.getStatus());
		System.out.println("Pelos nossos teste " + tv8k.getFuncionando() + " e " + tv8k.getTempoGarantia());
		
	leia.close();
	}

}
