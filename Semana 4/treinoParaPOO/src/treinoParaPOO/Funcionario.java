package treinoParaPOO;

public class Funcionario {
	private String nome;
	private double salario;
	private int quantDeFilhos;
	public Funcionario(String nome, double salario, int quantDeFilhos) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.quantDeFilhos = quantDeFilhos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQuantDeFilhos() {
		return quantDeFilhos;
	}
	public void setQuantDeFilhos(int quantDeFilhos) {
		this.quantDeFilhos = quantDeFilhos;
	}

}
