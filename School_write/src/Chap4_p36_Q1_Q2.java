
import java.util.*;

public class Chap4_p36_Q1_Q2 {
	Scanner s1 = new Scanner(System.in);
	
	void ex1() {
		System.out.println("이름 입력: ");
		String name = s1.next();
		System.out.println("학과 입력: ");
		String school = s1.next();
		System.out.println("학년 입력: ");
		String grade = s1.next();
		System.out.println("이름: "+name+"학과: "+school+"학년: "+grade);
		
	}
	void ex1_for() {
		String[] s = {"이름", "학과", "학년"};
		String[] a = new String[3];
		for (int i =0; i<3; i++) {
			System.out.print(s[i]+" 입력-> ");
			a[i] = s1.next();			
		}
		System.out.println();
		System.out.println(s[0]+": "+a[0]);
		System.out.println(s[1]+": "+a[1]);
		System.out.println(s[2]+": "+a[2]);
	}
	void ex1_switch() {
		String[] s = {"이름", "학과", "학년"};
		String[] a = new String[3];
		
		for (int i =0; i<3; i++) {
			switch(i) {
				case 0:
					System.out.print(s[i]+" 입력-> ");
					a[i] = s1.next();
				case 1:
					System.out.print(s[i]+" 입력-> ");
					a[i] = s1.next();
				case 2:
					System.out.print(s[i]+" 입력-> ");
					a[i] = s1.next();
			}
		}
		System.out.println();
		System.out.println(s[0]+": "+a[0]);
		System.out.println(s[1]+": "+a[1]);
		System.out.println(s[2]+": "+a[2]);
//		https://github.com/WiseChestnutTree/javaPrograming_25_School.git
	}
	
	
	void ex2() {
		Chap4_p36_Q1_Q2 ex = new Chap4_p36_Q1_Q2();
		
		System.out.println("영어 성적 입력: ");
		int engS = s1.nextInt();
		System.out.println("수학 성적 입력: ");
		int mathS = s1.nextInt();
		System.out.println("국어 성적 입력: ");
		int korS = s1.nextInt();
		
		double answer = ex.ex2_1(engS, mathS, korS);
		System.out.println("성적의 평균: "+ answer);
	}
	double ex2_1(int e, int m, int k) {
		double sum = e+m+k;
		double average = sum/3;
		double ani = sum%3;
		System.out.println(average);
		System.out.println(ani);
		return average;
	}
	
	public static void main(String[] args) {
		Chap4_p36_Q1_Q2 ex = new Chap4_p36_Q1_Q2();
		ex.ex1_for();
		ex.ex1_switch();
		
		System.out.println();
		ex.ex2();
		
	}
	
	
}
