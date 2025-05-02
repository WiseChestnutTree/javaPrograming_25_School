package ex1;

public class Circle {
	private double r;
	private double[] xy= new double[2];
	
	Circle() {
		r =3;
		xy[0] = 0;
		xy[1] = 0;
	}
	
	double area() {
		return r*r*Math.PI;
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double[] getXy() {
		return xy;
	}

	public void setXy(double[] xy) {
		this.xy = xy;
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println(c.area());
	}
}
