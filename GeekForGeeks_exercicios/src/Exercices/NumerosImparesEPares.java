package Exercices;

import java.util.ArrayList;

public class NumerosImparesEPares {
	public static ArrayList<Integer> getSum(int n) {
		ArrayList<Integer> lista = new ArrayList<>();

		int soma = 0, quantosNumeros = n, somaImpar = 0;

		for (int i = 0; i <= quantosNumeros; i++) {
			if (i % 2 == 0) {
				soma += i;
			} else if (i % 2 != 0) {
				somaImpar += i;
			}
			lista.add(soma);
			lista.add(somaImpar);
		}
		return lista;
	}
}
