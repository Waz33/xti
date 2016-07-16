package xti.poo;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setCliente("Wazzz"); 
		conta.setSaldo(33_573.02);
		conta.exibeSaldo();
		
		conta.sacar(1000);
		conta.exibeSaldo();
		
		conta.depositar(6000);
		conta.exibeSaldo();

		Conta destino = new Conta();
		destino.setCliente("caio");
		destino.setSaldo(8000);
		destino.exibeSaldo();
		
		conta.transferir(destino, 3000);
		conta.exibeSaldo();
		destino.exibeSaldo();
	}

}
