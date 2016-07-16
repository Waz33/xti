package xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {

		//FIFO - First In First Out
		Queue<String> fila = new LinkedList<>();
		fila.add("primeiro");
		fila.add("Quinto");
		fila.add("Terceito");
		fila.offer("ultimo");
		System.out.println(fila);
		
		//topo da fila
		System.out.println(fila.peek());
		
		//remoove
		fila.poll();
		System.out.println(fila);
		
		//Outros metodos disponiveis em linkedList
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("inicio");
		f.addLast("final");
		System.out.println(f);

		System.out.println(f.peekFirst()+"___"+f.peekLast());

		f.poll();
		System.out.println(f);
	}

}
