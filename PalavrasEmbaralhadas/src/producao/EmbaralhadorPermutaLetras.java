package producao;

import java.util.ArrayList;
import java.util.Random;

public class EmbaralhadorPermutaLetras implements EmbaralhadorDePalavras{
	private final double fatorDePontuacao = 0.3;

	@Override
	public double getFatorDePontuacao() {
		return fatorDePontuacao;
	}
	
	@Override
	public String embaralharPalavra(String palavraRecebidaParaEmbaralhar) {

		Random gerador = new Random();
		String palavraEmbaralhada="";
		
		if(palavraRecebidaParaEmbaralhar.contains("-")){
			while(palavraEmbaralhada.equals(FormatadorDePalavra.removeIfenDaPalavra(palavraRecebidaParaEmbaralhar)) 
					|| palavraEmbaralhada.equals("")){
				
					palavraEmbaralhada = "";
					palavraRecebidaParaEmbaralhar = FormatadorDePalavra.removeIfenDaPalavra(palavraRecebidaParaEmbaralhar);
					char[] arrayTemporarioDeCaracteresDaPalavra = palavraRecebidaParaEmbaralhar.toCharArray();
					ArrayList<Character> listaDeSilabasDaPalavra =  new ArrayList<Character>(arrayTemporarioDeCaracteresDaPalavra.length);

				for (int i = 0; i < arrayTemporarioDeCaracteresDaPalavra.length; i++) {
					listaDeSilabasDaPalavra.add(new Character(arrayTemporarioDeCaracteresDaPalavra[i]));
				}

				while(!listaDeSilabasDaPalavra.isEmpty()){
					int indiceDaSilaba = gerador.nextInt(listaDeSilabasDaPalavra.size());
					palavraEmbaralhada +=  listaDeSilabasDaPalavra.remove(indiceDaSilaba);
				}
			}
			return palavraEmbaralhada;
		}else return palavraRecebidaParaEmbaralhar;

	}
}
