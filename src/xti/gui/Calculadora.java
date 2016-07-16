package xti.gui;

/**
 * Esse app e um exemplo simples de calculadora feito para o curso da universidade XTI que esta no <b> youtubes</b>
 * 
 * @author Wazny A. 
 * @author woz
 * @version jdk 1.8
 * @since jdk 1.7
 * 
 * @see Janela
 * @see Layouts
 * 
 * @throws indexOutOfBounds 
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora extends JFrame implements ActionListener {

	JButton clear, igual, soma, multiplica, divide, subtrai, um, dois, tres, quatro, cinco, seis, sete, oito, nove, zero;
	JTextField resultado;
	
	class BotaoUmListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			resultado.setText(resultado.getText()+"1");
		}
	}
	
	class BotaoIgualListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String tela = resultado.getText();
			int operacaoIndex = 0;
			
			if(tela.contains("+")){
				operacaoIndex = tela.indexOf("+");
			}
			if(tela.contains("*")){
				operacaoIndex = tela.indexOf("*");
			}
			if(tela.contains("-")){
				operacaoIndex = tela.indexOf("-");
			}
			if(tela.contains("/")){
				operacaoIndex = tela.indexOf("/");
			}
			
			char operacao = tela.charAt(operacaoIndex);
			System.out.println(tela.charAt(operacaoIndex));
			
			double esquerda = Double.parseDouble(tela.substring(0, operacaoIndex)); 
			double direita = Double.parseDouble(tela.substring(operacaoIndex+1, tela.length()));
						
			double rr = 0;

			if(operacao == '+'){
				rr = (esquerda + direita);
			}
			if(operacao == '*'){
				rr = (esquerda * direita);
			}
			if(operacao == '-'){
				rr = (esquerda - direita);
			}
			if(operacao == '/'){
				if(direita == 0) {
					System.out.println("Divisao por zero nao existe");
					resultado.setText("");
					//rr = 0;
				} else { 
					rr = (esquerda / direita);
				}
			}
			
			if(rr != 0) resultado.setText(String.valueOf(rr));
			else 	resultado.setText("");
		}
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getSource());
		//if(e.getSource() == um){
		//	resultado.setText(resultado.getText()+"1");
		//}
		if(e.getSource() == dois){
			resultado.setText(resultado.getText()+"2");
		}
		if(e.getSource() == tres){
			resultado.setText(resultado.getText()+"3");
		}
		if(e.getSource() == quatro){
			resultado.setText(resultado.getText()+"4");
		}
		if(e.getSource() == cinco){
			resultado.setText(resultado.getText()+"5");
		}
		if(e.getSource() == seis){
			resultado.setText(resultado.getText()+"6");
		}
		if(e.getSource() == sete){
			resultado.setText(resultado.getText()+"7");
		}
		if(e.getSource() == oito){
			resultado.setText(resultado.getText()+"8");
		}
		if(e.getSource() == nove){
			resultado.setText(resultado.getText()+"9");
		}
		if(e.getSource() == zero){
			resultado.setText(resultado.getText()+"0");
		}
		if(e.getSource() == clear){
			resultado.setText("");
		}
		if(e.getSource() == soma){
			resultado.setText(resultado.getText()+"+");
		}
		if(e.getSource() == multiplica){
			resultado.setText(resultado.getText()+"*");
		}
		if(e.getSource() == subtrai){
			resultado.setText(resultado.getText()+"-");
		}
		if(e.getSource() == divide){
			resultado.setText(resultado.getText()+"/");
		}

		if(e.getSource() == igual){
			/*
			String tela = resultado.getText();
			int operacaoIndex = 0;
			
			if(tela.contains("+")){
				operacaoIndex = tela.indexOf("+");
			}
			if(tela.contains("*")){
				operacaoIndex = tela.indexOf("*");
			}
			if(tela.contains("-")){
				operacaoIndex = tela.indexOf("-");
			}
			if(tela.contains("/")){
				operacaoIndex = tela.indexOf("/");
			}
			
			char operacao = tela.charAt(operacaoIndex);
			System.out.println(tela.charAt(operacaoIndex));
			
			double esquerda = Double.parseDouble(tela.substring(0, operacaoIndex)); 
			double direita = Double.parseDouble(tela.substring(operacaoIndex+1, tela.length()));
						
			double rr = 0;

			if(operacao == '+'){
				rr = (esquerda + direita);
			}
			if(operacao == '*'){
				rr = (esquerda * direita);
			}
			if(operacao == '-'){
				rr = (esquerda - direita);
			}
			if(operacao == '/'){
				if(direita == 0) {
					System.out.println("Divisao por zero nao existe");
					resultado.setText("");
					//rr = 0;
				} else { 
					rr = (esquerda / direita);
				}
			}
			
			if(rr != 0) resultado.setText(String.valueOf(rr));
			else 	resultado.setText("");
			 */
			
		}
		
	}

	public Calculadora() {
		super("Wazzz Calculadora");

		Container c = getContentPane();
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,4,5,5));
		
		resultado = new JTextField();
		resultado.setFont(new Font("serif", Font.PLAIN, 26));
		
		um = new JButton("1");
		um.addActionListener(new BotaoUmListener());
		c2.add(um);
		
		dois = new JButton("2");
		dois.addActionListener(this);
		c2.add(dois);

		tres = new JButton("3");
		tres.addActionListener(this);
		c2.add(tres);

		clear = new JButton("clear");
		clear.addActionListener(this);
		c2.add(clear);

		quatro = new JButton("4");
		quatro.addActionListener(this);
		c2.add(quatro);

		cinco = new JButton("5");
		cinco.addActionListener(this);
		c2.add(cinco);

		seis = new JButton("6");
		seis.addActionListener(this);
		c2.add(seis);

		soma = new JButton("++");
		soma.addActionListener(this);
		c2.add(soma);

		sete = new JButton("7");
		sete.addActionListener(this);
		c2.add(sete);

		oito = new JButton("8");
		oito.addActionListener(this);
		c2.add(oito);

		nove = new JButton("9");
		nove.addActionListener(this);
		c2.add(nove);

		multiplica = new JButton("*");
		multiplica.addActionListener(this);
		c2.add(multiplica);

		zero = new JButton("0");
		zero.addActionListener(this);
		c2.add(zero);

		subtrai = new JButton("-");
		subtrai.addActionListener(this);
		c2.add(subtrai);

		divide = new JButton("/");
		divide.addActionListener(this);
		c2.add(divide);
		
		igual = new JButton("=");
		igual.addActionListener(new BotaoIgualListener());
		c2.add(igual);

		new BorderLayout();
		c.add(BorderLayout.NORTH, resultado);
		new BorderLayout();
		c.add(BorderLayout.CENTER, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
