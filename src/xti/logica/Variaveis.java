package xti.logica;
//Show values from the variables
//@author Wazzz

public class Variaveis{

	public static void main(String[] args) {

		//Variaveis Primitivas	
		String nome = "Wazny", lastName = "Kloros";
		short idade = 33;
		int n = 1234566;
		boolean casado = false;

		idade = (short)n;
		System.out.println("Text");
		System.out.println(nome);
		System.out.println( lastName);
		System.out.println(idade);
		System.out.println(casado);

	
		//Variaveis de referencia
		String y = "XTI";

		//Wrappers primitivas
		Integer num = new Integer(33);
		Double d = new Double(15.69);
		Long l = new Long(123456789);

		int nn = num.intValue();		 
		System.out.println(nn);

		//Conversao Estatica
		double d1 = Double.parseDouble("123.54");
		int i1 = Integer.parseInt("456");
		float f1 = Float.parseFloat("3.36F");

		int i2 = Integer.valueOf("011110",2);
		System.out.println(i2);
		
		

	}

}