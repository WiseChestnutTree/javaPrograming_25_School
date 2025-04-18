package week7;

public class Student {
	String name;
	String grade;
	String DeptName;
	String PhoneNum;
	
	Student(){
		name = "William";
		grade = "1";
		DeptName = "telecom";
		PhoneNum = "010)xxxxx - xxxxx";
		checkName();
	}
	Student(String n){
		this.name = n;
		grade = "1";
		DeptName = "telecom";
		PhoneNum = "010)xxxxx - xxxxx";
		checkName();
	}
	Student(String n, String g){
		this.name = n;
		this.grade = g;
		DeptName = "telecom";
		PhoneNum = "010)xxxxx - xxxxx";
		// this(n, g, "telecom", "010)xxxxx - xxxxx") 
		checkName();
	}
	
	void checkRegister() {
		
	}
	void checkGrade() {
		
	}
	void checkName() {
		System.out.println(name);
	}

}
