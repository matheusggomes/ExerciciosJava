/*
 
Faça um programa para ler o valor do raio de um círculo, e
depois mostrar o valor da área deste círculo com quatro
casas decimais.

Fórmula da área: area = π . raio²
Considere o valor de π = 3.14159 
  
*/
package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		double raioCirculo, areaCirculo, pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do raio do círculo: ");
		raioCirculo = sc.nextDouble();

		areaCirculo = pi * Math.pow(raioCirculo, 2);

		System.out.printf("A = %.4f%n", areaCirculo);

		sc.close();
	}

}
