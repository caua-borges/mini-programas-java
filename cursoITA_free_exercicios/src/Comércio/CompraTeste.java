package Comércio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompraTeste {

	@Test
	public void compraAVista() {
		Compra c = new Compra(1000);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(1000, c.getValorTotal());
		assertEquals(1000, c.getValorParcela());
	}

	public void compraParcelada() {
		Compra c = new Compra(4, 250);
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(1000, c.getValorParcela());
		assertEquals(250, c.getValorParcela());
	}
}