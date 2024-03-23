/*
 
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a 
divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a 
mensagem "divisao impossivel". 
 
*/
package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio021 {

	public static void main(String[] args) {
		int n;
		double a, b, divisao;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pares deseja digitar? ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.print(i+1 + "º par (digite dois números separados por espaço): ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (b==0) {
				System.out.println("Divisão Impossível");
			} else {
				divisao = a/b;
				System.out.printf("%.1f\n", divisao);
			}
		}
		
		sc.close();

	}

}