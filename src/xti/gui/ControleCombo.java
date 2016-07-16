package xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/lv3.png")),
			new ImageIcon(getClass().getResource("fotos/aa.png")),
			new ImageIcon(getClass().getResource("fotos/1.png")),
			new ImageIcon(getClass().getResource("fotos/3.jpg")),
	};
	
	public ControleCombo(){
		super("Controle Combo - album de fotos");
		
		Container c = getContentPane();
		combo = new JComboBox<String>();
		combo.setFont(new Font("serif", Font.PLAIN, 26));
		combo.addItem("Kloros1");
		combo.addItem("Kloros2");
		combo.addItem("Kloros3");
		combo.addItem("Kloros4");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH,combo);
		c.add(BorderLayout.CENTER, label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args){
		new ControleCombo();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
	}
}
