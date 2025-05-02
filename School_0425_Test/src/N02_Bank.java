//import java.util.*;

public class N02_Bank {
	String Name;
	int balance;
	
	N02_Bank(){
		Name = "홍길동";
		balance = 10000;
	}
	N02_Bank(String n){
		Name = n;
		balance = 10000;
	}
	N02_Bank(String n, int b){
		Name = n;
		balance = b;
	}
	
	void deposit() {
		System.out.println("1 만원이 입금되었습니다.");
		getN_getB();
		System.out.println();
	}
	void deposit(int m) {
		System.out.println(m+" 만원이 입금되었습니다.");
		getN_getB();
		System.out.println();
	}
	
	void getN_getB() {
		System.out.println("고객 "+Name+" 님의 잔고는"+balance+" 입니다.");
	}
}
