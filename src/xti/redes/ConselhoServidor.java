package xti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(5000);//porta tcp para responder o cliente
		while(true){
			Socket socket = server.accept();
			try(PrintWriter pw = new PrintWriter(socket.getOutputStream())){
				pw.println("Learn java and be hired!!!");
			}
			server.close();
		}
	}

}
