package exercicio1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente joca = new Cliente("Joca","12346.8","358521","13272000","44263868864");
				
		System.out.println("Nome: " + joca.getNome()+ " Rg: " + joca.getRg() + " CPF: "
				+ ""+ joca.getCPF() + " Telefone: " + joca.getTelefone()+ " CEP: " + joca.getCEP() + " Status da Compra " + joca.getStatus());
			}

}
