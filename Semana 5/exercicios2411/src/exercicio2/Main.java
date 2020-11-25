package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> estoque = new ArrayList<String>();
		System.out.println("Adicionando");
		estoque.add("Tv");
		estoque.add("Monitor");
		estoque.add("Celular");
		System.out.println(estoque);
		System.out.println("Removendo");
		estoque.remove(0);
		System.out.println(estoque);
		System.out.println("Limpando");
		estoque.clear();
		System.out.println(estoque);
		estoque.add("Tv");
		estoque.add("Monitor");
		estoque.add("Celular");
		System.out.println(estoque);
		System.out.println("Atualizando");
		estoque.set(1, "Carregador");
		System.out.println(estoque);
		System.out.println("Listando");
		for (String produto : estoque) {
			System.out.println(estoque.indexOf(produto) +"|"+ produto);
		}
		
		
	}

}
