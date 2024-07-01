/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
*/

package exercicio028;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double cotacaoDolar, valorDolar;
		
		System.out.print("Digite a cotação do dólar: $ ");
		cotacaoDolar = sc.nextDouble();
		
		System.out.print("Quantos Dólares deseja comprar? $");
		valorDolar = sc.nextDouble();
		
		System.out.printf("Total a pagar: R$ %.2f%n", ConverterMoeda.converter(cotacaoDolar, valorDolar));
		
		sc.close();

	}

}
