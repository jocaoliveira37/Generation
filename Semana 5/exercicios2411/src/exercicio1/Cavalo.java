package exercicio1;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public String emitirSom() {
		return "Relinchar";
	}

	public void qualAcao() {
			System.out.println("Correr");
	}
}
