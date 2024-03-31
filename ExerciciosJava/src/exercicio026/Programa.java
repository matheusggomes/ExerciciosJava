/*

Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido).
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
(somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados 
do funcionário. Use a classe projetada abaixo. 

--------------------------------------
				Employee
--------------------------------------
- Name : string
- GrossSalary : double
- Tax : double
--------------------------------------
+ NetSalary() : double
+ IncreaseSalary(percentage : double) : void
--------------------------------------

*/
package exercicio026;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario1.nome = sc.nextLine();
		System.out.print("Salário Bruto: R$ ");
		funcionario1.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: R$ ");
		funcionario1.imposto = sc.nextDouble();
		
		System.out.println("\nFuncionário: " + funcionario1); //ou funcionario1.toString()
		
		System.out.print("\nQual percentual para aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		funcionario1.aumentarSalario(porcentagem);
		
		System.out.println("\nDados atualizados: " + funcionario1.toString()); //ou funcionario1

		sc.close();
		
	}

}