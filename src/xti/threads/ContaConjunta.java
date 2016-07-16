package xti.threads;

public class ContaConjunta {
	
	private double saldo = 100;
	
	public double getSaldo() {
		return saldo;
	}
	
	public synchronized void sacar(double valor, String cliente) throws InterruptedException{
		
		if(saldo >= valor){
			double saldoOriginal = saldo;
			System.out.println("Sacar");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
			saldo -= valor;
			String msg = cliente + " Sacouuu :  "+valor
					+" Saldo Original="+ saldoOriginal 
			+ ", Saldo final::: "+ saldo; 
			
			System.out.println(msg);
		} else {System.out.println("Nao tem saldo - suficiente");}	
	}
}
