package xti.java;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {


		//Diretorios raizes
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for(Path p : dirs){
			System.out.println(p);
		}
		
		////Lista conteudo Dir
		Path dir = Paths.get("C:/java/xti/files/");
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
			for(Path p : stream){
				System.out.println(p.getFileName());;
			}
		} catch(IOException | DirectoryIteratorException e){
			e.printStackTrace();
		}
		
		//Particoes
		FileSystem fs = FileSystems.getDefault();
		for(FileStore store : fs.getFileStores()){
			System.out.println("Unidade:: "+store.toString());;
			System.out.println("Capacidade:::"+store.getTotalSpace());
			System.out.println("Disponivel:::"+store.getUsableSpace());
			System.out.println("Utilizada:::"+(store.getTotalSpace()-store.getUsableSpace()));
		}
			
				
	}	
}
