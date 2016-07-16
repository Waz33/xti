package xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import xti.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws Exception {

		//String[] nomes = {"waz", "fabio", "bocao"};
		
		Conta conta1 = new Conta("XTI", 335_333.23);
		Conta conta2 = new Conta("Wazz", 5_333.23);

		//Escrita de objeto
		FileOutputStream fos = new FileOutputStream("C:/java/xti/files/objetos.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
	
		//Leitura de Objetos
		FileInputStream fis = new FileInputStream("C:/java/xti/files/objetos.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 =  (Conta) ois.readObject();
		Conta c2 =  (Conta) ois.readObject();
		ois.close();
		
		c1.exibeSaldo();
		c2.exibeSaldo();
	}

}
