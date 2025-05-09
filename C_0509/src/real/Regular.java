package real;

public class Regular extends Employee{
	private int salary = 0;
	
	Regular(){
		super();
	}
	Regular(String n, int a, String ad, String wf){
		super(n, a, ad, wf);
	}
	
	void showSalary() {
		System.out.println("now Salary : "+ salary);
	}
	void setSalary(int i) {
		salary = i;
		System.out.println("after Set salary : "+ salary);
	}
	void printInfo() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("address: "+address);
		System.out.println("workFor: "+workFor);
	}
}
