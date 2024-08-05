import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrinhoDeCompras {
	private List<Pizza> pizzas;

	public CarrinhoDeCompras() {
		this.pizzas = new ArrayList<>();
	}

	public void adicionarPizza(Pizza pizza) {
		if (pizza.temIngredientes()) {
			pizzas.add(pizza);
		} else {
			throw new IllegalArgumentException("Não é possivel adicionar uma pizza sme ingredientes ao carrinho");
		}
	}

	public double getValorTotal() {
		double valorTotal = 0.0;
		for (Pizza pizza : pizzas) {
			valorTotal += pizza.getPreco();
		}
		return valorTotal;
	}
}
