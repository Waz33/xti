package xti.logica;
//ArraySimples
//@author
import java.util.Arrays;
import java.util.ArrayList;

public class ArraySimples {

	public static void main(String[] args) {

		String[] paises = {"Brazil", "Russia", "Australia", "Japao"};
		//paises[2] = "New Zealand";
		//System.out.println(paises[2]);

		int[] impares = new int[4];
		impares[0] = 1;
		impares[1] = 2;
		impares[2] = 3;
		impares[3] = 4;

		//Tamanho do Array
		System.out.println(impares.length);
		
		//Methodo toString	
		System.out.println(Arrays.toString(impares));

		//Pesquisa dentro do array
		int posicao = Arrays.binarySearch(paises, "Russia");	
		System.out.println(posicao);	

		//Ordenar
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));

		//Array de Objetos
		Double[] valores = {12.35, 3526.6588};
		System.out.println(valores[0].doubleValue());

		String[] uma = {"Ricardo", "Sandra", "Francine", "Rodney"};
		System.out.println(uma[0]);

		String[][] duas = 
		{
			{"Ricardo", "male", "DF"},
			{"Sandra", "female", "AU"},
			{"Alemao", "male33", "SP"},
			{"David", "male22", "PR"}
		};

		System.out.println(duas[2][1]);
		System.out.println(duas.toString());
	
		//Classe ArrayList //Collection Framework
		ArrayList<String> cores = new ArrayList<>();
		cores.add("white");
		cores.add(0,"green");
		cores.add("Yellow");
		cores.add("Blue");
		cores.add("Black");

		//Size
		System.out.println("Tamanho = "+cores.size());
		//Get
		System.out.println("Selecionar = " + cores.get(2));
		//Indice de um elemento
		System.out.println("Indice = " + cores.indexOf("Blue"));
		//Remove
		System.out.println("Remove = " + cores.remove("Blue"));
		//Contains
		System.out.println("Contem green = " + cores.contains("green"));



		System.out.println(cores.toString());
	} 
}