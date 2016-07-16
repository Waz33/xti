package xti.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) {


		double saldo = 32_562.08;

		//Generico
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));
		
		//Inteiros
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));

		//Percentuais
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));

		//Moeda Currency
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));
		
		f.setMaximumFractionDigits(1);
		System.out.println(f.format(saldo));

		//Internacionalizacao
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));
		
	}

}
