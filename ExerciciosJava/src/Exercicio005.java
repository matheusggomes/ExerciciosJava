/*
  
Fazer um programa para ler o código de uma peça 1,
o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor
unitário de cada peça 2. Calcule e mostre o valor a ser pago.  
  
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		int cod1, cod2, quant1, quant2;
		double preco1, preco2, total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código da Peça: ");
		cod1 = sc.nextInt();
		System.out.print("Digite a quantidade adqurida da Peça " + cod1 + ": ");
		quant1 = sc.nextInt();
		System.out.print("Digite o valor unitário da Peça " + cod1 + ": R$");
		preco1 = sc.nextDouble();

		System.out.print("Digite o código da Peça: ");
		cod2 = sc.nextInt();
		System.out.print("Digite a quantidade adqurida da Peça " + cod2 + ": ");
		quant2 = sc.nextInt();
		System.out.print("Digite o valor unitário da Peça " + cod2 + ": R$");
		preco2 = sc.nextDouble();
		
		total = quant1 * preco1 + quant2 * preco2;
		
		System.out.printf("Valor a Pagar: R$ %.2f%n", total);
		
		sc.close();
	}

}
