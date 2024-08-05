package exercices_Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Exercices.*;

class testeSearch {

	@Test
	void testeBusca() {
		int n = 6;
		int[] array = { 4, 5, 8, 10, 12, 11 };
		int x = 2;

		int resultado = Search.search(array, n, x);
		
	}

}
