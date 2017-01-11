package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import producao.BancoDePalavras;
import producao.Cronometro;
import producao.EmbaralhadorInvertePalavra;
import producao.EmbaralhadorPermutaLetras;
import producao.EmbaralhadorPermutaSilabas;
import producao.FabricaDeEmbaralhador;
import producao.MecanicaModoTempoLimitado;

public class TesteMecanicaModoTempoLimitado extends TesteMecanicaDoJogo{
	Cronometro cronometro;
	
	@Before
	public void inicializador(){
		bancoDePalavras = new BancoDePalavras("./arquivosDedados/baseDePalavrasTeste.txt");
		fabricaDeEmbaralhador = new FabricaDeEmbaralhador();
		mecanicaDoJogo =  new MecanicaModoTempoLimitado();
		mecanicaDoJogo.isIniciadoJogo();
		 cronometro = new Cronometro();
	}
	
	@Test
	public void testCronometro() {
		assertTrue(cronometro.iniciaCronometro((MecanicaModoTempoLimitado)mecanicaDoJogo));
	}
	@Test
	public void testCalculaPontuacaoEmbaralhadores() {
		if(mecanicaDoJogo.getEmbaralhadorDePalavras() instanceof EmbaralhadorInvertePalavra ){
			testIsPalavraCertaVerdadeiro();
			assertEquals(110, mecanicaDoJogo.getPontuacaoDoJogador(),1.00);
			testIsPalavraCertaVerdadeiro();
			testIsPalavraCertaVerdadeiro();
			assertEquals(330, mecanicaDoJogo.getPontuacaoDoJogador(),1.00);
		}
		if(mecanicaDoJogo.getEmbaralhadorDePalavras() instanceof EmbaralhadorPermutaLetras ){
			testIsPalavraCertaVerdadeiro();
			assertEquals(130, mecanicaDoJogo.getPontuacaoDoJogador(),1.00);
			testIsPalavraCertaVerdadeiro();
			testIsPalavraCertaVerdadeiro();
			assertEquals(390, mecanicaDoJogo.getPontuacaoDoJogador(),1.00);
		}
		if(mecanicaDoJogo.getEmbaralhadorDePalavras() instanceof EmbaralhadorPermutaSilabas ){
			testIsPalavraCertaVerdadeiro();
			assertEquals(120, mecanicaDoJogo.getPontuacaoDoJogador(),1.00);
			testIsPalavraCertaVerdadeiro();
			testIsPalavraCertaVerdadeiro();
			assertEquals(360, mecanicaDoJogo.getPontuacaoDoJogador(),1.00);
		}
	}

}
