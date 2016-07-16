package xti.java;

public class StringToken {
	
	public static void main(String[] args){
		
		String s = "XHTML; CSS; JavaScript; JQuery; Java";
		s= "Venha trablhar na xti";
		String[] tokens = s.split("a");//Delimitador para kebrar		
		System.out.println(tokens.length);
	
		for(String token : tokens){
			System.out.println(token);
		}
		
		
	}
}