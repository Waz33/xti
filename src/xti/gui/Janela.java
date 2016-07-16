package xti.gui;


import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * sdgfsd
 * sdg
 * dfg
 * 
 * gdgsfgwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
 * 
 * dfg
 * 
 * @author woz
 */


@SuppressWarnings("serial")
public class Janela extends JFrame {

	public Janela(){
		/*
		JFrame frame = new JFrame();
		
		JButton botao = new JButton("Click");
		frame.getContentPane().add(botao);

		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
		super("Minha Janela");
		JButton botao = new JButton("Click");
		getContentPane().add(botao);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {

		new Janela();
		
	}

}
