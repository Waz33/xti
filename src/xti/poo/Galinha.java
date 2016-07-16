package xti.poo;

public class Galinha {

	public static int ovosDaGranja; //Variavel global, criada apenas uma vez, serve para toda a aplicacao
	public int ovos;//total de ovos do obj Galinha
		
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaOvos(double galinhas){
	
		return Galinha.ovosDaGranja / galinhas;
	}

}
