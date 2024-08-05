package teste;

import static org.junit.jupiter.api.Assertions.*;
import formatacaoNome.*;
import org.junit.jupiter.api.Test;

class TesteTratamentoInformal {

	FormatadorNome formatador;

	@Test
	void testeInformal() {
		formatador = new Informal();
		Autoridade pessoa = new Autoridade("Jorge", "Leite", formatador);
		assertEquals("Jorge", pessoa.getTratamento());
	}

	@Test
	void testeRespeitosoMasculino() {
		formatador = new Respeitoso(true);
		Autoridade pessoaM = new Autoridade("Murilo", "Borges", formatador);
		assertEquals("Sr. Borges", pessoaM.getTratamento());
	}

	@Test
	void testeRespeitosoFeminino() {
		formatador = new Respeitoso(false);
		Autoridade pessoaF = new Autoridade("Camilla", "Santos", formatador);
		assertEquals("Sra. Santos", pessoaF.getTratamento());
	}

	@Test
	void testeComTitulo() {
		formatador = new ComTitulo("Excelentissimo");
		Autoridade pessoaTitulo = new Autoridade("Fabio", "Pereira", formatador);
		assertEquals("Excelentissimo Fabio Pereira", pessoaTitulo.getTratamento());
	}
}