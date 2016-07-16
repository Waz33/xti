package xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException{


		//Classe Path introduzida no java7
		Path p = Paths.get("c:/java/xti/files/texto.txt"); 
		System.out.println(p.toAbsolutePath());
		System.out.println(p.getParent());
		System.out.println(p.getRoot());
		System.out.println(p.getFileName());
	
	
		//Criar diretorio para o file
		Files.createDirectories(p.getParent());
		
		//Escrever e ler files
		byte[] bytes = "Meu texto".getBytes();
		Files.write(p, bytes); //Cria, limpa e escreve no file
	
		byte[] retorno = Files.readAllBytes(p);
		System.out.println(new String(retorno));
	}

}
