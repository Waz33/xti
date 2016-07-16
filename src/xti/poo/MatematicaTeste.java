package xti.poo;

public class MatematicaTeste {

	public static void main(String[] args) {

		Matematica m = new Matematica();
		int maiorx = m.maior(10,20);
		System.out.println("Maior:"+maiorx);
		
		double s =  m.soma(4,7.32);
		System.out.println("Soma: "+s);
		
		double ss = m.soma(m.maior(2,4), m.maior(3,5));
		System.out.println("Soma dos maiores:  "+ss);
	
		double sss = m.soma2(2,2,2,2,2,2,2);
		System.out.println(sss);
		
		double[] numeros = {2,2,2,2,};
		
		double ssss = m.soma3(numeros);
		System.out.println("Soma3 Arrray: "+ssss);
		
		//Metodos com assinaturas diferentes
		System.out.println("Media:"+m.media(5, 3));
		
		//Media de 1 numeros vai procurr o metodo q possui apenas 1 parametro
		System.out.println("Media:"+m.media(5));
				
		//Sobrecarga de metodos, encontra o metodo adequado para as variaveis 
		System.out.println(m.media("5", "3"));

		//Array de parametros
		System.out.println(m.media(3,4,6));
	
	}
	

}
