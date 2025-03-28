package chap3;
import java.util.*;

public class School_ex_01 {
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
	void ex2() {
		School_ex_01 ex = new School_ex_01();
		
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
		School_ex_01 ex = new School_ex_01();
		ex.ex1();
		
		System.out.println();
		ex.ex2();
		
	}
	
	
}
