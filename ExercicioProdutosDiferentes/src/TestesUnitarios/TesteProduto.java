package TestesUnitarios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CodigoProducao.Produto;


public class TesteProduto {
	Produto produto;
	Produto produtoCopia;
	Produto produto2;
	
	@Before
	
	public void inicializaProduto(){
		produto = new Produto("Lapis","LPS455",1.80);
		produtoCopia = new Produto("Lapis","LPS455",1.80);
		produto2 = new Produto("Lapis","LPS465",1.65);
		
		
	}
	
	@Test
	public void testExisteProduto() {
		assertTrue(produto!= null);
	}
	@Test
	public void testInicializaProduto() {
		assertEquals("Lapis", produto.getNome());
		assertEquals("LPS455", produto.getCodigo());
		assertEquals(1.80, produto.getPreco(),1.00);
	}

	@Test
	public void testEquals() {
		
		assertTrue(produto.equals(produto));
		assertTrue(produto.equals(produtoCopia));
		assertFalse(produto.equals(produto2));
		
	}
	@Test
	public void testHashCode() {
		
		assertFalse(produto.hashCode()== produto2.hashCode());
		assertTrue(produto.hashCode()== produtoCopia.hashCode());
	}
	
}
