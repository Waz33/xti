package xti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;
import xti.poo.Matematica;

public class MatematicaTeste {

	Matematica m;
	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMaior() {
		assertEquals(20, m.maior(10,20));
	}

	@Test
	public void testSoma() {
		assertEquals(20, m.soma(10, 10));
	}

	@Test
	public void testMediaIntInt() {
		assertEquals(5, m.mediaw(4,6));
	}

}
