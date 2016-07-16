package xti.refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	//Recursivo 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1 +(0)
	public static int soma(int x){
		if (x == 0) {
			return x;
		} else {
			System.out.println(x);
			return x + soma(x-1);
		}
	}
	
	//potencia 3*4 = 3*3*3*3
	public static int potencia(int x, int e){
		if (e == 1) {
			System.out.println(x);
			return x;
		} else {
			int y = x  * potencia(x, (e-1));
			System.out.println(y);
			return y;
		}
	}
	
	//Listar diretorios e seus conteudos
	public static void listar(Path p){
		if (Files.isRegularFile(p)) {
			System.out.println("\t"+p.toAbsolutePath());
		} else {
			String s = p.toAbsolutePath().toString();
			System.err.println(s.toUpperCase());
			try(DirectoryStream<Path> stream = Files.newDirectoryStream(p)){
				for(Path pp : stream){
					listar(pp);
				}
			} catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(soma(10));
		System.out.println(potencia(3,4));
	
		listar(Paths.get("c:/java/xti/files/"));
	}

}
