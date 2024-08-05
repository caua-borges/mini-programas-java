import java.util.Map;
import java.util.Map.Entry;

public class Principal {
	public static void main(String args[]) {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		pizza1.adicionaIngredientes("Queijo mussarela");
		pizza1.adicionaIngredientes("tomate");
		pizza1.adicionaIngredientes("Bacon");
		pizza1.adicionaIngredientes("tomate");
		pizza2.adicionaIngredientes("atum");
		pizza2.adicionaIngredientes("cebola");
		pizza3.adicionaIngredientes("carne seca");
		pizza3.adicionaIngredientes("pimenta");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);

		System.out.println("Valor total do carrinho: " + carrinho.getValorTotal());

		System.out.println("Contabilização dos ingredientes:");
		for (Map.Entry<String, Integer> entry : Pizza.getContabilizacaoIngredientes().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
