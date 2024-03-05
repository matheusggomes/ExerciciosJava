/*

Faça um programa para ler dois valores inteiros,
e depois mostrar na tela a soma desses números
com uma mensagem explicativa.

*/

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		int valor1, valor2, soma;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o 1º valor: ");
		valor1 = sc.nextInt();
		System.out.print("Digite o 2º valor: ");
		valor2 = sc.nextInt();

		soma = valor1 + valor2;

		System.out.println("SOMA = " + soma);

		sc.close();
	}

}