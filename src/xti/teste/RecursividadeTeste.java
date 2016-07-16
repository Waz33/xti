package xti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import xti.refinado.Recursividade;

public class RecursividadeTeste {

	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSoma() {
		assertEquals(55, Recursividade.soma(10));
	}

	@Test
	public void testPotencia() {
		assertEquals(81,Recursividade.potencia(3, 4));
	}

}
