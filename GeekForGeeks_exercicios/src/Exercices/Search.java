package Exercices;

import java.util.ArrayList;

public class Search {
	public static int search(int arr[], int n, int x) {
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			if (lista.contains(x)) {
				System.out.println("Ja existe no array");
			} else {
				lista.add(x);
				return x;
			}
		}
		return -1;
	}
}
