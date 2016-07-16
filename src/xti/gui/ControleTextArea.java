package xti.gui;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener{
	//AutoGerada pelo compilador
	private static final long serialVersionUID = 1831543156374480193L;
	
	JTextArea texto; 
	
	public ControleTextArea(){
		super("Controle Text Area");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);

		texto = new JTextArea();
		JScrollPane scroll = new JScrollPane(texto);
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		
		JButton abrir = new JButton("Abrir");
		abrir.setFont(new Font("serif", Font.PLAIN, 26));
		abrir.addActionListener(this);
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.NORTH, abrir);
		c.add(BorderLayout.SOUTH, abrir);
		
	}
	
	
	public static void main(String[] args) {
		new ControleTextArea();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("abrirrrrrrrrrr");		
		JFileChooser arq = new JFileChooser();
		arq.showOpenDialog(this);
		File file = arq.getSelectedFile();
		try{
			Path p = Paths.get(file.getAbsolutePath());
			String retorno = new String(Files.readAllBytes(p));
			texto.setText(retorno);
		}catch(Exception e){
			JOptionPane.showMessageDialog(this,  "Nao deu veiii...");
		}
	}

}
