import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteValorPizza {

	@Test
	void testValorPizza() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngredientes("Tomate");
		assertEquals(15, pizza1.getPreco());
	}

	@Test
	void testValorPizza20() {
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngredientes("Tomate");
		pizza2.adicionaIngredientes("Cebola");
		pizza2.adicionaIngredientes("Mussarela");
		assertEquals(20, pizza2.getPreco());
	}

	@Test
	void testValorPizza23() {
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngredientes("Tomate");
		pizza3.adicionaIngredientes("Cebola");
		pizza3.adicionaIngredientes("Mussarela");
		pizza3.adicionaIngredientes("Carne seca");
		pizza3.adicionaIngredientes("Palmito");
		pizza3.adicionaIngredientes("Ovo");
		assertEquals(23, pizza3.getPreco());
	}
}
