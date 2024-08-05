import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

class TesteZeraRegistro {

	void exibeRegistro() {
		System.out.println(Pizza.getContabilizacaoIngredientes());
	}

	void testZeraRegistro() {
		Pizza.zeraRegistro();
	}

	@Test
	void test() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngredientes("Molho");
		pizza1.adicionaIngredientes("Tomate");
		exibeRegistro();
		testZeraRegistro();
		exibeRegistro();
	}

}
