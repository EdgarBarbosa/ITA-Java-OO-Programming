package testes;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import producao.BancoDePalavras;

public class TesteBancoDepalavras {

	@Test
	public void testBancoDePalavras() {
		BancoDePalavras bancoDePalavras = new BancoDePalavras("./arquivosDedados/baseDePalavrasTeste.txt");
		Pattern padrao = Pattern.compile("pa-la-vra|com-pu-ta-dor|pro-gra-ma-ção");
		String palavra = bancoDePalavras.getPalavraAleatoria();
		Matcher matches = padrao.matcher(palavra);
		assertTrue(matches.find());
	}

}
