import java.util.*;


public class Chap5z_p23_Q1Q2 {
	public int salaryFwork = 0;
	
	double salary(double money) {
		double sM = money*12 + money*5;
		
		return sM;		
	}
	void calcMain(Scanner scan) {
		double money = 0;
		System.out.println("월급을 입력하시오");
		
		money = scan.nextInt();
		double ySalary = salary(money);
		System.out.println(ySalary);
	}
	
	double sum(double a, double b) {
		double d = a + b;
		return d;
	}
	double minus(double a, double b) {
		double d = a-b;
		
		return d;
	}
	double multi(double a, double b) {
		double d = a*b;
		
		return d;
	}
	double devide(double a, double b) {
		double d = a/b;
		
		return d;
	}
	double remain(double a, double b) {
		double d = a%b;
		
		return d;
	}
	double salary2(double money) {
		Chap5z_p23_Q1Q2 c = new Chap5z_p23_Q1Q2();
		double multY = c.multi(money, 12.0);
		double multB = c.multi(money, 5.0);
		double sumFsalary = c.sum(multY, multB);
		
		return sumFsalary;		
	}
	void calcMain2(Scanner scan) {
		Chap5z_p23_Q1Q2 c = new Chap5z_p23_Q1Q2();
		double money = 0;
		System.out.println("월급을 입력하시오 (만원 단위)");
		
		money = scan.nextInt();
		System.out.println("구조조정으로 인해 월급이 20% 삭감되었습니다.");
		double div = c.devide(money, 20);
		money = c.minus(money, div);
		System.out.println("삭감된 월급 : "+money+"만원입니다.");
		
		System.out.println("삭감된 연봉 : "+c.salary2(money));
	}
	
	
	public static void main(String args) {
		Chap5z_p23_Q1Q2 c = new Chap5z_p23_Q1Q2();
		Scanner scan = new Scanner(System.in);
//		Q1
		c.calcMain(scan);
		System.out.println();
		
//		Q2
		c.calcMain2(scan);
		
	}
	
}
