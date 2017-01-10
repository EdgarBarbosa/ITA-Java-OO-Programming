package testes;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import producao.EmbaralhadorPermutaLetras;

public class TesteEmbaralhadorPermutaLetras {
	EmbaralhadorPermutaLetras embaralhador;
	@Before
	public void inicializador(){
		embaralhador = new EmbaralhadorPermutaLetras();
		
	}

	@Test
	public void testEmbaralhadorPermutaLetrasVerdadeiro() {
		
		String palavra ="palavra" ;
		char[] arrayPalavra = palavra.toCharArray();
		String palavraEmbaralhada = embaralhador.embaralharPalavra("pa-la-vra");
		char[] arrayPalavraEmbaralhada = palavraEmbaralhada.toCharArray();
		 Arrays.sort(arrayPalavra);
		 Arrays.sort(arrayPalavraEmbaralhada);
		
		 assertTrue(Arrays.equals(arrayPalavra, arrayPalavraEmbaralhada));
		
	}
	
	@Test
	public void testEmbaralhadorPermutaSilabasPalavraCompostaFalse() {
	
		String palavra ="pilavra" ;
		char[] arrayPalavra = palavra.toCharArray();
		String palavraEmbaralhada = embaralhador.embaralharPalavra("pa-la-vra");
		char[] arrayPalavraEmbaralhada = palavraEmbaralhada.toCharArray();
		 Arrays.sort(arrayPalavra);
		 Arrays.sort(arrayPalavraEmbaralhada);
		
		 assertFalse(Arrays.equals(arrayPalavra, arrayPalavraEmbaralhada));
	}
	 
	

}
