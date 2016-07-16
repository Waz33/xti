package xti.heranca;

public class OperacaoMatTeste {

	//Com Polimorfismo
	public static void calcule(OperacaoMatematica o, double x, double y){
		System.out.println(o.calcular(x, y));
	}

	//Sem polimorfismo
	public static void calculeSemPolimorfismo(String o, double x, double y){
		if (o.equals("Soma")) {
			System.out.println(x+y);
		} else if (o.equals("Multiplicacao")) {
			System.out.println(x*y);
		}
	}

	public static void main(String[] args) {

		//calcule(new Soma(), 5, 5);
		//calcule(new Multiplicacao(),5,5);
		
		calculeSemPolimorfismo("Multiplicacao", 4,3);
	}

}
