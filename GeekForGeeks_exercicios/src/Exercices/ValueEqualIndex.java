package Exercices;

import java.util.ArrayList;

public class ValueEqualIndex {
	ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] == i + 1) {
				lista.add(i + 1);
			}
		}
		return lista;
	}
}