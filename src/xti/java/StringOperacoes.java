package xti.java;

public class StringOperacoes {

	public static void main(String[] args) {

		String s1 = "Write once";
		String s2 = s1 + " Run Anywhere";
		String s3 = s2 + new String("Java Virtual Machine");
		char[] array = { 'J', 'a', 'v', 'a' };
		String s4 = new String(array);
		System.out.println("s4 = " + s4);
		System.out.println("s3 = " + s3);

		// Operacoes
		System.out.println("s1 tamanho = " + s1.length());
		System.out.println("s1 letra = " + s1.charAt(0));
		System.out.println("s1 letra = " + s1.charAt(0));
		System.out.println("s1.toString() = " + s1.toString());

		// Localizacao
		int posicao = s3.indexOf('a');
		System.out.println("s3 posicao = " + posicao);
		boolean vazia = s3.isEmpty();
		System.out.println(vazia);

		// Comparacao
		String xti = "XTI";
		boolean x = xti.equalsIgnoreCase("xti");
		System.out.println(x);
		boolean y = xti.equals("xti");
		System.out.println(y);

		// int c = "amor".compareTo("bola");//-1
		int c = "bola".compareTo("amor");// +1
		System.out.println(c);

		String so = "Olhe, olhe";
		boolean o = so.regionMatches(true, 6, "Olhe", 0, 4);
		System.out.println(o);

		String l = "O Brasil e lindo";
		String sl = l.substring(11);
		String sl2 = l.substring(2, 8);
		System.out.println(sl);
		System.out.println(sl2);

		sl = l.concat(" que maravilha");
		System.out.println(sl);

		sl = sl.replace('s', 'z');
		sl = sl.replaceFirst(" ", "x");
		sl = sl.replaceAll(" ", "X");
		sl = sl.toLowerCase();
		sl = sl.toUpperCase();
		System.out.println(sl);

		System.out.println("    espa  cos   ".trim());
		;

	}

}
