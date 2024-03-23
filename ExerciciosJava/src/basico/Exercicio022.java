/*

Ler um valor N. Calcular e escrever seu respectivo fatorial. 
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.

*/
package basico;

import java.util.Scanner;

public class Exercicio022 {

	public static void main(String[] args) {
		int n, fatorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("-----Fatorial-----\nDigite um número inteiro: ");
		n = sc.nextInt();
		
		if (n >= 0) {
			for (int i=n; i>0; i--) {
				fatorial = fatorial * i;
			}
			System.out.println(n + "! = " + fatorial);
		} else {
			System.out.println("Digite um número positivo");
		}
		
		sc.close();

	}

}