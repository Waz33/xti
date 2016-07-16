package xti.poo;

public class GalinhaTest {

	public static void main(String[] args) {

		Galinha g = new Galinha();
		g.botar().botar().botar();
		
		Galinha g2 = new Galinha();
		g2.botar().botar();
    	
		System.out.println(g.ovos);
		System.out.println(g2.ovos);
		System.out.println(Galinha.ovosDaGranja);
		System.out.println(Galinha.mediaOvos(2));
	}


}
