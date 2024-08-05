package JoaoSalario;

import java.util.Scanner;

public class principal {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		joaoSalario_encapsulamento backend = new joaoSalario_encapsulamento();
		System.out.println(backend.getSalario());
	}
}
