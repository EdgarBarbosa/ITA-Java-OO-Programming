package testes;
import static org.junit.Assert.*;

import org.junit.*;

import producao.CompraParcelada;

public class TestCompraParcelada extends TesteCompra {
	CompraParcelada compra1Parcela;
	CompraParcelada compra2Parcela;
	CompraParcelada compra5Parcela;
	CompraParcelada compra10Parcela;
	@Before
	public void inicializaCompra(){
		compra1Parcela = new CompraParcelada(500.00,1,0.08);
		compra2Parcela = new CompraParcelada(500.00,2,0.08);
		compra5Parcela = new CompraParcelada(500.00,5,0.08);
		compra10Parcela = new CompraParcelada(500.00,10,0.08);
		
	}
	
	@Test
	public void testCompraParcelada(){
		assertEquals(1,compra1Parcela.getNumeroDeParcelas());
		assertEquals(0.080000000,compra1Parcela.getTaxaDeJuros(),1.000000000);
	}
	
	@Test
	public void testTotalCompraParcela(){
	
			assertEquals(540.00, compra1Parcela.total(),1.00);
			assertEquals(583.2, compra2Parcela.total(),1.00);
			assertEquals(734.66, compra5Parcela.total(),1.00);
			assertEquals(1079.46, compra10Parcela.total(),1.00);
			assertEquals(3280, new CompraParcelada(2562.33,10,0.025).total(),1.00);
		} 
	}

