package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import producao.FabricaDeEmbaralhador;
import producao.MecanicaModoVidas;

public class TesteMecanicaModoVidas extends TesteMecanicaDoJogo{
		
	@Before
	public void inicializador(){
		fabricaDeEmbaralhador = new FabricaDeEmbaralhador();
		mecanicaDoJogo =  new MecanicaModoVidas();
		mecanicaDoJogo.iniciaJogo();
	}
	
	
	@Test
	public void testPerdeUmaVida() {
		mecanicaDoJogo.isAcertouPalavraEmbaralhada("qualquerCoisa");
		assertEquals(4, mecanicaDoJogo.getVidas());
		assertFalse(mecanicaDoJogo.isTerminado());
		
	}
	
	@Test
	public void testPerdeTodasVidas() {
		for (int i = 0; i < 5; i++) {
			mecanicaDoJogo.isAcertouPalavraEmbaralhada("qualquerCoisa");
		}		
		assertEquals(0, mecanicaDoJogo.getVidas());
		assertTrue(mecanicaDoJogo.isTerminado());
	}

	@Test
	public void testCalculaPontuacaoEmbaralhadores() {
		
			testIsPalavraCertaVerdadeiro();
			assertEquals(100, mecanicaDoJogo.getPontuacao(),1.00);
			testIsPalavraCertaVerdadeiro();
			testIsPalavraCertaVerdadeiro();
			assertEquals(300, mecanicaDoJogo.getPontuacao(),1.00);
		
	}
	@Test
	public void testGanhaVidaACadaMilPontos() {
		
		for (int i = 0; i < 11; i++) {
			testIsPalavraCertaVerdadeiro();
		}
		assertEquals(6, mecanicaDoJogo.getVidas());
			
		
		
	}
	
}
