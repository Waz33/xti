package xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); 
		list.add("mangostin");
		list.add("uva");
		list.add("banana");
		list.add("avocado");
		list.add("guava");
		list.add("mellon");
		list.add("cocoa");
		list.add("acai");
		System.out.println(list);
	
		//Ordenacao
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.addAll(list, "cupuacu", "tangerina", "uva");
		System.out.println(list);
				
		//Frequencia
		System.out.println(Collections.frequency(list, "uva"));
	
		List<String> l2 = Arrays.asList("acerola", "abacaxi");
		boolean d = Collections.disjoint(list, l2);
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "uva");
		System.out.println(indice);
		
		Collections.fill(l2, "wazzz");
		System.out.println(l2);
		
		//Nao modificavel
		Collection<String> constante = Collections.unmodifiableCollection(list);
		
		
	}

}
