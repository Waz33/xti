package xti.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Eventos extends JFrame implements ActionListener{
	JButton botao = null;
	
	public Eventos(){
		super("Eventos");
		
		
		botao = new JButton("Click Here");
		botao.setName("botaoname");
		botao.addActionListener(this);
		getContentPane().add(botao);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
		
	}
	
		
	public static void main(String[] args) {
		new Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Clickouuuuu");
		botao.setText("Foi Clickadoooo");
		
	}

}
