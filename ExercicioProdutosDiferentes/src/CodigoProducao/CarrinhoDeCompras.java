package CodigoProducao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CarrinhoDeCompras {
	private Map <Produto,Integer> carrinhoDeCompras = new HashMap<Produto,Integer>();


	public int totalDeItensDoCarrinho() {
		Set<Produto> chaves = carrinhoDeCompras.keySet();
		Iterator<Produto> i = chaves.iterator();
		Produto chave;
		int totalDeItens=0;
		while (i.hasNext()){
			chave = (Produto)i.next();
			totalDeItens += carrinhoDeCompras.get(chave);
		}
		return  totalDeItens;
	}


	public boolean adicionaProduto(Produto produto, Integer quantidade) {
		if(carrinhoDeCompras.containsKey(produto)){
			carrinhoDeCompras.put(produto, quantidade + carrinhoDeCompras.get(produto));
		}
		else carrinhoDeCompras.put(produto, quantidade);

		return carrinhoDeCompras.containsKey(produto);
	}


	public Integer totalDeItensDoProduto(Produto produto) {
		if(carrinhoDeCompras.containsKey(produto)){
			return carrinhoDeCompras.get(produto);
		}else
			return 0;
	}


	public double calculaTotalDaCompra() {
		double totalDaCompra=0.0;

		Produto produto=null;
		if(carrinhoDeCompras.isEmpty())
			return totalDaCompra;
		else{
			Set<Produto> chaves = carrinhoDeCompras.keySet();
			Iterator<Produto> i = chaves.iterator();
			while (i.hasNext()){
				produto = (Produto)i.next();
				totalDaCompra += produto.getPreco()* this.totalDeItensDoProduto(produto);
			}
		}
		return totalDaCompra;

	}

	public void esvaziaCarrinho(){
		carrinhoDeCompras.clear();

	}


	public boolean removeProduto(Produto produto) {
		if(carrinhoDeCompras.size()==0)
			return false;
		else if (carrinhoDeCompras.containsKey(produto) && this.totalDeItensDoProduto(produto) > 1){
			carrinhoDeCompras.replace(produto, carrinhoDeCompras.get(produto),carrinhoDeCompras.get(produto)-1);
			return true;	
		}else{
			carrinhoDeCompras.remove(produto);
			return true;
		}
		
	}
	public void imprimeProdutosDoCarrinho() {
		Set<Produto> chaves = carrinhoDeCompras.keySet();
		Iterator<Produto> i = chaves.iterator();
		Produto chave;
		while (i.hasNext()){
			chave = (Produto)i.next();
			System.out.println(" " + chave.getNome() + " qtd " + carrinhoDeCompras.get(chave) );
		}

	}
}
