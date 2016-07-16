package xti.java;

public class StringMutavel {

	public static void main(String[] args) {


		StringBuffer s1 = new StringBuffer();
		StringBuilder s2 = new StringBuilder("Java");
	
		s1.toString();
		s2.length();
		System.out.println(s2);
		s2.reverse();
		System.out.println(s2);
		
		s2.append(" Trabalhando ");
		char[] c = {'c', 'o','m'};
		s2.append(c).append(" texto");
		System.out.println(s2);
		
		String sb = new StringBuilder("Oi").append(" como").append(" vai").append(" voce?").toString();
		System.out.println(sb);
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println(url);
		
	}

}
