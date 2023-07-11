package area_das_formas;

import java.util.Scanner;
import entities.formas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, at, at1, ac, aq, ar;

		formas form = new formas();
		
		Scanner sc = new Scanner(System.in);
		// entrada de dados do usuário

		System.out.println("Digite o Valor de A");

		form.setA(sc.nextDouble());

		System.out.println("Digite o Valor de B");

		form.setB(sc.nextDouble());


		System.out.println("Digite o Valor de C");

		form.setC(sc.nextDouble());


		System.out.printf("se fosse um Triangulo sua área seria %.2f%n", form.tri());
		System.out.printf("se fosse um Circulo sua área seria %.2f%n", form.circ());
		System.out.printf("se fosse um Trapézio sua área seria %.2f%n", form.at1());
		System.out.printf("se fosse um Quadrado sua área seria %.2f%n", form.aq());
		System.out.printf("se fosse um Retângulo sua área seria %.2f%n", form.ar());

	}

}
