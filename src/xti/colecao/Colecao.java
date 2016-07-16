package xti.colecao;
//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwEgit
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("E"));
		c.remove("I");
		System.out.println(c.toString());
	
		//Grupos
		Collection<String> c2 = Arrays.asList("O","U");
		c.addAll(c2);
		System.out.println(c.toString());
		
		System.out.println(c.containsAll(c2));//verifica se existe todos os elementos de c2 em c
		
		c.removeAll(c2);
		System.out.println(c.toString());
		
		//Percorrer os elementos
		for(String string:c){
			System.out.println("__"+string);
		}

		//Converter Collection em Array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
	
		//Limpa toda a collection
		c.clear();
		System.out.println(c);
		
	}

}
