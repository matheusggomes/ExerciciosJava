/*

Fazer um programa para ler quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto de A e B
pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).

*/
package basico;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		int a, b, c, d, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1º valor: ");
		a = sc.nextInt();
		System.out.print("Digite o 2º valor: ");
		b = sc.nextInt();
		System.out.print("Digite o 3º valor: ");
		c = sc.nextInt();
		System.out.print("Digite o 4º valor: ");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();
	}

}