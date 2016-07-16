package xti.heranca;

public abstract class Animal {
	double peso;
	String comida;
	protected int serial;
	
	public Animal(double peso, String comida){
		this.peso = peso;
		this.comida = comida;
	}

	public void dormir(){
		System.out.println("Dormir");
	}
	
	abstract void fazerBarulho();	
	
}
