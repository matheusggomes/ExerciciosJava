package exercicio026;

public class Funcionario {
	String nome;
	double salarioBruto, imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		//salarioBruto = salarioBruto + salarioBruto * porcentagem / 100;
		salarioBruto += salarioBruto * porcentagem / 100;
	}
	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", salarioLiquido());
	}
	
}