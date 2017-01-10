package producao;

public class EmbaralhadorInvertePalavra implements EmbaralhadorDePalavras{


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