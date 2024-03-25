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
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo r1 = new Retangulo();
		System.out.print("Digite a largura do Retângulo: ");
		r1.largura = sc.nextDouble();
		System.out.print("Digite a altura do Retângulo: ");
		r1.altura= sc.nextDouble();
				
		System.out.printf("Área = %.2f%n", r1.area());
		System.out.printf("Perímetro = %.2f%n", r1.perimetro());
		System.out.printf("Diagonal = %.2f%n", r1.diagonal());
		
		sc.close();
	}
}