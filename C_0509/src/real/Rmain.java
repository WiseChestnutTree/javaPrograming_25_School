package real;

public class Rmain {
	public static void main(String[] args) {
		Regular rg = new Regular("김서율", 26, "경기도 군포시", "자율주행 개발팀");
		
		rg.printInfo();
		
		rg.showSalary();
		rg.setSalary(34000000);
		rg.showSalary();
		
		System.out.println();
		System.out.println();
		Regular rg2 = new Regular();
		
		rg2.printInfo();
		
		rg2.showSalary();
		rg2.setSalary(34000000);
		rg2.showSalary();
	}
}
