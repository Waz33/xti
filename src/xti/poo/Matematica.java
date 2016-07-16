package xti.poo;

/**
 * 
 * @author woz
 *Retorna o maior dos 2 numeros
 */

public class Matematica {
	
	public int maior(int um, int dois){
		if(um > dois){
			return um;
		} else{
			return dois;
		}	
	}

	public double soma(double um, double dois){
		double s = um + dois;
		System.out.println(s);
		return (um + dois);
	}

	double soma2(double... numeros){
		double total = 0;
		
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
	double soma3(double[] numeros){
		double total = 0;
		for(double n:numeros){
			total += n;
		}
		return total;
	}
	
	public int mediaw(int x, int y){
		return (x+y)/2;
	}
	
	double media(int x){
		System.out.println("Recebeu apenas 1 parametro:"+ x);
		return x;
	}

	double media(double... x){
		
		System.out.println("Recebeu array de parametro:"+ x);
		
		return this.soma2(x)/x.length;
	}

	public double media(String x, String y){
		System.out.println("Recebendo Strings");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix+iy)/2;
	}

}
