package xti.poo;


public class Funcionario {
	
	protected String nome;
	
	public String getNome() {
		return nome;
	}

	
	public static void main(String[] args){

		Funcionario f = new Funcionario();
		f.nome = "Wazzz";
		f.nome = "Waszz Private";
		
		f.getNome();
		
	}
	
}
