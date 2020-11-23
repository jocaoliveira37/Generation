package exercicio2;

public class Airplane {
	public String nVoo;
	public String destino;
	public String saida;
	public int nAcento;
	public int quantPassageiro;
	public int pesoMala;
	public String horas;

	public String getnVoo() {
		return nVoo;
	}
	public void setnVoo(String nVoo) {
		this.nVoo = nVoo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	public int getnAcento() {
		return nAcento;
	}
	public void setnAcento(int nAcento) {
		this.nAcento = nAcento;
	}
	public int getQuantPassageiro() {
		return quantPassageiro;
	}
	public void setQuantPassageiro(int quantPassageiro) {
		this.quantPassageiro = quantPassageiro;
	}
	public int getPesoMala() {
		return pesoMala;
	}
	public void setPesoMala(int pesoMala) {
		this.pesoMala = pesoMala;
	}
	public String getHorario()
	{
		return "Sairá às 13:30";
	}
	public String getStatus()
	{
		return "Decolando";
	}
	public String getHoras()
	{
		return horas;
	}
	
}
