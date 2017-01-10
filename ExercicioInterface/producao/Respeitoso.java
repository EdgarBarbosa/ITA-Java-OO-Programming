
public class Respeitoso implements FormatadorNome {
	private char genero;
	
	
	
	public Respeitoso(char genero) {
		super();
		this.genero = genero;
	}



	@Override
	public String formatarNome(String nome, String sobrenome) {
		
		return (genero=='M') ? "Sr. " + sobrenome : "Sra. " + sobrenome;
	}

}
