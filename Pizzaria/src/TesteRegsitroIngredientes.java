import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteRegsitroIngredientes {

	@BeforeEach
	void setup() {
		Pizza.getContabilizacaoIngredientes().clear();
	}

	@Test
	void testAdicionaIngredienteEContabiliza() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngredientes("Tomate");
		pizza1.adicionaIngredientes("cebola");
		pizza1.adicionaIngredientes("Atum");

		Map<String, Integer> contabilizacao = Pizza.getContabilizacaoIngredientes();

		assertEquals(1, contabilizacao.get("Tomate"));
		assertEquals(1, contabilizacao.get("cebola"));
		assertEquals(1, contabilizacao.get("Atum"));
		assertEquals(3, contabilizacao.size());
	}

	@Test
	void testCOntabilizacaoMultipla() {
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngredientes("Tomate");
		pizza2.adicionaIngredientes("Mussarela");
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngredientes("Atum");
		pizza3.adicionaIngredientes("Mussarela");

		Map<String, Integer> contabilizacao = Pizza.getContabilizacaoIngredientes();

		assertEquals(2, contabilizacao.get("Mussarela"));
		assertEquals(1, contabilizacao.get("Tomate"));
		assertEquals(1, contabilizacao.get("Atum"));
		assertEquals(3, contabilizacao.size());
	}

}
