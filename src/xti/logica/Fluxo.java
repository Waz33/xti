package xti.logica;
//Fluxo de dados
// @author Wazzz

import java.util.ArrayList;
import java.util.Scanner;
public class Fluxo{
	
	public static void main(String[] args) {

		String texto = "";
		int tamanho = 20;

		for(int i=0; i<tamanho; i++){
			System.out.print("*");
			for (int j=0; j<tamanho; j++ ) {
				System.out.print("w");
			}
			System.out.print("\n");
		}

		//foreach para ArrayList ou Array
		int[] pares = {2,4,6,8,10,14};

		for (int par : pares) {
			System.out.println(par);
		}


		//ArrayList Carrega e Descarrega
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<10;i++ ) {
			if (i % 3 == 0) {
				list.add(i);	
			}
			
		}
		for(Integer num : list) {
			System.out.print(num + ",");
		}
		System.out.println("wwwwwwwwwwwwwwwwwwwwwww----While---wwwwwwwwwwwwwwwwwww");
		
		//Do-While
		int i =0;
		while(i <10) {
			System.out.println(i);
			i++;
		}

		System.out.println("wwwwwwwwwwwwwwwwwwwwwww----DO-While---wwwwwwwwwwwwwwwwwww");

		i = 1;
		do {
			System.out.print(i);
			i++;
		}while(i < 5);

		System.out.println("wwwwwwwwwwwwwwwwwwwwwww----DO-While-Example--wwwwwwwwwwwwwwwwwww");

		ArrayList<String> produtos  = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Listar: ");

		String p;
		//p = s.nextLine();
		
		while (!"fim".equals(p = s.nextLine())) {
			produtos.add(p);
		}
		
		System.out.println(produtos.toString());
		s.close();
	}
}