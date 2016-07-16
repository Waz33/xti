package xti.heranca;

public class AnimalTeste {

	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		c.comida = "osssso";
		c.fazerBarulho();
		
					
		Galinha g = new Galinha();
		g.comida = "milho";
		g.fazerBarulho();
		
		//Nao pode ser instaciada, pois e classe abstracta
		//Animal generico = new Animal(0,null);
		//generico.fazerBarulho();
		
		//barulho(g);
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
	}

	//Sem poimorfismo
	public static void barulhoSemPolimorfismo(String animal){
		if (animal.equals("Cachorro")) {
			System.out.println("aaaaaaaa");
		} else if (animal.equals("Galinha")) {
			System.out.println("co ccccccccccc");
		}
	}

	//Com poimorfismo
	public static void barulho(Animal animal){
		animal.fazerBarulho();
	}
}
