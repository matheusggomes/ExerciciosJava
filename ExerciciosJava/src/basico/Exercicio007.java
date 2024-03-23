/*
  
 Fazer um programa para ler um número inteiro, e
 depois dizer se este número é negativo ou não. 
  
 */
package basico;

import java.util.Scanner;

public class Exercicio007 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();

	}

}
