package producao;

public class FormatadorDePalavra {

	public static String removeIfenDaPalavra(String palavra){
		StringBuilder palavraCopia =  new StringBuilder(palavra);
		
		if(palavra.contains("-")){
			for(int i=0; i< palavraCopia.length(); i++)
				if(palavraCopia.charAt(i) == '-')
					palavraCopia.deleteCharAt(i);
			return palavraCopia.toString();
		}else 
			return palavra;
	}
}
