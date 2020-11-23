package treinoParaPOO;

import java.util.Scanner;

public class Resolvendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int populacao = 0, contador = 0;

		System.out.println("Escreva quantos funcionários são: ");
		populacao = leia.nextInt();
		Funcionario[] funcionarios = new Funcionario[populacao];
		for (contador = 0; contador < populacao; contador ++)
		{
			System.out.println("Escreva o nome do funcionario: ");
			String nome1 = leia.next();
			System.out.println("Qual o salário? ");
			double salario = leia.nextDouble();
			System.out.println("Quantos filhos tem? ");
			int filhos = leia.nextInt();
			Funcionario func = new Funcionario(nome1, salario, filhos);
			funcionarios[contador] = func;
		}
		for (Funcionario funcionario:funcionarios)
		{
			System.out.println("Nome: " + funcionario.getNome()+" "+ funcionario.getSalario()+" "+ funcionario.getQuantDeFilhos());
		}
		
		leia.close();
	}
}
