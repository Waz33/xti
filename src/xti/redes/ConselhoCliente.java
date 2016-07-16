package xti.redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s = new Socket("127.0.0.1", 5000); //localhost, tcp porta reservada ate 1023
		Scanner scan = new Scanner(s.getInputStream());
		System.out.println("Mensagem::: "+scan.nextLine());
		scan.close();
		s.close();
	}

}
