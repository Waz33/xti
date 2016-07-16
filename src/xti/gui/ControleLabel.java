package xti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2293218096267743477L;

	public ControleLabel(){
		super("ControleLabel");
		
		Container c = getContentPane();
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28 );
		JLabel label = new JLabel("LABELLLL SIMPLES");
		label.setToolTipText("TOOLTIPTEXT");
		label.setFont(fonte);
		label.setForeground(Color.GREEN);
		//Somente png
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/lv3.png"));

		JLabel imagem = new JLabel(icon);
		c.setLayout(new FlowLayout());
		c.add(imagem);
		c.add(label);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ControleLabel();
	}
}
