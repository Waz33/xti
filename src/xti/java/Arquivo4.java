package xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {


		Path p = Paths.get("C:/java/xti/files/texto.txt");
		/*System.out.println(Files.exists(p));
		System.out.println(Files.isDirectory(p));
		System.out.println(Files.isRegularFile(p));
		System.out.println(Files.isExecutable(p));
		System.out.println(Files.getLastModifiedTime(p));
		System.out.println(Files.getOwner(p));
		System.out.println(Files.probeContentType(p));
		*/
		//Delete File
		//Files.delete(p);
		//Files.deleteIfExists(p);
		
		//Create File
		//Files.createFile(p);
		//Files.write(p, "Meu Texto create".getBytes());
		
		//Copy file
		//Path copia = Paths.get("C:/java/xti/files/copia.txt");
		//Files.copy(p, copia, StandardCopyOption.REPLACE_EXISTING);

		//Move File
		Path mover = Paths.get("C:/java/xti/files/move/move.txt");
		Files.createDirectories(mover.getParent());
		Files.move(p, mover, StandardCopyOption.REPLACE_EXISTING);
	}

}
