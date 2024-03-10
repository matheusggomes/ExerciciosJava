/*
  
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando
se os valores lidos são múltiplos entre si. Atenção: os números
devem poder ser digitados em ordem crescente ou decrescente.
  
*/

import java.util.Scanner;

public class Exercicio009 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1º valor(a): ");
		a = sc.nextInt();
		System.out.print("Digite o 2º valor(b): ");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Múltiplos");
		}else {
			System.out.println("Não São Múltiplos");
		}
		
		sc.close();
	}

}