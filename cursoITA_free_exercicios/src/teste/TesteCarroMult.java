package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cursoITA.CarroDeCorrida;
import cursoITA.CarroMult;
import cursoITA.CarroSoma;

class TesteCarroMult {

	CarroDeCorrida c;

	@Test
	void testFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}

	@BeforeEach
	void inicializaCarro() {
		c = new CarroMult("Corcel", 10, 100);
	}

	@Test
	void testVelocidadeMaxima() {
		for (int i = 0; i < 14; i++)
			c.acelerar();
		assertEquals(100, c.getVelocidade());
	}

	@Test
	void testCarroParado() {
		assertEquals(0, c.getVelocidade());
	}

	@Test
	void testAcelerarUmaVez() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}

	@Test
	void testFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	void testAcelerarDuasVezes() {
		c.acelerar();
		c.acelerar();
		assertEquals(15, c.getVelocidade());
	}
}
