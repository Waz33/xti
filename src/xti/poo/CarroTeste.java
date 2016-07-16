package xti.poo;

public class CarroTeste {

	public static void main(String[] args) {

		Carro ferrari = new Carro();
		ferrari.modelo = "ferrari";
		ferrari.velocidadeMaxima = 300;
		ferrari.segundosZeroACem = 5.9;
		Carro fusca = new Carro("fusca",50,23.5);
		
		Motor v12 = new Motor();
		v12.tipo = "v12";
		v12.potencia = 660;
		ferrari.motor = v12; //Add o motor ao carro

		System.out.println(fusca.modelo);
		System.out.println(ferrari.modelo);

		//Furgao com Motor
		Carro furgao = new Carro("furgao",10,7);
		Motor v8 = new Motor("v8", 900); 
		furgao.motor = v8;
		
		//Bugatti com Motor
		Carro bugatti = new Carro("bugatti",33,9, new Motor("w16", 1200));
		//Motor v8 = new Motor("v8", 900); 
		//bugatti.motor = v8;

		System.out.println(bugatti.modelo+" motor: "+bugatti.motor.potencia);

	}

}
