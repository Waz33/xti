package xti.heranca;

public class Galinha extends Animal implements AreaCalculavel{

	public Galinha() {
		super(3, "milho");
	}
	
	@Override
	public void fazerBarulho(){
		System.out.println("co co co co co");
	}

	@Override
	public double calculaArea() {
		return 0;
	}
	
}
