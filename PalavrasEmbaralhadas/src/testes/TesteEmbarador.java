package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import producao.BancoDePalavras;
import producao.EmbaralhadorPermutaSilabas;

public class TesteEmbarador {
	EmbaralhadorPermutaSilabas embaralhador;
	BancoDePalavras bancoDePalavras;
	@Before
	public void inicializador(){
		embaralhador = new EmbaralhadorPermutaSilabas();
		bancoDePalavras = new BancoDePalavras("./arquivosDedados/baseDePalavrasReal.txt");
	}
	@Test
	public void testPalavraVazia() {
		String palavraEmbaralhada, palavraParaEmbaralhar;
		for (int i = 0; i < 20; i++) {
			palavraParaEmbaralhar = bancoDePalavras.getPalavraAleatoria();
			palavraEmbaralhada = embaralhador.embaralharPalavra(palavraParaEmbaralhar);
			if(palavraEmbaralhada.equals("")){
				System.out.println(embaralhador.getClass());
				System.out.println(palavraParaEmbaralhar);
				System.out.println(palavraEmbaralhada);
				fail();}
		}
		
	}
	
	@Test
	public void testNaoEmbaralhou() {
		String palavraEmbaralhada, palavraParaEmbaralhar;
		for (int i = 0; i < 20; i++) {
			palavraParaEmbaralhar = bancoDePalavras.getPalavraAleatoria();
			palavraEmbaralhada = embaralhador.embaralharPalavra(palavraParaEmbaralhar);
			if(palavraEmbaralhada.equals(palavraParaEmbaralhar)){
				System.out.println(embaralhador.getClass());
				System.out.println(palavraParaEmbaralhar);
				System.out.println(palavraEmbaralhada);
				fail();}
		}
	}

	
}
