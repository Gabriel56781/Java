package numeros_intervalos_10_20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont,num1,num2;
		num1=0;
		num2=0;
		Scanner sc= new Scanner(System.in);
	// entrada de quantos numeros serão digitados
		System.out.println("Digite quantos números serão digitados");
		
		int n=sc.nextInt();
		
		for(int x=0;x<n;x++) {
		
		 
		cont=sc.nextInt();
		
		if(cont>=10 && cont<=20) {
			
			num1+=1;
			
			
			
		}else {
			
			
			num2+=1;
		}
			
		
		
	
		}
		
		System.out.println("in"+num1);
		System.out.println("out"+num2);
	}


		

}
