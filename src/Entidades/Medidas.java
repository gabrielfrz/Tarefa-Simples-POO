package Entidades;

public class Medidas {
	public double altura, largura;
	
	public Medidas(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return 2 * (altura + largura);
	}
	
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
}
