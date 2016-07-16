package xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * try/ catch / finally
 * 
 * @author Wazzz 
 */
public class DividePorZero {
	
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException
	{
		System.out.println("Numeros: ");
		int a = s.nextInt();
		System.out.println("Divisor: ");
		int b = s.nextInt();
		
		//InputMismatchException
		//AritmeticException 0
		
		System.out.println(a/b);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		do{
			try{
				dividir(s);	
				continua = false;
			}
			catch(InputMismatchException | ArithmeticException e){
				System.err.println("Somente numeros inteiros");
				//e.printStackTrace();
				//e.getStackTrace();
				e.getMessage();
				s.nextLine();//Descarta a entrada e libera para o user
			}
			finally{
				System.out.println("Finally Executado!!!");
			}
		}while(continua);
		
			
	}

}
