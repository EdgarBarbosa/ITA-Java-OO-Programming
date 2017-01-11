package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import producao.FabricaDeMecanicaDoJogo;
import producao.MecanicaDoJogo;
import producao.MecanicaModoVidas;

public class TesteFabricaDeMecanicaDeJogo {

	@Test
	public void testFrabricaDeMecanicaDoJogo() {
		FabricaDeMecanicaDoJogo fabricaDeMecanicaDoJogo = new FabricaDeMecanicaDoJogo();
		MecanicaDoJogo mecanicaDojogo =  fabricaDeMecanicaDoJogo.getMecanicaDoJogo('0');
		assertFalse(mecanicaDojogo == null);
		assertTrue(mecanicaDojogo instanceof MecanicaModoVidas);
		assertTrue(mecanicaDojogo.isIniciadoJogo());
		
	}

}
