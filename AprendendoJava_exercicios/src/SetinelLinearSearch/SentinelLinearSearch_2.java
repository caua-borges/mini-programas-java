package SetinelLinearSearch;

import java.util.Arrays;

public class SentinelLinearSearch_2 {
	public static int sentinelLinearSearch(int[] array, int key) {
		int last = array[array.length - 1];
		array[array.length - 1] = key;
		int i = 0;

		while (array[i] != key) {
			i++;
		}
		array[array.length - 1] = last;
		if (i < array.length - 1 || last == key) {
			return i;
		} else {
			return -1;
		}
	}

	public static void main(String args[]) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 5;
		int index = sentinelLinearSearch(array, key);
		if (index == -1) {
			System.out.println(key + " Não foi encontrado no array " + Arrays.toString(array));
		} else {
			System.out.println(key + " Foi encontrado no indice " + index + " no array " + Arrays.toString(array));
		}
	}
}
