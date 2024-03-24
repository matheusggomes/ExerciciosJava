/*

Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto abaixo.

-----------------
	Rectangle
-----------------
- Width: double
- Height double
-----------------
+ Area(): double
+ Perimeter(): double
+ Diagonal(): double
-----------------

*/

package exercicio025;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do Retângulo: ");
		double largura = sc.nextDouble();
		System.out.print("Digite a altura do Retângulo: ");
		double altura = sc.nextDouble();
		
		double area = r1.area(largura, altura);
		double perimetro = r1.perimetro(largura, altura);
		double diagonal = r1.diagonal(largura, altura);
		
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Perímetro = %.2f%n", perimetro);
		System.out.printf("Diagonal = %.2f%n", diagonal);
		
		sc.close();

	}

}