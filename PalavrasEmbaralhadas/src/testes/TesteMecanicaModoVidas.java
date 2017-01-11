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
		mecanicaDoJogo.isIniciadoJogo();
	}
	
	
	@Test
	public void testPerdeUmaVida() {
		mecanicaDoJogo.isAcertouPalavraEmbaralhada("qualquerCoisa");
		assertEquals(4, mecanicaDoJogo.getNumeroDeVidasDoJogador());
		assertFalse(mecanicaDoJogo.isTerminadoJogo());
		
	}
	
	@Test
	public void testPerdeTodasVidas() {
		for (int i = 0; i < 5; i++) {
			mecanicaDoJogo.isAcertouPalavraEmbaralhada("qualquerCoisa");
		}		
		assertEquals(0, mecanicaDoJogo.getNumeroDeVidasDoJogador());
		assertTrue(mecanicaDoJogo.isTerminadoJogo());
	}

	@Test
	public void testCalculaPontuacaoEmbaralhadores() {
		
			testIsPalavraCertaVerdadeiro();
			assertEquals(100, mecanicaDoJogo.getPontuacaoDoJogador(),1.00);
			testIsPalavraCertaVerdadeiro();
			testIsPalavraCertaVerdadeiro();
			assertEquals(300, mecanicaDoJogo.getPontuacaoDoJogador(),1.00);
		
	}
	@Test
	public void testGanhaVidaACadaMilPontos() {
		
		for (int i = 0; i < 10; i++) {
			testIsPalavraCertaVerdadeiro();
		}
		assertEquals(6, mecanicaDoJogo.getNumeroDeVidasDoJogador());
			
	}
	
}
