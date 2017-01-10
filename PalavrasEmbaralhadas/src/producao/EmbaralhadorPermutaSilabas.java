package producao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EmbaralhadorPermutaSilabas implements EmbaralhadorDePalavras {

	@Override
	public String embaralharPalavra(String palavraRecedidaParaEmbaralhar) {  
			
		Random geradorDeNumerosAleatorios = new Random();
		String palavraEmbaralhada = "";
		if(palavraRecedidaParaEmbaralhar.contains("-")){
		while(palavraEmbaralhada.equals(FormatadorDePalavra.removeIfenDaPalavra(palavraRecedidaParaEmbaralhar)) 
				|| palavraEmbaralhada.equals("")){
			palavraEmbaralhada = "";
			String[] arrayDeSilabasDaPalavra = palavraRecedidaParaEmbaralhar.split("-");
			ArrayList<String> listaDeSilabasDaPalavra = new ArrayList<String>(Arrays.asList(arrayDeSilabasDaPalavra));

			while(!listaDeSilabasDaPalavra.isEmpty()){
				int indiceDaSilaba = geradorDeNumerosAleatorios.nextInt(listaDeSilabasDaPalavra.size());
				palavraEmbaralhada +=  listaDeSilabasDaPalavra.remove(indiceDaSilaba);
			}}
		return palavraEmbaralhada;
		}else return palavraRecedidaParaEmbaralhar;
		
	}
}
