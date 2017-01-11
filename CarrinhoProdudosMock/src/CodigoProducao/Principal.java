package CodigoProducao;

public class Principal {

	public static void main(String[] args) {
		
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		Produto caderno10materias = new Produto("Caderno 10 matérias","CDN1010",25.70);
		Produto caderno20materias = new Produto("Caderno 20 matérias","CDN2013",45.35);
		Produto canetaBicPreta = new Produto("Caneta Bic Preta","CNT5466",1.85);
		Produto canetaBicAzul = new Produto("Caneta Bic Azul","CNT5466",1.85);
		Produto canetaPilotoVermelha = new Produto("Caneta Piloto Vermelha","CNT1122",2.20);
		Produto tenisBamba = new ProdutoComTamanho("Tenis bamba","TNS8677",25.70,40);
		Produto camisaTamanhoM = new ProdutoComTamanho("Camisa branca","CMS7722",18.66,22);
		Produto camisaTamanhoGG = new ProdutoComTamanho("Camisa Azul GG","CMS7725",25.20,33);
		Produto camisaTamanhoM2 = new ProdutoComTamanho("Camisa branca M","CMS7722",18.00,20);
		Produto bermudaTamanhoM = new ProdutoComTamanho("Camisa Cinza M","BMD2341",23.45,15);
		
		meuCarrinho.adicionaProduto(caderno10materias, 2);
		meuCarrinho.adicionaProduto(caderno20materias, 1);
		meuCarrinho.adicionaProduto(canetaBicAzul, 3);
		meuCarrinho.adicionaProduto(canetaBicPreta, 3);
		meuCarrinho.adicionaProduto(canetaPilotoVermelha, 1);
		meuCarrinho.adicionaProduto(tenisBamba, 1);
		meuCarrinho.adicionaProduto(camisaTamanhoM, 2);
		meuCarrinho.adicionaProduto(camisaTamanhoGG, 5);
		meuCarrinho.adicionaProduto(camisaTamanhoM2, 1);
		meuCarrinho.adicionaProduto(bermudaTamanhoM, 2);
		meuCarrinho.removeProduto(camisaTamanhoGG);
		meuCarrinho.removeProduto(canetaPilotoVermelha);
		meuCarrinho.removeProduto(tenisBamba);
		
		
		System.out.println("====Lista de Produtos====");
		meuCarrinho.imprimeProdutosDoCarrinho();
		System.out.println();
		System.out.println("Total de produtos do carrinho = "+meuCarrinho.totalDeItensDoCarrinho());
		System.out.println("Valor Total da Compra = R$ "+meuCarrinho.calculaTotalDaCompra());
		
		
		
	}

}
