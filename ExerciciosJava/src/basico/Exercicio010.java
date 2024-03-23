/*

Leia a hora inicial e a hora final de um jogo. A seguir
calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma
duração mínima de 1 hora e máxima de 24 horas.  

*/
package basico;

import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {
		int horaInicial, horaFinal, duracaoJogo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.print("Digite a hora final: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial;
		} else {
			duracaoJogo = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
		
		sc.close();
	}

}