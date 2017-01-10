package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import producao.EmbaralhadorDePalavras;
import producao.FabricaDeEmbaralhador;

public class TesteFabricadeEmbaralhador {

	@Test
	public void testFrabricaDeEmbaralhador() {
		FabricaDeEmbaralhador fabricaDeEmbaralhador = new FabricaDeEmbaralhador();
		EmbaralhadorDePalavras embaralhador =  fabricaDeEmbaralhador.getEmbaralhador();
		assertFalse(embaralhador == null);
		assertNotEquals("", embaralhador.embaralharPalavra("palavra"));
	}

}
