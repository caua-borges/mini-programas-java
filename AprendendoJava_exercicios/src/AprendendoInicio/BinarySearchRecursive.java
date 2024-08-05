package AprendendoInicio;

public class BinarySearchRecursive {
	int binarySearchRecursive(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - 1) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearchRecursive(arr, l, mid - 1, x);

			return binarySearchRecursive(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static void main(String args[]) {
		BinarySearchRecursive ob = new BinarySearchRecursive();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 40;
		int result = ob.binarySearchRecursive(arr, 0, n - 1, x);
		if (result == -1) {
			System.out.println("Elemento não está presente no array");
		} else {
			System.out.println("Elemento está presente no indice " + result);
		}
	}
}
