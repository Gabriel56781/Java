
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20;
		int x2 = 10;
		int x3 = 20;
		Integer obj, obj2, obj3;
		/*
		 * Object obj=x; Object obj=x2;
		 * 
		 * Int y=x+x2; //está errado pois precisa-se converter tipo assim:
		 * 
		 * int y= (int)x + (int)x2;
		 */
		obj = x;
		obj2 = x2;
		obj3 = x3;

		int y = obj + obj2;

		System.out.println(y+obj3);
		// no java , temos wrapper classes, que são classes que conversam com seus tipos
		// primitivos , como integer e int;
	}
}
