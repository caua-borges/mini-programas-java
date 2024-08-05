package cursoITA;

public class CarroSoma extends CarroDeCorrida {
	private int potencia;

	public CarroSoma(int potencia, String nome, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	public void acelerar() {
		velocidade += potencia;
		if (velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;
	}

}