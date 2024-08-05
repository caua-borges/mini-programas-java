package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import PessoaNascimento.*;

class TestePessoa {

	Pessoa p;

	@Test
	void testeCapturaIdade() {
		p = new Pessoa("30-05-2000");
		assertEquals(p.getIdade(), 24);
	}

	@Test
	void testeCapturaSignoGêmeos() {
		p = new Pessoa("30-05-2000");
		assertEquals(p.getSigno(), "Gêmeos");
	}

	@Test
	void testeCapturaSignoEscorpiao() {
		p = new Pessoa("03-11-2004");
	}

	@Test
	void testeCapturaIdadeEscorpiao() {
		p = new Pessoa("03-11-2004");
		assertEquals(p.getIdade(), 19);
	}
}