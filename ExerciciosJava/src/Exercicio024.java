/*
 
Fazer um programa para ler um número inteiro positivo N. O programa deve então 
mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o 
número da linha, depois o quadrado e o cubo do valor, conforme exemplo. 
 
*/

import java.util.Scanner;

public class Exercicio024 {

	public static void main(String[] args) {
		int n, aux = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
		n = sc.nextInt();
				
		for (int i=1; i<=n; i++) {
			System.out.print(i + " ");
			aux = i * i;
			
			for (int j=1; j<=2; j++) {
				System.out.print(aux + " ");
				aux = i * i * i;
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		//Outro modo
		for (int i=1; i<=n; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			System.out.printf("%d %d %d \n", primeiro, segundo, terceiro);
		}
		
		sc.close();

	}

}