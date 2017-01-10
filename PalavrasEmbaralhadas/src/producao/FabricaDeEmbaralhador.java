package producao;

import java.util.ArrayList;
import java.util.Random;

public class FabricaDeEmbaralhador {
	private ArrayList<EmbaralhadorDePalavras> listaDeEmbaralhadores;

	public EmbaralhadorDePalavras getEmbaralhador(){
		 Random geradorDeNumeroAleatorio = new Random();
		 listaDeEmbaralhadores = new ArrayList<EmbaralhadorDePalavras>();
		 listaDeEmbaralhadores.add(new EmbaralhadorInvertePalavra());
		 listaDeEmbaralhadores.add(new EmbaralhadorPermutaSilabas());
		 listaDeEmbaralhadores.add(new EmbaralhadorPermutaLetras());
		 
		 return listaDeEmbaralhadores.get(geradorDeNumeroAleatorio.nextInt(listaDeEmbaralhadores.size()));
	 }
	
}
