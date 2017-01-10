package producao;

import java.util.List;
import java.util.Random;

public class BancoDePalavras {
	private LeitorDeArquivos leitorDearquivo = new LeitorDeArquivos();
	private String diretorioDoArquivo;
	private List<String> listaDePalavrasArquivo;
	
	
	
	public BancoDePalavras(String diretorioDoArquivo) {
		this.diretorioDoArquivo = diretorioDoArquivo;
	}

	public String getPalavraAleatoria() {
		
		listaDePalavrasArquivo = leitorDearquivo.lerArquivoDeTexto(diretorioDoArquivo);
		Random geradorAleatorio=  new Random();
		
		return listaDePalavrasArquivo.get(geradorAleatorio.nextInt(listaDePalavrasArquivo.size()));
	}
		
}
