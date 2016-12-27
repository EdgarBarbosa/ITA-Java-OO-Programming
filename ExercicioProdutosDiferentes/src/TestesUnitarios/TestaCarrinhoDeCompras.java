package TestesUnitarios;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import CodigoProducao.CarrinhoDeCompras;
import CodigoProducao.Produto;
import CodigoProducao.ProdutoComTamanho;

public class TestaCarrinhoDeCompras {
	CarrinhoDeCompras carrinhoDeCompras;
	Produto produtoCanetaBic;
	Produto produtoCanetaPiloto;
	Produto produtoCalculadora;
	Produto produtoCamisaM;
	Produto produtoCamisaM2;
	Produto produtoCamisaGG;
	Produto produtoTenis;
	
	@Before
	public void inicializaCarrinho() {
	carrinhoDeCompras = new CarrinhoDeCompras();
	produtoCanetaBic = new Produto("CanetaBic","CNT006",1.99);
	produtoCanetaPiloto = new Produto("CanetaPiloto","CNT005",1.77);
	produtoCalculadora = new Produto("Calculadora","CAL741",55.00);	
	produtoCamisaM= new ProdutoComTamanho("CamisaM","CAM896",28.80,30);
	produtoCamisaGG= new ProdutoComTamanho("CamisaGG","CAM896",35.99,45);
	produtoTenis = new ProdutoComTamanho("Rebook","TEN111",130,31);
	produtoCamisaM2= new ProdutoComTamanho("CamisaM","CAM896",28.80,32);
	}
	@After
	public void esvaziaCarrinho(){
		carrinhoDeCompras.esvaziaCarrinho();
	}
	@Test
	public void testCarrinhoVazio() {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		assertEquals(0, carrinhoDeCompras.totalDeItensDoCarrinho());
	}
	
	@Test
	public void testContaItensCarrinho() {
		carrinhoDeCompras.adicionaProduto(produtoCanetaBic,2);
		assertEquals(2, carrinhoDeCompras.totalDeItensDoCarrinho());
		carrinhoDeCompras.adicionaProduto(produtoCanetaPiloto,2);
		assertEquals(4, carrinhoDeCompras.totalDeItensDoCarrinho());
		carrinhoDeCompras.adicionaProduto(produtoCanetaPiloto,2);
		carrinhoDeCompras.adicionaProduto(produtoCamisaM,1);
		carrinhoDeCompras.adicionaProduto(produtoCanetaPiloto,1);
		assertEquals(8, carrinhoDeCompras.totalDeItensDoCarrinho());
		carrinhoDeCompras.adicionaProduto(produtoCamisaM2,1);
		assertEquals(9, carrinhoDeCompras.totalDeItensDoCarrinho());
	}
	
	@Test
	public void testAdicionaProdutoInexistente() {
		assertTrue(carrinhoDeCompras.adicionaProduto(produtoCanetaBic,2));
		assertEquals(2,carrinhoDeCompras.totalDeItensDoCarrinho());
		assertEquals(2,(int)carrinhoDeCompras.totalDeItensDoProduto(produtoCanetaBic));
	}
	@Test
	public void testAdicionaProdutoRepetido() {
		assertTrue(carrinhoDeCompras.adicionaProduto(produtoCanetaBic,2));
		assertEquals(2,carrinhoDeCompras.totalDeItensDoCarrinho());
		carrinhoDeCompras.adicionaProduto(produtoCanetaBic,3);
		assertEquals(5,(int)carrinhoDeCompras.totalDeItensDoProduto(produtoCanetaBic));
		
	}
	
	
	@Test
	public void testcalculaTotalDaCompra() {
		assertTrue(carrinhoDeCompras.adicionaProduto(produtoCanetaBic,2));
		carrinhoDeCompras.adicionaProduto(produtoCalculadora,1);
		assertEquals(2*1.99+55,carrinhoDeCompras.calculaTotalDaCompra(),1.00);
		carrinhoDeCompras.adicionaProduto(produtoCalculadora,1);
		assertEquals(2,(int)carrinhoDeCompras.totalDeItensDoProduto(produtoCalculadora));
		assertEquals(2*1.99+55*2,carrinhoDeCompras.calculaTotalDaCompra(),1.00);
		
	}

	@Test
	public void testAdicionaProdutoComTamanhoInexistente() {
		assertTrue(carrinhoDeCompras.adicionaProduto(produtoCamisaM,3));
		assertEquals(3,carrinhoDeCompras.totalDeItensDoCarrinho());
		assertEquals(3,(int)carrinhoDeCompras.totalDeItensDoProduto(produtoCamisaM));
		carrinhoDeCompras.adicionaProduto(produtoTenis, 1);
		assertEquals(4,carrinhoDeCompras.totalDeItensDoCarrinho());
		
	}
	
	@Test
	public void testAdicionaProdutoComTamanhorRepetido() {
		assertTrue(carrinhoDeCompras.adicionaProduto(produtoCamisaM,3));
		assertEquals(3,carrinhoDeCompras.totalDeItensDoCarrinho());
		assertEquals(3,(int)carrinhoDeCompras.totalDeItensDoProduto(produtoCamisaM));
		carrinhoDeCompras.adicionaProduto(produtoTenis, 1);
		assertEquals(4,carrinhoDeCompras.totalDeItensDoCarrinho());
		carrinhoDeCompras.adicionaProduto(produtoCamisaM, 2);
		carrinhoDeCompras.adicionaProduto(produtoCamisaGG, 4);
		assertEquals(10,carrinhoDeCompras.totalDeItensDoCarrinho());
		assertEquals(5,(int)carrinhoDeCompras.totalDeItensDoProduto(produtoCamisaM));
		carrinhoDeCompras.adicionaProduto(produtoCanetaBic, 3);
		carrinhoDeCompras.adicionaProduto(produtoCanetaPiloto, 4);
		
	}
	
	@Test
	public void testContabilizaCarrinho() {
		carrinhoDeCompras.adicionaProduto(produtoCamisaM,3);//valor unitario 28.80 
		carrinhoDeCompras.adicionaProduto(produtoCalculadora, 1);//valor unitario 55.00
		carrinhoDeCompras.adicionaProduto(produtoTenis, 1);//valor unitario 130.31
		carrinhoDeCompras.adicionaProduto(produtoCamisaM, 2);//valor unitario 28.80
		carrinhoDeCompras.adicionaProduto(produtoCamisaGG, 5);//valor unitario 35.99
		carrinhoDeCompras.adicionaProduto(produtoCanetaBic, 7);//valor unitario 1.99
		carrinhoDeCompras.adicionaProduto(produtoCanetaPiloto, 4);//valor unitario 1.77
		assertEquals(530.27, carrinhoDeCompras.calculaTotalDaCompra(),1.00);
		assertEquals(23, carrinhoDeCompras.totalDeItensDoCarrinho());
		
	}
	@Test
	public void testRemoveProdutoCarrinhoVazio() {
		
		assertFalse(carrinhoDeCompras.removeProduto(produtoCalculadora));
	}
	
	@Test
	public void testRemoveProduto() {
		
		carrinhoDeCompras.adicionaProduto(produtoCamisaM,1);
		assertEquals(1,carrinhoDeCompras.totalDeItensDoCarrinho());
		assertTrue(carrinhoDeCompras.removeProduto(produtoCamisaM));
		assertEquals(0,carrinhoDeCompras.totalDeItensDoCarrinho());
		assertEquals(0,(int)carrinhoDeCompras.totalDeItensDoProduto(produtoCamisaM));
		carrinhoDeCompras.adicionaProduto(produtoCalculadora, 2);
		assertTrue(carrinhoDeCompras.removeProduto(produtoCalculadora));
		assertEquals(1,(int)carrinhoDeCompras.totalDeItensDoProduto(produtoCalculadora));
		
	}
}
