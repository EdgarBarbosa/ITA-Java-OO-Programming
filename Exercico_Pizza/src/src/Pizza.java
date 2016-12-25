package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Pizza {

	public static HashMap<String,Integer> mapaDeIngredientes = new HashMap<String,Integer>();

	// atributos da instancia
	private String ingrediente;
	private List<String> listaIngredientes =  new  ArrayList<String>();


	// construtor que obriga ao menos um ingrediente na pizza

	public Pizza(String ingrediente) {

		this.ingrediente = ingrediente;
		listaIngredientes.add(ingrediente);
		Pizza.contabilizaIngredientes(ingrediente);
	}

	// geters e seters
	public List<String> getListaIngredientes() {

		return listaIngredientes;
	}

	// metodos da instancia



	//metodo que adiciona ingrediente à pizza
	public boolean adicionaIngrediente(String ingrediente) {

		Pizza.contabilizaIngredientes(ingrediente);
		return listaIngredientes.add(ingrediente);
	}

	// metodo que calcula preco da pizza com base no numero de ingradientes
	public int getPreco() {
		if(listaIngredientes.size() <= 2){
			return 15;

		}else if(listaIngredientes.size() >= 3 && listaIngredientes.size() <= 5 ){
			return 20;
		}
		else{
			return 23;
		}
	}


	public static void imprimeIngredientes() {

		Set chaves = mapaDeIngredientes.keySet();
		Iterator i = chaves.iterator();

		while(i.hasNext()){
			String chave = (String) i.next();
			System.out.println(" "+mapaDeIngredientes.get(chave)+" "+ chave );
		}
		return ;
	}

	// metodo que contabiliza a quantidade de ingredientes
	public static int contabilizaIngredientes(String ingrediente) {
		if(mapaDeIngredientes.isEmpty()){
			mapaDeIngredientes.put(ingrediente, 1);
		}else if(mapaDeIngredientes.containsKey(ingrediente)){
			Set chaves = mapaDeIngredientes.keySet();
			Iterator i = chaves.iterator();
			while(i.hasNext()){
				String chave = (String) i.next();
				if(chave.equals(ingrediente)){
					mapaDeIngredientes.put(ingrediente, 
						mapaDeIngredientes.get(ingrediente)+1);
				}
			}
		}else{mapaDeIngredientes.put(ingrediente, 1);}


		return mapaDeIngredientes.size();
	}
	
	public static void limpaMapa(){
		mapaDeIngredientes = null;
		mapaDeIngredientes = new HashMap<String,Integer>();
		
		
	}

}
