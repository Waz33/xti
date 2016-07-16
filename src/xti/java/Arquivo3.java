package xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import xti.poo.Conta;

public class Arquivo3 {

	private static Path p = Paths.get("C:/java/xti/files/contas.txt");
	private static Charset utf8 = StandardCharsets.UTF_8;

	
	public static void main(String[] args) throws IOException {

		
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 12.532));
		contas.add(new Conta("Claudiaaaaaaa", 15.2));
		contas.add(new Conta("Beatriz", 5.11));
		contas.add(new Conta("Sandra", 1.66));
		

		//Arquivo3 operacao = 
				new Arquivo3();
		//operacao.ArmazenarContas(contas);
		ArrayList<Conta> contas2 = Arquivo3.RecuperarContas();
		
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		}
	}

	public void ArmazenarContas(ArrayList<Conta> contas) throws IOException{
		try(BufferedWriter w = Files.newBufferedWriter(p, utf8)){
			for (Conta c : contas) {
				w.write(c.getCliente()+","+c.getSaldo()+"\n");
			}
		}
	}

	public static ArrayList<Conta> RecuperarContas() throws IOException{
		ArrayList<Conta> contas = new ArrayList<>();
		try(BufferedReader r = Files.newBufferedReader(p, utf8)){
			String line = null;
			while((line = r.readLine())  != null) {
				String[] t = line.split(",");
				//System.out.println(t[0]+t[1]);
				//System.out.println(line);
				
				Conta cc = new Conta(t[0], Double.parseDouble(t[1]));
				//cc.exibeSaldo();
				contas.add(cc);
			}			
		}		
		return contas ;
	}
}
