package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import producao.Cronometro;
import producao.EmbaralhadorInvertePalavra;
import producao.EmbaralhadorPermutaLetras;
import producao.EmbaralhadorPermutaSilabas;
import producao.FabricaDeEmbaralhador;
import producao.MecanicaModoTempo;

public class TesteMecanicaModoTempo extends TesteMecanicaDoJogo{
	Cronometro cronometro;
	
	@Before
	public void inicializador(){
		fabricaDeEmbaralhador = new FabricaDeEmbaralhador();
		mecanicaDoJogo =  new MecanicaModoTempo();
		mecanicaDoJogo.iniciaJogo();
		 cronometro = new Cronometro();
	}
	
	@Test
	public void testCronometro() {
		assertTrue(cronometro.iniciaCronometro((MecanicaModoTempo)mecanicaDoJogo));
	}
	@Test
	public void testCalculaPontuacaoEmbaralhadores() {
		if(mecanicaDoJogo.getEmbaralhadorDePalavras() instanceof EmbaralhadorInvertePalavra ){
			testIsPalavraCertaVerdadeiro();
			assertEquals(110, mecanicaDoJogo.getPontuacao(),1.00);
			testIsPalavraCertaVerdadeiro();
			testIsPalavraCertaVerdadeiro();
			assertEquals(330, mecanicaDoJogo.getPontuacao(),1.00);
		}
		if(mecanicaDoJogo.getEmbaralhadorDePalavras() instanceof EmbaralhadorPermutaLetras ){
			testIsPalavraCertaVerdadeiro();
			assertEquals(130, mecanicaDoJogo.getPontuacao(),1.00);
			testIsPalavraCertaVerdadeiro();
			testIsPalavraCertaVerdadeiro();
			assertEquals(390, mecanicaDoJogo.getPontuacao(),1.00);
		}
		if(mecanicaDoJogo.getEmbaralhadorDePalavras() instanceof EmbaralhadorPermutaSilabas ){
			testIsPalavraCertaVerdadeiro();
			assertEquals(120, mecanicaDoJogo.getPontuacao(),1.00);
			testIsPalavraCertaVerdadeiro();
			testIsPalavraCertaVerdadeiro();
			assertEquals(360, mecanicaDoJogo.getPontuacao(),1.00);
		}
	}

}
