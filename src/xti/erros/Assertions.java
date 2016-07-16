package xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {

		try(Scanner s = new Scanner(System.in)){
			
			System.out.println("Numero de zero a dez::");
			int num = s.nextInt();
			
			assert(num >= 0 && num <= 10) : "Numero invalido== " + num;
				
			System.out.println("Digitado:::"+num);
		}catch(Exception e){}
	}

}
