/*
 
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
um valor por linha, inclusive o X, se for o caso. 

*/
package basico;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número entre 1 e 1000: ");
		x = sc.nextInt();
		
		for (int i = 1; i<=x; i+=2) {
			System.out.println(i);
		}
		
		sc.close();
	}

}