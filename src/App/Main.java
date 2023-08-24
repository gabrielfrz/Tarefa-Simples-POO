package App;

import java.util.Scanner;
import Entidades.Medidas;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a largura: ");
		double largura = sc.nextDouble();
		System.out.println("Informe a altura: ");
		double altura = sc.nextDouble();
		
		Medidas medida = new Medidas(largura, altura);

		double area = medida.area();
		double perimetro = medida.perimetro();
		double diagonal = medida.diagonal();
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Diagonal: " + diagonal);
		
		sc.close();
	}
}
