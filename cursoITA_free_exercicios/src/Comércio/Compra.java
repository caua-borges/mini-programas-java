package Comércio;

public class Compra {
	int valorTotal;
	int numeroParcelas;

	// a vista
	public Compra(int valor) {
		this.valorTotal = valor;
		numeroParcelas = 1;
	}

	// parcelado
	public Compra(int qtdParcelas, int valorParcela) {
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public int getValorParcela() {
		return valorTotal / numeroParcelas;
	}
}
