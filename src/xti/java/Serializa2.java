package xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import xti.poo.Conta;

public class Serializa2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 12.532));
		contas.add(new Conta("Claudiaaaaaaa", 15.2));
		contas.add(new Conta("Beatriz", 5.11));
		contas.add(new Conta("Sandra", 1.66));
		

		Serializa2 operacao = new Serializa2();
		operacao.ArmazenarContas(contas);
		ArrayList<Conta> contas2 = Serializa2.RecuperarContas();
		
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		}
	}

	public void ArmazenarContas(ArrayList<Conta> contas) throws IOException{
		
		try(FileOutputStream fos = new FileOutputStream("C:/java/xti/files/contas.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(contas);
			}		
		}		
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<Conta> RecuperarContas() throws IOException, ClassNotFoundException{
		try(FileInputStream fis = new FileInputStream("C:/java/xti/files/contas.ser")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				return (ArrayList<Conta>) ois.readObject();
			}
		}	
	}
}
