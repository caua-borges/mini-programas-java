package CalculadoraDePeso;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		Peso_encapsulamento backend = new Peso_encapsulamento();
		double peso = 0, pesoEngordado = 0, pesoEmagrecido = 0;
		int pergunta = 0;
		
		System.out.println("Qual o seu peso : ");
		peso = teclado.nextInt();
		System.out.println("Você engordou ou emagreceu? Digite 1 se emagreceu, digite 2 se engordou :");
		pergunta = teclado.nextInt();
		backend.setPeso(peso, pergunta);
		backend.getNovoPeso();
		System.out.println(backend.mensagem);
	}
}
