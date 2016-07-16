package xti.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Conversor extends JFrame {

	// AutoGerado pelo compilador
	private static final long serialVersionUID = -2834370009128148003L;
	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Converter");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double farenheight = Double.parseDouble(valor.getText());
					double celsius = (farenheight - 32) / 1.8;
					resultado.setText(celsius + " ºC");
				} catch (Exception e) {
				}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setForeground(Color.GREEN);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));

		JLabel lblNewLabel_1 = new JLabel("Farenheight");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		panel.add(lblNewLabel_1);

		valor = new JTextField();
		panel.add(valor);
		valor.setColumns(10);

		JLabel lblNewLabel = new JLabel("Celsius");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		panel.add(lblNewLabel);

		resultado = new JTextField();
		panel.add(resultado);
		resultado.setColumns(10);
	}

}
