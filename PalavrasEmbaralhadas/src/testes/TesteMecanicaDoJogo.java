package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import producao.BancoDePalavras;
import producao.EmbaralhadorDePalavras;
import producao.FabricaDeEmbaralhador;
import producao.FormatadorDePalavra;
import producao.MecanicaDoJogo;
import producao.MecanicaModoVidas;

public class TesteMecanicaDoJogo {

	MecanicaDoJogo mecanicaDoJogo;
	BancoDePalavras bancoDePalavras;
	EmbaralhadorDePalavras embaralhador;
	FabricaDeEmbaralhador fabricaDeEmbaralhador;
	
	@Before
	public void inicializador(){
		fabricaDeEmbaralhador = new FabricaDeEmbaralhador();
		mecanicaDoJogo =  new MecanicaModoVidas();
		mecanicaDoJogo.iniciaJogo();
		
	}
	@Test
	public void testMecanicaModoVidas() {
		
		assertTrue(mecanicaDoJogo.iniciaJogo());
	}

	@Test
	public void testIsPalavraCertaVerdadeiro() {
		String respostaCerta = FormatadorDePalavra.removeIfenDaPalavra( mecanicaDoJogo.getPalavraChave());
		assertTrue(mecanicaDoJogo.isAcertouPalavraEmbaralhada(respostaCerta));
		
		
	}
	@Test
	public void testIsPalavraCertaFalso() {
		
		assertFalse(mecanicaDoJogo.isAcertouPalavraEmbaralhada("qualquerCoisa"));
		
	}
}
