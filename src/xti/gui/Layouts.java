package xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Layouts extends JFrame{

	public Layouts(){
		super("TituloLayouts");
		
		Container c = getContentPane();
		//BorderLayout border = new BorderLayout();
		FlowLayout flow = new FlowLayout();
		c.setLayout(flow);
		c.add(BorderLayout.NORTH, new JButton("Norte"));
		c.add(BorderLayout.EAST, new JButton("Leste"));
		c.add(BorderLayout.CENTER, new JButton("Botao Centro"));
		c.add(BorderLayout.SOUTH, new JButton("Sul"));
		c.add(BorderLayout.WEST, new JButton("Oeste"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Layouts();
	}

}
