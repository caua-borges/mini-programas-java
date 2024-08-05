package exercices_Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Exercices.*;

class comparacaoTeste {

	@Test
	void testComparacaoMaior() {
		String resultado = Comparacao.compareNM(5, 4);

		assertEquals("greater", resultado, "Deveria retornar greater");
	}

	@Test
	void testComparacaoIgual() {
		String resultado = Comparacao.compareNM(2, 2);

		assertEquals("equal", resultado, "Deveria retornar greater");
	}

	@Test
	void testComparacaoMenor() {
		String resultado = Comparacao.compareNM(3, 6);

		assertEquals("lesser", resultado, "Deveria retornar greater");
	}
}
