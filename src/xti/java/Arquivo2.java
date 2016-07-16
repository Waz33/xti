package xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException  {

		
		Path p = Paths.get("C:/java/xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		/////A partir do java7 nao precisa do modo como estaa nos comentarios
		//BufferedWriter w = null;
		try(BufferedWriter w = Files.newBufferedWriter(p, utf8)){
			//w = Files.newBufferedWriter(p, utf8);
			w.write("Texto2\n");
			w.write("Texto3");
			//w.flush();
		}catch(IOException e) {
			e.printStackTrace();;
		} //finally{
		//	if (w != null) {
		//		w.close();
		//	}	
		//}
		
		//Leitura
		try(BufferedReader r = Files.newBufferedReader(p,utf8)){
			String linha = null;
			while((linha = r.readLine()) != null) {
				System.out.println(linha);
			} 
		}
		catch(IOException e){
			e.printStackTrace();
		}
	
	}

}
