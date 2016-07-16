package xti.colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("jiu");
		list.add("skate");
		list.add("basket");
		list.add("ping pong");
		list.add("mma");
		list.add("jiu");
		System.out.println(list.toString());

		for (int i = 0; i < list.size(); i++) {
			String sport = list.get(i);
			list.set(i, sport.toUpperCase());
		}
		System.out.println(list);
		
		System.out.println(list.indexOf("MMA"));
		System.out.println(list.subList(2, 4));
		list.subList(2, 4).clear();
		System.out.println(list );
	}

}
