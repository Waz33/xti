package xti.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Reflexao {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		String nome = "xti.poo.Conta";
		Class<?> classe = Class.forName(nome);
		System.out.println(classe.getSimpleName());
		
		Field[] f = classe.getFields();
		for (Field field : f) {
			System.out.println(field.getName());
		}
		
		Method[] md = classe.getDeclaredMethods();
		for (Method method : md) {
			System.out.println(method.getName());
		}
		
		Constructor[] c = classe.getConstructors();
		for (Constructor<?> co : c) {
			System.out.println(co.getName());
		}
		
		Object o = classe.newInstance();
		Method mm = classe.getMethod("depositar", double.class);
		Method ms = classe.getMethod("exibeSaldo");
		mm.invoke(o, 120);
		ms.invoke(o);
	
		Constructor co = classe.getConstructor(String.class, double.class);
		Object obj = co.newInstance("Wazzzzzzzzzz", 123_452.22);
		ms.invoke(obj);
	}

}
