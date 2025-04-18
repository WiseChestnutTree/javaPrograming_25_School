package week7;

public class Bankacc {
	String name, accNum, phoneNum;
	int money;
	
	Bankacc() {
		name = "James";
		accNum = "01-xxxxxx-oooooo";
		money = 0;
		phoneNum = "010)xxxx-oooo";
	}
	Bankacc(String n) {
		name = "James";
		accNum = "01-xxxxxx-oooooo";
		money = 0;
		phoneNum = "010)xxxx-oooo";
	}
	Bankacc(String n, String an) {
		name = "James";
		accNum = "01-xxxxxx-oooooo";
		money = 0;
		phoneNum = "010)xxxx-oooo";
	}
	Bankacc(String n, String an, int m) {
//		name = "James";
//		accNum = "01-xxxxxx-oooooo";
//		money = 0;
//		phoneNum = "010)xxxx-oooo";
		this(n,an,m,"010)xxxx-oooo");
	}
	Bankacc(String n, String an, int m, String pn) {
		name = "James";
		accNum = "01-xxxxxx-oooooo";
		money = 0;
		phoneNum = "010)xxxx-oooo";
		 
	}
	
	
	void accIn() { // 입금
		
	}
	void accOut() { // 출금
		
	}
	void bMoney() { // 대출
		
	}

}
