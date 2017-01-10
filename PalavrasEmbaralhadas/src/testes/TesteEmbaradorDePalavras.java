package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import producao.EmbaralhadorInvertePalavra;

public class TesteEmbaradorDePalavras {
	EmbaralhadorInvertePalavra  embaralhador;
	
	@Before
	public void inicializador(){
		embaralhador =  new EmbaralhadorInvertePalavra();
		
	}

	@Test
	public void testEmabaradorInvertePalavra() {
		
		assertEquals("arvalap", embaralhador.embaralharPalavra("pa-la-vra"));
	}
	
	@Test
	public void testEmabaradorInvertePalavraComposta() {
		
		assertEquals("atsopmoc arvalap", embaralhador.embaralharPalavra("pa-la-vra com-pos-ta"));
	}
}
