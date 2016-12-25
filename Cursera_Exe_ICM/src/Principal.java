package src;

public class Principal {

	public static void main(String[] args) {
		//cria Pacientes
		
		Paciente jose = new Paciente(55.0,1.70);
		Paciente pedro = new Paciente(93.0,1.85);
		Paciente joao= new Paciente(50.0,1.75);

		//metodos da intancia José
		System.out.println("ICM de José= " + jose.calcularIMC());
		System.out.println("Diagnostico de José = " + jose.diagnostico());
		
		System.out.println("=============================");
		//metodos da intancia Pedro
		System.out.println("ICM de Pedro= " + pedro.calcularIMC());
		System.out.println("Diagnostico de Pedro = " + pedro.diagnostico());
		
		System.out.println("=============================");
		//metodos da intancia Joao
		System.out.println("ICM de Joao= " + joao.calcularIMC());
		System.out.println("Diagnostico de Joao = " + joao.diagnostico());
	}

}
