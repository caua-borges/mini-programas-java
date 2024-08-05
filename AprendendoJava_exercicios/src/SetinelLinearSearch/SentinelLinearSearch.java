package SetinelLinearSearch;

public class SentinelLinearSearch {
	static void sentinelSearch(int arr[], int n, int key) {
		int last = arr[n - 1];

		arr[n - 1] = key;
		int i = 0;

		while (arr[i] != key)
			i++;

		arr[n - 1] = last;

		if ((i < n - 1) || (arr[n - 1] == key)) {
			System.out.println(key + " está no indice " + i);
		} else {
			System.out.println("Elemento não encontrado");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 180, 30, 60, 50, 110, 100, 70 };
		int n = arr.length;
		int key = 10;

		sentinelSearch(arr, n, key);
	}
}