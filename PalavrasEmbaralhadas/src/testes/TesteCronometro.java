package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import producao.Cronometro;
import producao.MecanicaModoTempoLimitado;

public class TesteCronometro {

	@Test
	public void testCronometro() {
		Cronometro cronometro = new Cronometro();
		 assertTrue(cronometro.iniciaCronometro(new MecanicaModoTempoLimitado()));
	}

}
