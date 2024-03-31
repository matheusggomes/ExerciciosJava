package exercicio027;

public class Aluno {
	String nome;
	double nota1, nota2, nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String verificarAprovacao() {
		if (notaFinal() >= 60.0) {
			return "Aprovado";
		} else {
			return "Reprovado \nFaltou " 
					+ String.format("%.2f", verificarPontos())
					+ " Pontos";
		}
	}
	
	public double verificarPontos() {
		return 60.0 - notaFinal();
	}
	
	public String toString() {
		return "Nota Final = " + String.format("%.2f", notaFinal())
				+ "\n" + verificarAprovacao();		
	}
}
