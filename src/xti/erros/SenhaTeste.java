package xti.erros;

public class SenhaTeste {

	public static void autenticar(String senha) throws SenhaInvalidaException{
		if ("123".equals(senha)) {
			//Autenticada
			System.out.println("Autenticado");
		} else{
			//Senha incorreta
			throw new SenhaInvalidaException ("Senha incorreta!!!");
		}
	}
	public static void main(String[] args) {

		try{
			autenticar("33");
		} catch(SenhaInvalidaException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
