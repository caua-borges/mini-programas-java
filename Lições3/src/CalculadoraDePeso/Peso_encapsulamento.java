package CalculadoraDePeso;

import java.util.Scanner;

public class Peso_encapsulamento {
	private double peso = 0, pesoEngordado = 0, pesoEmagrecido = 0;
	private int pergunta = 0;
	 String mensagem = "";
	Scanner teclado = new Scanner(System.in);

	public void setPeso(double pesoInfo, int pergunta) {
		this.peso = pesoInfo;
		this.pergunta = pergunta;
	}

	private String calcularPeso() {
		double peso15 = (peso * 15) / 100, peso20 = (peso * 20) / 100;
		double novoPeso = 0;

		if (pergunta == 1) {
			System.out.println("Quanto você emagreceu? ");
			pesoEmagrecido = teclado.nextInt();
			if (pesoEmagrecido > peso20) {
				novoPeso = peso - pesoEmagrecido;
				this.mensagem = "Peso atual : " + novoPeso;
			}
		} else if (pergunta == 2) {
			System.out.println("Quanto você engordou? ");
			pesoEngordado = teclado.nextInt();
			if (pesoEngordado > peso15) {
				novoPeso = peso + pesoEngordado;
				this.mensagem = "Peso atual : " + novoPeso;
			}
		}
		return mensagem;
	}

	public String getNovoPeso() {
		return calcularPeso();
	}
}