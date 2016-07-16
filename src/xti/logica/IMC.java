package xti.logica;

import java.util.Locale;

import javax.swing.JOptionPane;

//Calcular IMC = pesoKG / (AlturaMetros * )
//@author Wazzz


public class IMC {
	
	public static void main(String[] args) {

		boolean continuar = true;
		
		do{
			String peso= JOptionPane.showInputDialog("Qual o peso KG: ");
			double pesoKG = Double.parseDouble(peso);
			String altura= JOptionPane.showInputDialog("Qual sua altura : ");
			double alturaMetros = Double.parseDouble(altura);
			
			double imc = pesoKG / (alturaMetros*alturaMetros);
	
			String msg = (imc>=20 && imc<=25) ? " Peso ideal " : "Gordo";
			msg = "IMC = "+ imc + "\n" + msg;
			JOptionPane.showMessageDialog(null, msg);
	
			System.out.println("IMC = " + imc + msg);

			
			//int sair = JOptionPane.showConfirmDialog(null, "Deseja S/N");
			//System.out.println("sair:: "+sair);
			
			int sair = JOptionPane.OK_CANCEL_OPTION;
			sair = JOptionPane.CANCEL_OPTION;
			sair = JOptionPane.DEFAULT_OPTION;
			sair = JOptionPane.ERROR_MESSAGE;
			sair = JOptionPane.INFORMATION_MESSAGE;
			sair = JOptionPane.NO_OPTION;
			sair = JOptionPane.OK_CANCEL_OPTION;
			//sair = JOptionPane.showConfirmDialog(null, "DDD");
			//sair = JOptionPane.showInternalConfirmDialog(null, "vvvv");


			sair = JOptionPane.showConfirmDialog(null, "Deseja S/N");
			System.out.println("sair:: "+sair);
			
			if( sair == 0) continuar = false;
			
		}while(continuar==true);	
	}
}