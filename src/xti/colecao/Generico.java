package xti.colecao;

import java.util.ArrayList;

public class Generico <E> {
	
	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
	}
	
	public E getElemento(){
		return elemento;
	}
	
	public double soma(ArrayList<? extends Number> lista){
		double total = 0;
		for(Number number : lista){
			total += number.doubleValue();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		Generico<String> g = new Generico<>();
		g.setElemento("lago paranoa, o maior lago urbano");
		//g.setElemento(1235456);
		String e = g.getElemento().toUpperCase();

	}

}
