package xti.logica;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args){

		System.out.println("Informe o raio: ");
		Scanner s = new Scanner(System.in);
		
		//Diametro = 2.r

		double raio = s.nextDouble();
		double diametro = 2 * raio;	
		
		System.out.println("Diametro = "+diametro);
		
		//Circunferencia 2 * PI * r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;

		System.out.println("circunferencia = "+circunferencia);

		//Area PI * r2
		double area = pi * (raio*raio);
		System.out.println("Area = " + area);
		
		s.close();
		
	}


}