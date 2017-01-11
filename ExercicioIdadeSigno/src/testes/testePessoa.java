package testes;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import producao.Pessoa;
import producao.Relogio;

public class testePessoa {
	
	Date dataNascimento;
	Date dataNascimentoEsperada;
	Pessoa pessoa, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6 ;
	Pessoa pessoa7, pessoa8, pessoa9, pessoa10, pessoa11, pessoa12 ;
	
	@Before
 	public void inicializar(){
		
		pessoa = new Pessoa(new Date(81,1,21));
		pessoa2 = new Pessoa(new Date(100,0,21));
		pessoa3 = new Pessoa(new Date(97,0,20));
		pessoa4 = new Pessoa(new Date(86,10,30));
		pessoa5 = new Pessoa(new Date(102,10,20));
		pessoa6 = new Pessoa(new Date(79,8,23));
		pessoa7 = new Pessoa(new Date(83,7,25));
		pessoa8 = new Pessoa(new Date(100,7,15));
		pessoa9 = new Pessoa(new Date(99,6,20));
		pessoa10 = new Pessoa(new Date(108,5,10));
		pessoa11 = new Pessoa(new Date(78,3,22));
		pessoa12 = new Pessoa(new Date(101,3,20));
	}

	@Test
	public void testExistePessoa() {
		
		dataNascimentoEsperada = (Date) pessoa.getDataNascimento();
		assertEquals(81,dataNascimentoEsperada.getYear());
		assertEquals(1, dataNascimentoEsperada.getMonth());
		assertEquals(21, dataNascimentoEsperada.getDate());
	}

		
	@Test
	public void testGetIdade() {
		assertEquals( (Relogio.agora() - 
				pessoa.getDataNascimento().getTime()) /
				1000 /60 /60 /24 /365
				, pessoa.getIdade());
		
		assertEquals( (Relogio.agora() - 
				pessoa2.getDataNascimento().getTime()) /
				1000 /60 /60 /24 /365, pessoa2.getIdade());
	}
	
	@Test
	public void testGetSigno() {
		assertEquals("Peixes", pessoa.getSigno());
		assertEquals("Aquário", pessoa2.getSigno());
		assertEquals("Capricórnio", pessoa3.getSigno());
		assertEquals("Sagitário", pessoa4.getSigno());
		assertEquals("Escorpião", pessoa5.getSigno());
		assertEquals("Libra", pessoa6.getSigno());
		assertEquals("Virgem", pessoa7.getSigno());
		assertEquals("Leão", pessoa8.getSigno());
		assertEquals("Câncer", pessoa9.getSigno());
		assertEquals("Gêmeos", pessoa10.getSigno());
		assertEquals("Touro", pessoa11.getSigno());
		assertEquals("Áries", pessoa12.getSigno());
	}
	
}
