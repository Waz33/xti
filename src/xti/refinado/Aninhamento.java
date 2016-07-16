package xti.refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame {
	JButton botao;
	
	public class ListenerAninhado implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(botao.getText());
		}
	}
	
	public Aninhamento(){
		super("janela");
		
		botao = new JButton("Click");
		botao.addActionListener(new ListenerAninhado());
		
		botao.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe Anonima::: "+botao.getText());
			}
		});
				
		getContentPane().add(botao);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		Aninhamento janela  = new Aninhamento();
		
		//
		Aninhamento.ListenerAninhado listener = 
				janela.new ListenerAninhado();
	}
}
