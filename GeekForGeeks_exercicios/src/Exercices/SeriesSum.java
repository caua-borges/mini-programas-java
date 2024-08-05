package Exercices;

public class SeriesSum {

	protected static long seriesSum(int n) {
		int[] array = new int[n + 1];
		long sum = 0;

		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = i;
			sum += array[i];
		}
		return sum;
	}

}
