package Exercicios_java;

import java.util.Scanner;

public class Exercicio_16 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double popa, popb = 0;
		int ano = 0;

		System.out.println("Popula��o do pa�s A: ");
		popa = teclado.nextDouble();

		System.out.println("Popula��o pa�s B: ");
		popb = teclado.nextDouble();
		
		teclado.close();

		while (popa <= popb) {
			popa = popa + (popa * 3) / 100;
			popb = popb + (popb * 1.5) / 100;
			ano++;
		}
		System.out.println(ano + " ANOS");

	}

}
