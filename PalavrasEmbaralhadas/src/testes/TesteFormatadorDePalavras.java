package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import producao.FormatadorDePalavra;

public class TesteFormatadorDePalavras {

	@Test
	public void testFormatadorDePalavras() {
		
			
			assertEquals("palavra", FormatadorDePalavra.removeIfenDaPalavra("pa-la-vra"));
		}
	}

