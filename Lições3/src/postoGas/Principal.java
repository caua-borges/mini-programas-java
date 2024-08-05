package postoGas;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		PostoGas_encapsulamento backend = new PostoGas_encapsulamento();
		int litros = 0;
		String tipoCombustivel = "";
		System.out.println("Informe o tipo de combustivel: A - Álcool / G - Gásolina");
		tipoCombustivel = teclado.next();
		System.out.println("Info. Quantidade de litros: ");
		litros = teclado.nextInt();
		backend.setInfo(litros, tipoCombustivel);
		System.out.println(backend.getVlrPago());
	}
}
