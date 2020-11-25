package exercicio1;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public String emitirSom() {
		
		return "Latir";
	}

	public void qualAcao() {

		System.out.println("Correr");
	}

}
