
public class Autoridade {
	private String nome, sobrenome; 
	private FormatadorNome formatadorNome;
	
	
	public Autoridade(String nome, String sobrenome ) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatadorNome =  new Informal();
	}
	
	public Autoridade(String nome, String sobrenome, char genero ) {
		this(nome,sobrenome);
		this.formatadorNome =  new Respeitoso(genero);
	}

	public Autoridade(String nome, String sobrenome, String titulo ) {
		this(nome,sobrenome);
		this.formatadorNome =  new ComTitulo(titulo);
	}
	
	public String getTratamento(){
		
		return formatadorNome.formatarNome(nome, sobrenome);
	}; 
}
