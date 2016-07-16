package xti.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;

public class Sistemas {

	public static void main(String[] args) throws IOException {
		
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		//p.setProperty("xti.gui.Calculadora", value)
		
		//Set<Object> pk = p.keySet();
		//for (Object key : pk) {
		//	System.out.println(key+" = "+p.get(key));
		//}
		
		//Este app so pode ser executada pelo DOS c:/java/xti/bin>java xti.java.Sistemas
		Console c = System.console();
		System.out.println("Usuario:");
		String user = c.readLine();
		System.out.println("Senha:");
		char[] pass = c.readPassword();
		System.out.println("Usuario: "+user+" Senha: "+new String(pass));

		Runtime.getRuntime().exec("notepad");
	}

}
