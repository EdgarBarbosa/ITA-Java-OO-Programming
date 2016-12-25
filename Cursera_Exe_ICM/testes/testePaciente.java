package testes;
import src.Paciente;
import static org.junit.Assert.*;

import org.junit.Test;

public class testePaciente {
Paciente paciente1= new Paciente(30.0,1.80);
Paciente paciente2= new Paciente(54.0,1.80);
Paciente paciente3= new Paciente(59.0,1.80);
Paciente paciente4= new Paciente(55.0,1.70);
Paciente paciente5= new Paciente(83.0,1.80);
Paciente paciente6= new Paciente(103.0,1.80);
Paciente paciente7= new Paciente(128.0,1.80);
Paciente paciente8= new Paciente(300,1.80);
	@Test
	public void test() {
		assertTrue(paciente1!=null);
		
	}
	
	@Test
	public void testeCalcularIMC(){
		assertEquals((55.0/(1.70*1.70)),paciente4.calcularIMC(),0.01);
	
	}
	@Test
	public void testeDiagnosticoMuitoGrave(){
		assertEquals("Baixo peso muito grave",paciente1.diagnostico());
		
		
	}
	
	@Test
	public void testeDiagnosticoGrave(){
		assertEquals("Baixo peso grave",paciente2.diagnostico());
		
	}
	@Test
	public void testeDiagnosticoBaixoPeso(){
		assertEquals("Baixo peso",paciente3.diagnostico());
				
	}
	@Test
	public void testeDiagnosticoNormal(){
		assertEquals("Peso normal",paciente4.diagnostico());
				
	}
	@Test
	public void testeDiagnosticoSobrepeso(){
		assertEquals("Sobrepeso",paciente5.diagnostico());
				
	}
	@Test
	public void testeDiagnosticoObesidade(){
		assertEquals("Obesidade grau I",paciente6.diagnostico());
		
		
	}
	@Test
	public void testeDiagnosticoObesidadeII(){
		assertEquals("Obesidade grau II",paciente7.diagnostico());
		
		
	}
	@Test
	public void testeDiagnosticoObesidadeIII(){
		assertEquals("Obesidade grau III (obesidade mórbida)",paciente8.diagnostico());
		
	}
}
