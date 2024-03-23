/*

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão 
lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e 
quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a 
palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

*/

import java.util.Scanner;

public class Exercicio019 {

	public static void main(String[] args) {
		int n, x, in=0, out=0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores deseja digitar? ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Digte o " + i + "º valor: ");
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println("-------------------\n" + in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
