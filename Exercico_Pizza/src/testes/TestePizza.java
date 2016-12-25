package testes;
import src.Pizza;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {
	private Pizza pizza;

	@Before
	public void inicializaPizza(){
		pizza = new Pizza("Mussarela");
	}
	
	@Test
	public void test() {

		assertTrue(pizza!= null);

	}
	// testa o método adiciona ingrediente
	@Test
	public void addIngrediente() {

		assertTrue(pizza.adicionaIngrediente("Presunto"));
		assertEquals(2, pizza.getListaIngredientes().size());
		assertFalse(2!=pizza.getListaIngredientes().size());
		assertTrue(pizza.adicionaIngrediente("Brócolis"));
		assertTrue(pizza.adicionaIngrediente("Tomate"));
		assertEquals(4, pizza.getListaIngredientes().size());

	}
	//testa preço pizza  2 ou menos ingredientes = 15,00
	@Test
	public void testeGetPrecoMenor2() {

		assertEquals(15,pizza.getPreco());
		pizza.adicionaIngrediente("Brócolis");
		assertEquals(15,pizza.getPreco());
		pizza.adicionaIngrediente("Catupirí");
		assertEquals(20,pizza.getPreco());
	}

	//testa preço pizza  3 a 5 ingredientes = 20,00
	@Test
	public void testeGetPrecoEntre3_5() {
		assertTrue(pizza.adicionaIngrediente("Presunto"));
		assertTrue(pizza.adicionaIngrediente("Tomate"));
		pizza.adicionaIngrediente("Catupirí");
		pizza.adicionaIngrediente("Brócolis");
		assertEquals(20,pizza.getPreco());
		assertTrue(pizza.adicionaIngrediente("Cebola"));
		assertEquals(23,pizza.getPreco());

	}

	//testa preço pizza acima 6 ingredientes = 23,00
	
	@Test
	public void testeGetPrecoMaior6() {
		assertTrue(pizza.adicionaIngrediente("Cebola"));
		pizza.adicionaIngrediente("Oregano");
		pizza.adicionaIngrediente("Azeite");
		pizza.adicionaIngrediente("Frango");
		pizza.adicionaIngrediente("Ovo");
		pizza.adicionaIngrediente("Chanpinhom");
		assertEquals(23,pizza.getPreco());
		assertEquals(7, pizza.getListaIngredientes().size());
	}
	@Test
	public void MapaIngredientesVazio(){
		Pizza.limpaMapa();
		assertEquals(0, Pizza.mapaDeIngredientes.size());
		
	} 

	
	//teste contabiliza Ingredientes total das pizzas
	@Test
	public void TestaContabilizaIngredientes(){
		Pizza.limpaMapa();
		Pizza.imprimeIngredientes();
		Pizza pizza = new Pizza("Mussarela");
		Pizza pizza2 = new Pizza("Mussarela");
		assertEquals(1, Pizza.mapaDeIngredientes.size());
		assertEquals(2, Pizza.mapaDeIngredientes.get("Mussarela").intValue());
		pizza.adicionaIngrediente("Catupirí");
		pizza.adicionaIngrediente("Brócolis");
		pizza2.adicionaIngrediente("Catupirí");
		pizza2.adicionaIngrediente("Calabresa");
		assertEquals(4, Pizza.mapaDeIngredientes.size());
		assertEquals(2, Pizza.mapaDeIngredientes.get("Catupirí").intValue());
		assertEquals(1, Pizza.mapaDeIngredientes.get("Brócolis").intValue());
		assertEquals(1, Pizza.mapaDeIngredientes.get("Calabresa").intValue());
		
	} 

}
