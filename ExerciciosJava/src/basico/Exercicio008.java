/*
  
 Fazer um programa para ler um número inteiro e
 dizer se este número é par ou ímpar. 
  
 */
package basico;

import java.util.Scanner;

public class Exercicio008 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
	}

}