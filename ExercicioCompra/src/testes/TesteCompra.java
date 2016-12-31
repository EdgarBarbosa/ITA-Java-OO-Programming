package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import producao.Compra;

public class TesteCompra {

	@Test
	public void testTotal() {
		Compra compra = new Compra(100.00);
		assertEquals(100.00,compra.total(),1.00);
	}

}
