package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.Carrinho;
import src.Pizza;

public class TesteCarrinho {
	Pizza pizza6 = new Pizza("Mussarela");
	Pizza pizza2 = new Pizza("Frango");
	Pizza pizza3 = new Pizza("Calabresa");
	
	Carrinho carrinho = new Carrinho();
	@Test
	public void testCarrinho() {
		assertTrue(carrinho != null);
		
	}
	@Test
	public void testAdicionaPizza() {
		assertTrue(carrinho.adicionaPizza(new Pizza("Presunto")));
		
		
	}
	@Test
	public void testsomaCarrinho6() {
		pizza6.adicionaIngrediente("Oregano");
		pizza6.adicionaIngrediente("Azeite");
		pizza6.adicionaIngrediente("Frango");
		pizza6.adicionaIngrediente("Ovo");
		pizza6.adicionaIngrediente("Chanpinhom");
		pizza6.adicionaIngrediente("Frango");
		
		assertTrue(carrinho.adicionaPizza(pizza6));
		
		assertEquals(23, carrinho.somaCarrinho());
		
	}
	
	@Test
	public void testsomaCarrinho2() {
		
		pizza2.adicionaIngrediente("Chanpinhom");
		
		assertTrue(carrinho.adicionaPizza(pizza2));
		assertEquals(15, carrinho.somaCarrinho());
		
	}
	
	@Test
	public void testsomaCarrinho3() {
		pizza3.adicionaIngrediente("Brócolis");
		pizza3.adicionaIngrediente("Chanpinhom");
		
		assertTrue(carrinho.adicionaPizza(pizza3));
		assertEquals(20, carrinho.somaCarrinho());
		
	}
	
	@Test
	public void testsomaCarrinhoTotal() {
		List<Pizza> lista = new ArrayList<Pizza>();
		Pizza pizza6 = new Pizza("Mussarela");
		Pizza pizza2 = new Pizza("Frango");
		Pizza pizza3 = new Pizza("Calabresa");
		
		pizza6.adicionaIngrediente("Oregano");
		pizza6.adicionaIngrediente("Azeite");
		pizza6.adicionaIngrediente("Frango");
		pizza6.adicionaIngrediente("Ovo");
		pizza6.adicionaIngrediente("Chanpinhom");
		pizza6.adicionaIngrediente("Frango");
		
		pizza3.adicionaIngrediente("Brócolis");
		pizza3.adicionaIngrediente("Chanpinhom");
		
		pizza2.adicionaIngrediente("Chanpinhom");
		lista.add(pizza2);
		lista.add(pizza3);
		lista.add(pizza6);
		assertTrue(carrinho.adicionaPizza(lista));
		assertEquals(58, carrinho.somaCarrinho());
		
	}
}
