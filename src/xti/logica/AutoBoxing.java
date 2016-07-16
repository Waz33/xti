package xti.logica;
public class AutoBoxing {
	public static void main(String[] args) {

		Integer x = new Integer(555); //empacotado
		int a = x.intValue(); //desempacotar
		x++; //Incrementar
		System.out.println(x.intValue());

		Integer xx = 555;
		xx++; //desempacota, incrementa e reempacota
		System.out.println(xx);
	} 
}