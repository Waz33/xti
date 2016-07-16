package xti.logica;
//Jogo de dados
//@author Wazzz
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class JogoDados {
	
	public static void main(String[] args) {

		//Scanner Console
		//Scanner s = new Scanner(System.in);
		//int palpite = s.nextInt();
		//System.out.println("Palpite = " + palpite);

		//Swing
		String p = JOptionPane.showInputDialog("Palpite: ");
		int pp = Integer.parseInt(p);
		Random r = new Random();
		//System.out.println(r.nextInt(12));

		int rr = r.nextInt(3);

		switch (rr) {
			case 1: 
				//System.out.println("Um : "+ pp + " = " +rr);
				JOptionPane.showMessageDialog(null, ("Um : "+ pp + " = " +rr));
				break;
			case 2: 
				System.out.println("dois: "+ pp + " = " +rr);
				break;
			case 3: 
				System.out.println("tres: "+ pp + " = " +rr);
				break;
			default:
				System.out.println("Errou: "+ pp + " = " +rr);
		}
	
	}
}  