package entities;

public class formas {

	private double A;
	private double B;
	private double C;

	
	public formas() {
		
	}
	
	public formas(double a, double b, double c) {
		super();
		A = a;
		B = b;
		C = c;
	}

	
	public double getA() {
		return A;
	}


	public void setA(double a) {
		A = a;
	}


	public double getB() {
		return B;
	}


	public void setB(double b) {
		B = b;
	}


	public double getC() {
		return C;
	}


	public void setC(double c) {
		C = c;
	}


	public double tri() {

		return this.A * this.C / 2;
	}

	public double circ() {

		return 3.14 * this.C * this.C;

	}

	public double at1() {

		return (this.C * (this.A + this.B)) / 2;

	}

	public double aq() {

		return (this.C * (this.A + this.B)) / 2;

	}

	public double ar() {

		return this.A * this.B;
	}
}
