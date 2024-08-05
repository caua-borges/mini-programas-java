package Mercadinho;

import java.util.Scanner;

public class Mercadinho_p {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		MercadEncap backend = new MercadEncap();
		int qtdProduto = 0;
		System.out.println("Info. Quantidade de produtos: ");
		qtdProduto = teclado.nextInt();
		backend.getProduto(qtdProduto);
		backend.MostrarVlrFinal();
	}
}