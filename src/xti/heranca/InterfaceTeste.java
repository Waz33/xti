package xti.heranca;

public class InterfaceTeste {


	public static void area(AreaCalculavel o){
		System.out.println(o.calculaArea());
	}
	
	public static void volume(VolumeCalculavel o){
		System.out.println(o.calculaVolume());
	}
	public static void main(String[] args) {

		area(new Quadrado(4));
		volume(new Cubo(3));
		
	}

}
