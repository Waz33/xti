package xti.poo;

public class Conta implements java.io.Serializable {
	//Serializacao de objetos e a gravacao de um objeto em um arquivo texto
	
	//Variaveis transient nao sao serializadas
	//transient double saldo2
	
	//Variaveis static nao sao serializadas
	static int x; 
	
	
	public String clienteReflexao; //pode ver apenas atributos puplic
	public double saldoReflexao;
	
	
	private	String cliente;
	private double saldo;
		
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}

	public Conta(){
		
	}
	public Conta(String cliente, double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	
	public void exibeSaldo(){
		System.out.println("Cliente: "+cliente+" seu saldo e: "+saldo);
	}
	
	public void sacar(double valor){
		//saldo = saldo - valor
		saldo -= valor;		
	}
	
	public void depositar(double valor){
		saldo += valor;
	}
	
	public void transferir(Conta destino, double valor){
		this.sacar(valor);
		destino.depositar(valor);
	}
}