package producao;

public abstract class MecanicaDoJogo {
	String palavraChaveAleatoria, palavraRespostaJogador, palabraEmbaralhada;
	BancoDePalavras bancoDePalavras;
	FabricaDeEmbaralhador fabricaDeEmbaralhador;
	EmbaralhadorDePalavras embaralhadorDePalavras;
	int pontuacaoDoJogador;

	public abstract boolean isTerminadoJogo();
	public abstract int getNumeroDeVidasDoJogador();
	public abstract double calcularPontuacaoDoJogador();

	public  int getPontuacaoDoJogador(){
		return pontuacaoDoJogador;
	}

	public EmbaralhadorDePalavras getEmbaralhadorDePalavras() {
		return embaralhadorDePalavras;
	}
	public String getPalavraChave() {
		return palavraChaveAleatoria;
	}

	public boolean isIniciadoJogo(){
		bancoDePalavras = new BancoDePalavras("./arquivosDedados/baseDePalavrasReal.txt");
		fabricaDeEmbaralhador = new FabricaDeEmbaralhador();
		embaralhadorDePalavras = fabricaDeEmbaralhador.getEmbaralhador();
		this.palavraChaveAleatoria = bancoDePalavras.getPalavraAleatoria();
		this.palabraEmbaralhada = embaralhadorDePalavras.embaralharPalavra(palavraChaveAleatoria);
		this.palavraChaveAleatoria = FormatadorDePalavra.removeIfenDaPalavra(palavraChaveAleatoria);

		return true;
	}

	public boolean isAcertouPalavraEmbaralhada(String palavraRespostaJogador){
		if(this.palavraChaveAleatoria.equals(palavraRespostaJogador)){
			calcularPontuacaoDoJogador();
			return true;
			}
		else return false ;
	}
}
