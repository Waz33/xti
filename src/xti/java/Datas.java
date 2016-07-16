package xti.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {


		// 01 de Jan 1970
		System.out.println(System.currentTimeMillis());

		Date agora = new Date(); 
		System.out.println(agora);
		
		Date agora2  = new Date(1_000_000_000_000L);
		System.out.println(agora2);
		
		//Metodos
		agora.getTime();
		agora.setTime(1_000_000);
		System.out.println(agora.compareTo(agora2));


		//Calendar Gregorian
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.JANUARY, 29);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR)+" mes:"+c.get(Calendar.DAY_OF_MONTH));
	
		//Set
		c.set(Calendar.YEAR,1972);
		c.set(Calendar.MONTH,Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 28);
		System.out.println(c.getTime());
		
		//Clear
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
	
		//Add , Less
		c.add(Calendar.DAY_OF_MONTH, -1);
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());
		
		//roll - rola a contagem sem alterar as outras mes dia ano
		c.roll(Calendar.DAY_OF_MONTH, 10);
		System.out.println(c.getTime());
	
		//Saudacoes bom dia / boa tarde / boa noite
		Calendar c2 = Calendar.getInstance();
		int h = c2.get(Calendar.HOUR_OF_DAY);
		System.out.println(h);
		
		if (h < 12) {
			System.out.println("Bom dia");
		} else if(h>=12 && h<=18) {
			System.out.println("Boa tarde");
		}else if(h>=18 && h<=24){
			System.out.println("Boa noite");
		}
		
			
		
		
	}

}
