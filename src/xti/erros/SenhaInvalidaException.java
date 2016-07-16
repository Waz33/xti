package xti.erros;

public class SenhaInvalidaException extends Exception{

	private static String mensagem;

	public SenhaInvalidaException (String mensagem){
		super(mensagem);
	}
	
}
