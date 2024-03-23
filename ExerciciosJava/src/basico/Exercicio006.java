/*
  
Fazer um programa que leia três valores com ponto flutuante
de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.  
  
*/
package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		double a, b, c, aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo, pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1º valor (a): ");
		a = sc.nextDouble();
		System.out.print("Digite o 2º valor (b): ");
		b = sc.nextDouble();
		System.out.print("Digite o 3º valor (c): ");
		c = sc.nextDouble();

		aTriangulo = a * c / 2; //b*h/2
		aCirculo = pi * Math.pow(c, 2); //π * raio²
		aTrapezio = (a + b) * c / 2; //(B+b)*h/2
		aQuadrado = b * b; //L²
		aRetangulo = a * b; //b*h

		System.out.printf("TRIÂNGULO: %.3f%n", aTriangulo);
		System.out.printf("CÍRCULO: %.3f%n", aCirculo);
		System.out.printf("TRAPÉZIO: %.3f%n", aTrapezio);
		System.out.printf("QUADRADO: %.3f%n", aQuadrado);
		System.out.printf("RETÂNGULO: %.3f%n", aRetangulo);

		sc.close();
	}

}