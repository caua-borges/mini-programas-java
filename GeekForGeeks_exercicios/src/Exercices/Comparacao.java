package Exercices;

public class Comparacao {
	public static String compareNM(int n, int m) {
		String message = "";
		if (n > m) {
			message = "greater";
		} else if (n < m) {
			message = "lesser";
		} else if (n == m) {
			message = "equal";
		}
		return message;
	}
}
