import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutoridade {

	@Test
	public void testFormatadorInformal() {
		Autoridade autoridade = new Autoridade("João","Mascarenhas");
		
		assertEquals("João", autoridade.getTratamento());
	}

	@Test
	public void testFormatadorRespeitosoMasculino() {
		Autoridade autoridade = new Autoridade("José","Monteiro",'M');
		
		assertEquals("Sr. Monteiro", autoridade.getTratamento());
		
	}

	@Test
	public void testFormatadorRespeitosoFeminino() {
		Autoridade autoridade = new Autoridade("Maria","Oliveira",'F');
		
		assertEquals("Sra. Oliveira", autoridade.getTratamento());
		
	}
	
	@Test
	public void testFormatadorComTitulo() {
		Autoridade autoridade = new Autoridade("Pedro","Cabral","Magnífico");
		
		assertEquals("Magnífico Pedro Cabral", autoridade.getTratamento());
		
	}
}
