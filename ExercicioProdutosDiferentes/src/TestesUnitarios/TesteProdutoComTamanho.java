package TestesUnitarios;

import static org.junit.Assert.*;
import CodigoProducao.ProdutoComTamanho;
import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho extends TesteProduto {
	ProdutoComTamanho produtoTamanho;
	ProdutoComTamanho produtoTamanhoCopia;
	ProdutoComTamanho produtoTamanho2;
	ProdutoComTamanho produtoTamanho3;

	@Before
	
	public void inicializaProdutoComTamanho(){
		produtoTamanho = new ProdutoComTamanho("Sapato","SPT440",120.00,40);
		produtoTamanhoCopia = new ProdutoComTamanho("Sapato","SPT440",120.00,40);
		produtoTamanho2 = new ProdutoComTamanho("Sapato","SPT440",1.65,41);
		produtoTamanho3 = new ProdutoComTamanho("Sapato","SPT333",1.65,41);
		
	}


	
	@Test
	public void testExisteProdutoComTamanho() {
		assertTrue(produtoTamanho!= null);
	}
	
	@Test
	public void testEqualsProdutoComTamanho() {
		
		assertTrue(produtoTamanho.equals(produtoTamanho));
		assertTrue(produtoTamanho.equals(produtoTamanhoCopia ));
		assertFalse(produtoTamanho.equals(produtoTamanho2));
		assertFalse(produtoTamanho3.equals(produtoTamanho2));
		assertFalse(produtoTamanho.equals(produtoCopia ));
	}
	@Test
	public void testHashCodeProdutoComTamanho() {
		
		assertFalse(produtoTamanho.hashCode()== produtoTamanho2.hashCode());
		assertTrue(produtoTamanho.hashCode()== produtoTamanhoCopia.hashCode());
	}

}
