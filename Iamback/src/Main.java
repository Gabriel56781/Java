import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r, a,pi;
//			entrada de dados do usuario
			System.out.println("Digite Aqui o raio do circulo :");
//			inserção de dados no cinema
				Scanner sc= new Scanner(System.in);
//			variáveis 
		pi= 3.14159;
		r = sc.nextInt();
		a=pi*r*r;
//			saida de dados
			System.out.printf( "%n O valor da área do circulo é A=%.3f%n ", a );
		
		
		
	}

}
