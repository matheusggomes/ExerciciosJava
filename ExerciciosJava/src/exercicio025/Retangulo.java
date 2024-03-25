package exercicio025;

public class Retangulo {
	double largura;
	double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {		
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt(largura*largura + altura*altura);
		
		return diagonal;	
	}	
}