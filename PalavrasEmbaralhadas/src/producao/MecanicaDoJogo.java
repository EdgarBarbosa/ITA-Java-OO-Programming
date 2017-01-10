package producao;

public abstract class MecanicaDoJogo {
	String palavraChave, palavraRespostaJogador, palabraEmbaralhada;
	BancoDePalavras bancoDePalavras;
	FabricaDeEmbaralhador fabricaDeEmbaralhador;
	String caminhoDabaseDePalavras;
	EmbaralhadorDePalavras embaralhadorDePalavras;
	int pontuacaoDoJogador;
	
public  int getPontuacao(){
	return pontuacaoDoJogador;
}

public abstract boolean isTerminado();
public abstract int getVidas();
public abstract double calcularFatorDePontuação();

public EmbaralhadorDePalavras getEmbaralhadorDePalavras() {
	return embaralhadorDePalavras;
}
public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

public boolean iniciaJogo(){
	bancoDePalavras = new BancoDePalavras("./arquivosDedados/baseDePalavrasReal.txt");
	fabricaDeEmbaralhador = new FabricaDeEmbaralhador();
	embaralhadorDePalavras = fabricaDeEmbaralhador.getEmbaralhador();
	this.palavraChave = bancoDePalavras.getPalavraAleatoria();
	this.palabraEmbaralhada = embaralhadorDePalavras.embaralharPalavra(palavraChave);
	this.palavraChave = FormatadorDePalavra.removeIfenDaPalavra(palavraChave);
	
	return true;
}

public boolean isAcertouPalavraEmbaralhada(String palavraRespostaJogador){
	
	return this.palavraChave.equals(palavraRespostaJogador);
}
}
