/*

Fazer um programa que leia o número de um funcionário,
seu número de horas trabalhadas, o valor que recebe
por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário,
com duas casas decimais.

*/
package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		int numFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Número do funcionário: ");
		numFuncionario = sc.nextInt();
		System.out.print("Número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Valor que recebe por hora: R$");
		valorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorHora;

		System.out.println("Número do Funcionário = " + numFuncionario);
		System.out.printf("Salário = R$ %.2f%n", salario);

		sc.close();
	}

}