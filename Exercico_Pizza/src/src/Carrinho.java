package src;
import java.util.ArrayList;
import java.util.List;

import src.Pizza;

public class Carrinho {
private List <Pizza> lista = new ArrayList<Pizza>();

public boolean adicionaPizza(List<Pizza> pizza) {
	
	return lista.addAll(pizza);
}
public boolean adicionaPizza(Pizza pizza) {
	
	return lista.add(pizza);
}

public int somaCarrinho() {
	int total = 0;
	for (Pizza pizza : lista) {
		total += pizza.getPreco();
	}
	return total;
}
}
