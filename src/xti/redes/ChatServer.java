package xti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ChatServer {
	
	List<PrintWriter> escritores = new ArrayList<>();
	
	public ChatServer(){
		ServerSocket server;

		try {
			server = new ServerSocket(5000);
			while(true){
				Socket s = server.accept();
				new Thread(new EscutaCliente(s)).start();
				PrintWriter p = new PrintWriter(s.getOutputStream());
				escritores.add(p);
			}
		} catch(IOException e){}
	}
	
	private void encaminharParaTodos(String texto){
		for (PrintWriter w : escritores) {
			try{
				w.println(texto);
				w.flush();
			}catch(Exception e){}
		}	
	}
	private class EscutaCliente implements Runnable{
		Scanner leitor; 
		public EscutaCliente(Socket sock){
			try{
				leitor = new Scanner(sock.getInputStream());
			} catch(Exception e){}
		}
		
		@Override
		public void run() {
			try{
				String texto;
				while((texto = leitor.nextLine()) != null){
					System.out.println("::: "+texto);
					encaminharParaTodos(texto);
				} 
			}catch (Exception e){}
		}
	}	
	
	public static void main(String[] args) {
		new ChatServer();
	}

}

