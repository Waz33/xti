package xti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControleText extends JFrame {
	
	JButton ok, cancel;
	JTextField login;
	JPasswordField senha;
	
	public ControleText(){
		//super("Controle de textos e Senhas");

		login = new JTextField("login");
		senha = new JPasswordField("senha");
		ok = new JButton("OK");
		ok.addActionListener(new BotaoOkListener());
		cancel = new JButton("Cancel");
		cancel.addActionListener(new BotaoCancelListener());
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(new JLabel("Login"));
		c.add(login);
		c.add(new JLabel("Senha"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		//ControleText v =
				new ControleText();
		
	}

	class BotaoOkListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = "login:"+ login.getText()
			+ "/senha:"+new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
		}
	}

	class BotaoCancelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			login.setText("");
			senha.setText("");
		}
	}
}
