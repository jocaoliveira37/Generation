package exercicio1;

public class Cliente {
	
	private String nome;
	private String rg;
	private String CPF;
	private String  telefone;
	private String CEP;	
	
	public Cliente(String nome, String rg, String cPF, String telefone, String cEP) {
		super();
		this.nome = nome;
		this.rg = rg;
		CPF = cPF;
		this.telefone = telefone;
		CEP = cEP;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getStatus() {
		return "Compra Executada com sucesso";
	}
}
