package Mercadinho;

import java.util.ArrayList;
import java.util.Scanner;

public class MercadEncap {
	Scanner teclado = new Scanner(System.in);
	private ArrayList<String> nomeP = new ArrayList<String>();
	private ArrayList<Integer> qtdProduto = new ArrayList<Integer>();
	private ArrayList<Integer> precoUnit = new ArrayList<Integer>();
	private int qtdProdutos = 0;
	double totalAPagar = 0;

	public void getProduto(int qtdP) {
		this.qtdProdutos = qtdP;
	}

	private void pegarNome() {
		for (int i = 0; i < qtdProdutos; i++) {
			System.out.println("Info. nome do produto: ");
			nomeP.add(teclado.next());
			System.out.println("Info. quantidade do produto: ");
			qtdProduto.add(teclado.nextInt());
			System.out.println("Info. preço da unidade do produto: ");
			precoUnit.add(teclado.nextInt());
		}
	}

	private void calcularTotal() {
		for (int i = 0; i < nomeP.size(); i++) {
			int precoBruto = qtdProduto.get(i) * precoUnit.get(i);
			double precoFinal = precoBruto;
			if (qtdProduto.get(i) <= 5) {
				precoFinal -= (precoBruto * 0.02);
			} else if (qtdProduto.get(i) > 5 && qtdProduto.get(i) <= 10) {
				precoFinal -= (precoBruto * 0.03);
			} else if (qtdProduto.get(i) > 10) {
				precoFinal -= (precoBruto * 0.05);
			}

			totalAPagar += precoFinal;
			System.out.println(nomeP.get(i) + " R$ " + precoFinal);
		}
		System.out.println("Total a pagar: R$ " + totalAPagar);
	}

	public double MostrarVlrFinal() {
		pegarNome();
		calcularTotal();
		return totalAPagar;
	}
}
