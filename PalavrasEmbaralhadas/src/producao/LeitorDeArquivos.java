package producao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorDeArquivos {


	private FileReader leitorDeArquivos;
	private BufferedReader buffer;
	private List<String> listaDePalavras = new ArrayList<String>();
	private List<String> listaDePalavrasCopia;

	public List<String> lerArquivoDeTexto(String nomeDoArquivo){
		try{

			leitorDeArquivos = new FileReader(nomeDoArquivo);
			buffer = new BufferedReader(leitorDeArquivos);
			String linhaDoArquivo = buffer.readLine();

			while(linhaDoArquivo != null){
				listaDePalavras.add(linhaDoArquivo);
				linhaDoArquivo = buffer.readLine();
			}
		}
		catch(IOException e){
			e.printStackTrace();		
		} finally {
			if (buffer != null)
				try {
					buffer.close();
				}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		listaDePalavrasCopia = new ArrayList<String>(listaDePalavras);
		return listaDePalavrasCopia;
	}

}
