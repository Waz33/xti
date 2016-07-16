package xti.logica;
//Exercicio Fibonacci
// @author Wazzz


public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println("wwwwwwwwwwwwwwwwwwwwwww--Fibonacci---wwwwwwwwwwwwwwwwwwwwwwwwwww");
		
		int ant = 0;
		int prox = 1;
		int r = 0;

		System.out.println(ant);
		
		for (int i=0; prox<50 ;i++ ) {
			
			System.out.println(prox);
			prox = ant + prox ;
			

			//System.out.println(ant+" + "+prox+" == "+ r);
			
			//if (prox == 0 ) prox++;	
			ant = prox - ant;
			//prox = r;
		}

		System.out.println("wwwwwwwwwwwwwwwwwwwwwww--Fibonacci-While--wwwwwwwwwwwwwwwwwwwwwwwwwww");
		prox=1;
		ant = 0;
		System.out.println(ant);
			
		while(prox<50) {
			System.out.println(prox);
			
			prox = prox + ant;
			ant = prox - ant;
		}
	}
}