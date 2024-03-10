/*
 
Com base na tabela abaixo, escreva um programa que leia o código
de um item e a quantidade deste item. A seguir, calcule e mostre
o valor da conta a pagar.

CODIGO		ESPECIFICAÇÃO		PREÇO
1			Cachorro Quente		R$ 4.00
2			X-Salada			R$ 4.50
3			X-Bacon				R$ 5.00
4			Torrada simples		R$ 2.00
5			Refrigerante		R$ 1.50

*/

import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {
		int codigo, quant;
		double preco, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do produto: ");
		codigo = sc.nextInt();
		System.out.print("Digite a quantidade adquirida: ");
		quant = sc.nextInt();
		
		switch (codigo) {
			case 1:
				preco = 4.00;
				break;
			case 2:
				preco = 4.50;
				break;
			case 3:
				preco = 5.00;
				break;
			case 4:
				preco = 2.00;
				break;
			case 5:
				preco = 1.50;
				break;
			default:
				preco = -1.0;
		}
		
		if (preco == -1.0) {
			System.out.println("[ERRO] Digite um código válido!");
		}else {
			total = preco * quant;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();		
	}

}