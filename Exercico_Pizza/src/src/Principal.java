package src;

public class Principal {

	public static void main(String[] args) {
		// cria carrinho vazio
		Carrinho carrinho = new Carrinho();
		
		//cria pizzas
		
		Pizza pizza6Ingredientes = new Pizza("Mussarela");
		Pizza pizza2Ingredientes = new Pizza("Frango");
		Pizza pizza3Ingredientes = new Pizza("Calabresa");
		
		// Adiciona ingredientes á pizza
	
		pizza6Ingredientes.adicionaIngrediente("Oregano");
		pizza6Ingredientes.adicionaIngrediente("Azeite");
		pizza6Ingredientes.adicionaIngrediente("Frango");
		pizza6Ingredientes.adicionaIngrediente("Ovo");
		pizza6Ingredientes.adicionaIngrediente("Chanpinhom");
		pizza6Ingredientes.adicionaIngrediente("Mussarela");
		
		pizza3Ingredientes.adicionaIngrediente("Brócolis");
		pizza3Ingredientes.adicionaIngrediente("Chanpinhom");
		
		pizza2Ingredientes.adicionaIngrediente("Tomate");
		
		// Adiciona  pizzas ao carrinho
		carrinho.adicionaPizza(pizza2Ingredientes);
		carrinho.adicionaPizza(pizza3Ingredientes);
		carrinho.adicionaPizza(pizza6Ingredientes);
		
		Pizza.imprimeIngredientes();
		System.out.println("Total do carrinho = R$ " + carrinho.somaCarrinho()+",00");
		 

	}

}
