/*
 
Ler um número inteiro N e calcular todos os seus divisores.

*/
package basico;

import java.util.Scanner;

public class Exercicio023 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}