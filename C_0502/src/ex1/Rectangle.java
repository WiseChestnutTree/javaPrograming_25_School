package ex1;

public class Rectangle {
//	필드 -> private 
	private double w;
	private double h;
	
//	< 기본적으로 생성자와 Getter, Setter 를 구현해야 함 >
//	생성자 : 어디서 쓰일지를 생각해서 "접근 제한자 설정"
	Rectangle(){
		w=1;
		h=1;
	}
//	매개변수를 받는 생성자와 Setter 는 동일한 작동을 할 수 있다.
	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}
//	위와 동일하지만 생성자는 "처음 만들 때"만들어지는 것이기 때문에 추후 변경사항이 있을 경우 Setter 생성.
	public void setWH(double d1, double d2) {
		this.w = d1;
		this.h = d2;
	}
	public double getW() {
		return w;
	}
	public double getH() {
		return h;
	}
	public double perimeter() {
		return w*h;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r.getW());
		System.out.println(r.getH());
		
		double ar = r.perimeter();
		System.out.println("perimeter: "+ar);
		
		r.setWH(10.3, r.getH());
		System.out.println("perimeter: "+r.perimeter());
		System.out.println(r.getW());
		System.out.println(r.getH());
		
		r.setWH(r.getW(), 10.2);
		System.out.println("perimeter: "+r.perimeter());
		System.out.println(r.getW());
		System.out.println(r.getH());
		
	}

}
