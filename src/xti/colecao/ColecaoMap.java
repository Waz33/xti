package xti.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {

		Map<String, String> pais = new HashMap<>();
		pais.put("br", "brasil");
		pais.put("rs", "russia");
		pais.put("au", "australia");
		pais.put("jp", "japao");
		System.out.println(pais);
	
		System.out.println(pais.containsKey("jd"));
		System.out.println(pais.containsValue("japdo"));
		System.out.println(pais.get("br"));
		pais.remove("jp");
		System.out.println(pais);
		
		Set<String> keys = pais.keySet();

		System.out.println(pais.size());
		
		for(String key:keys){
			System.out.println(key+" ::: "+pais.get(key));
		}
	}

}
