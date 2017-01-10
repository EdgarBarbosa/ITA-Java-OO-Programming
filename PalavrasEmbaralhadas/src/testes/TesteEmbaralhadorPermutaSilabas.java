package testes;



import java.util.regex.Pattern;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import org.junit.Test;

public class TesteEmbaralhadorPermutaSilabas extends TesteEmbarador  {
	
	
	@Test
	public void testEmbaralhadorPermutaSilabas() {
		
		Pattern padrao = Pattern.compile("vrapala|lapavra|pavrala|lavrapa|vralapa");
		String palavra = embaralhador.embaralharPalavra("pa-la-vra");
		Matcher matches = padrao.matcher(palavra);
		assertTrue(matches.find());
	}
	
	@Test
	public void testEmbaralhadorPermutaSilabasPalavraCompostaTrue() {
	
		String palavra ="palavra composta" ;
		char[] arrayPalavra = palavra.toCharArray();
		String palavraEmbaralhada = embaralhador.embaralharPalavra("pa-la-vra com-pos-ta");
		char[] arrayPalavraEmbaralhada = palavraEmbaralhada.toCharArray();
		 Arrays.sort(arrayPalavra);
		 Arrays.sort(arrayPalavraEmbaralhada);
		
		 assertTrue(Arrays.equals(arrayPalavra, arrayPalavraEmbaralhada));
	}
	@Test
	public void testEmbaralhadorPermutaSilabasPalavraCompostaFalse() {
	
		String palavra ="palavra composto" ;
		char[] arrayPalavra = palavra.toCharArray();
		String palavraEmbaralhada = embaralhador.embaralharPalavra("pa-la-vra com-pos-ta");
		char[] arrayPalavraEmbaralhada = palavraEmbaralhada.toCharArray();
		 Arrays.sort(arrayPalavra);
		 Arrays.sort(arrayPalavraEmbaralhada);
		
		 assertFalse(Arrays.equals(arrayPalavra, arrayPalavraEmbaralhada));
	}

}
