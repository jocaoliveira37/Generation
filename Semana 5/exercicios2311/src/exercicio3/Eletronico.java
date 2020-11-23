package exercicio3;

public class Eletronico {
	private String tipo;
	private String marca;
	private double valor;
	private boolean aPrazo;
	private String status;
	private int quantParcela;	
	public Eletronico(String tipo, String marca, double valor, boolean aPrazo) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.valor = valor;
		this.aPrazo = aPrazo;
	}
	public int getQuantParcela() {
		return quantParcela;
	}
	public void setQuantParcela(int quantParcela) {
		this.quantParcela = quantParcela;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isaPrazo() {
		return aPrazo;
	}
	public void setaPrazo(boolean aPrazo) {
		this.aPrazo = aPrazo;
	}
	public String getStatus() {
		if (isaPrazo())
		{
		return "você parcelou em "+ quantParcela;
		}
		return "Você pagou a vista";
	}
	public void setStatus(String status) {
		this.status = status;
	}
		
	public String getFuncionando()
	{
		return "O aparelho esta funcionando";
	}
	public String getTempoGarantia()
	{
		return "A garantia é de 1 ano";
	}
}
