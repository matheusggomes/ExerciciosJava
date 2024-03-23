/*
 
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

*/
package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio020 {

	public static void main(String[] args) {
		int n;
		double valor1, valor2, valor3, mediaPonderada; 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos casos de teste deseja digitar? ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print(i+1 + "º caso: ");
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			mediaPonderada = (valor1*2 + valor2*3 + valor3*5) / (2 + 3 + 5);
			System.out.printf("%.1f%n", mediaPonderada);
		}
		sc.close();

	}

}