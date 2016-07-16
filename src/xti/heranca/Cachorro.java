package xti.heranca;

public class Cachorro extends Animal{

	public Cachorro() {
		super(30, "carne");
	}

	@Override
	public void fazerBarulho(){
		System.out.println("Au au au aua u");
	}
}
