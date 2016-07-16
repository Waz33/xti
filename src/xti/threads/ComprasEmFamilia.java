package xti.threads;

public class ComprasEmFamilia implements Runnable{

	ContaConjunta conta = new ContaConjunta();
	
	public static void main(String[] args) {
		
		ComprasEmFamilia irComprar = new ComprasEmFamilia();
		new Thread(irComprar, "pai").start();
		new Thread(irComprar, "mae").start();
		new Thread(irComprar, "filha").start();
		new Thread(irComprar, "baba").start();
		
	}

	@Override
	public void run() {
		String cliente = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			try {
				conta.sacar(20, cliente);
				if (conta.getSaldo() < 0) {
					System.out.println("Estourouuu");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
	}

}
