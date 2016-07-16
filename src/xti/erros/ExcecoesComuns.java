package xti.erros;
import xti.heranca.Animal;
import xti.heranca.Galinha;
import xti.heranca.Cachorro;


public class ExcecoesComuns {
	static int[] arrayNull = new int[0];
	
	public static void main(String[] args){
		
		//NullPointerException
		//System.out.println(arrayNull.length);
	
		//AritimeticException
		//int x = 3/0;
		
		//ArrayIndexOutOfBoundsException
		//System.out.println(arrayNull[1]);
	
		//ClassCastException
		//Animal g = new Galinha();
		//Cachorro c = (Cachorro) g;
	
		//NumberFormatException
		int inteiro = Integer.parseInt("x");
		
	}
	

}
