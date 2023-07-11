package Main;
import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		System.out.println("quantad alturas você deseja inserir ?");
		Scanner sc= new Scanner(System.in);
		
		int qtd=sc.nextInt();
		double[] vect= new double[qtd];

		
		int cont=0;
		int cont2=1;
		int cont3=0;
		double soma=0;
		while(cont<qtd) {
			
			System.out.println("digite a "+cont2+"° altura :");
			vect[cont]=sc.nextDouble();
			cont++;
			cont2++;
		}
	
	while(cont3<qtd) {
			
		
		soma+=vect[cont3];
		cont3++;

		}
	
	
 double media=soma/qtd;
	
	System.out.printf("a média é de  %.2f%n cm de altura", media);
		
		
	}

}
