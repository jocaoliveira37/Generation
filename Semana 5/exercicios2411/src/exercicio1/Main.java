package exercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cavalo cavalo = new Cavalo("Pe de pano", 8);
		Cachorro cachorro = new Cachorro("Bethoveen", 3);
		Preguica preguica = new Preguica("Gertrudes", 3);

		System.out.println(cavalo.emitirSom());
		System.out.println(cachorro.emitirSom());
		System.out.println(preguica.emitirSom());
		cavalo.qualAcao();
		cachorro.qualAcao();
		preguica.qualAcao();

	}

}
