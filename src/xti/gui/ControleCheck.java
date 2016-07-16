package xti.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField texto;
	JCheckBox bold, italico;
	
	class BoldCheckBoxListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent arg0) {
			System.out.println("mudarrrrrrrrr"); 
			
			if(bold.isSelected() && italico.isSelected()){
				texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
			} else if(bold.isSelected()){
				texto.setFont(new Font("serif", Font.BOLD, 26));
			} else if(italico.isSelected()){
				texto.setFont(new Font("serif", Font.ITALIC, 26));
			}
		}
	}
	public ControleCheck(){
		super("Controle Check");
		texto = new JTextField("Fonte");
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		
		bold = new JCheckBox("bold");
		bold.addItemListener(new BoldCheckBoxListener());
		italico = new JCheckBox("italico");
		italico.addItemListener(new BoldCheckBoxListener());

		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(bold);
		c.add(italico);
		c.add(texto);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ControleCheck();
	}
}
