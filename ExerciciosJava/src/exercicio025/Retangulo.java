package exercicio025;

public class Retangulo {
	double largura;
	double altura;
	
	public double area(double base, double altura) {
		this.largura = base;
		this.altura = altura;
		
		return base * altura;
	}
	
	public double perimetro(double base, double altura) {
		this.largura = base;
		this.altura = altura;
		
		return 2 * (base + altura);
	}
	
	public double diagonal(double base, double altura) {
		largura = base;
		this.altura = altura;
		double diagonal;
		
		diagonal = Math.sqrt(base*base + altura*altura);
		
		return diagonal;
		
	}
	
}