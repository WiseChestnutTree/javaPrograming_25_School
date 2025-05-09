package real;

public class Employee {
	protected String name;
	protected int age;
	protected String address;
	protected String workFor;
	
	Employee(){
		name = "alpha";
		age = 20;
		address = "none";
		workFor = "coding";
	}
	Employee(String n, int a, String ad, String wf){
		name = n;
		age = a;
		address = ad;
		workFor = wf;
	}
}
