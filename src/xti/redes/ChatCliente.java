package xti.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatCliente extends JFrame{

	JTextField textoParaEnviar;
	JTextArea textoRecebido;
	PrintWriter escritor, pw;
	Socket sock;
	String nome;
	Scanner leitor;
	
	private class EscutaServidor implements Runnable{

		
		@Override
		public void run() {
			try{
				String texto;
				while((texto = leitor.nextLine()) != null){
					textoRecebido.append(texto+"\n");
				}
			}catch(Exception e){}
		}
	}

	public  class EnviarListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			escritor.println(nome + ": " +textoParaEnviar.getText());
			escritor.flush();
			textoParaEnviar.setText("");
			textoParaEnviar.requestFocus();
		}
	}

	public ChatCliente(String nome){
		super("Chat Cliente: " + nome);
		this.nome = nome;
		
		Font fonte = new Font("serif", Font.PLAIN, 26);
		
		textoParaEnviar = new JTextField();
		textoParaEnviar.setFont(fonte);
		
		JButton botao = new JButton("Enviar");
		botao.setFont(fonte);
		botao.addActionListener(new EnviarListener());
		

		Container envio = new JPanel();
		envio.setLayout(new BorderLayout());
		envio.add(BorderLayout.CENTER, textoParaEnviar);
		envio.add(BorderLayout.EAST, botao);
		getContentPane().add(BorderLayout.SOUTH, envio);
		textoRecebido = new JTextArea();
		JScrollPane scroll = new JScrollPane(textoRecebido);
		getContentPane().add(BorderLayout.CENTER, scroll);
		
		
		configurarRede();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	private void configurarRede(){
		 try{
			 sock = new Socket("127.0.0.1", 5000);
			 escritor = new PrintWriter(sock.getOutputStream());
			 leitor = new Scanner(sock.getInputStream());
			 new Thread(new EscutaServidor()).start();
		 } catch(Exception e){}
	 }
	
	public static void main(String[] args) {
		new ChatCliente("Waz");
		new ChatCliente("Kloros");
		
	}

}
