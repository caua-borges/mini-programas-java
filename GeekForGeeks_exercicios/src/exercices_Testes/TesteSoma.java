package exercices_Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import Exercices.NumerosImparesEPares;
class TesteSoma {

	@Test
	void testSomaPar() {
		ArrayList<Integer> resultado = NumerosImparesEPares.getSum(6);
		assertLinesMatch(12, resultado);
	}

}
