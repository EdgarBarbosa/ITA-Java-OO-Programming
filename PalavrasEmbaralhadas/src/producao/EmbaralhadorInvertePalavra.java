package producao;

public class EmbaralhadorInvertePalavra implements EmbaralhadorDePalavras{
	private final double fatorDePontuacao = 0.1;
	
	@Override
	public double getFatorDePontuacao() {
		return fatorDePontuacao;
	}

	@Override
	public  String embaralharPalavra(String palavraRecebidaParaEmbaralhar) {
		String palavraEmbaralhada = "";
		while(palavraEmbaralhada.equals("") 
				|| palavraEmbaralhada.equals(
						FormatadorDePalavra.removeIfenDaPalavra(palavraRecebidaParaEmbaralhar))){
		StringBuilder palavraTemporia = new StringBuilder(palavraRecebidaParaEmbaralhar);
		palavraTemporia.reverse();
		palavraEmbaralhada = FormatadorDePalavra.removeIfenDaPalavra(palavraTemporia.toString());
		
	}
		return palavraEmbaralhada;
	}
}