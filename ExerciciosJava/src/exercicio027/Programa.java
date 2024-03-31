/*
 
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos 
três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 
cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno 
está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar 
uma classe Student para resolver este problema. 
 
*/

package exercicio027;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.print("Nome: ");
		aluno1.nome = sc.nextLine();
		System.out.print("1ª Nota: ");
		aluno1.nota1 = sc.nextDouble();
		System.out.print("2ª Nota: ");
		aluno1.nota2 = sc.nextDouble();
		System.out.print("3ª Nota: ");
		aluno1.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(aluno1);
		
		sc.close();

	}

}
