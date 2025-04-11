import java.util.*;
public class Chap6_String {
//	공백을 기준으로 단어를 따로 뽑아내고 싶다면 SPLIT() 사용
	
	void test() {
		String name = "this is test paragraph";
		System.out.println("빈칸 포함 length: "+name.length());
		
		String[] s1 = name.split(" ");
		System.out.println("단어 개수: "+s1.length);
		
		for (int i = 0; i<s1.length; i++) {
			System.out.println(s1[i]);
		}
		
//		입력한 값이 문장의 단어와 같은 경우 해당 안어 출력
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		
		for (int i=0; i<s1.length; i++) {
			if (s1[i].equals(s2)) {
				System.out.println(s1[i]);
				break;
			}
		}
		sc.close();
		

		String v1 = "100";
		String v2 = "200";
		System.out.println("result: "+v1+v2);
		System.out.println("numResult: "+(Integer.parseInt(v1)+Integer.parseInt(v2)));
	}

	
	void Chap5_P14_Q1() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력: ");
		String str = sc.nextLine();
		int strL = str.length();
		sc.close();
		
//		소문자 변환 출력
		System.out.println(str.toLowerCase());
		
		for(int i=0; i<strL; i++) {
			if (str.charAt(i)==' ') {
				count++;
				System.out.println("공백 1중가");
			}
		}
//		공배 수 출력
		System.out.println("공백 수: "+count);
		
//		A1 - 사진
//		String str2 = str.toLowerCase().replace(" ", "");
//		int[] chC = new int[str2.length()];
//		
//		for(int i=0; i<chC)
			
		
//		A2 - 사진
		
		
	}
	
	public static void main(String[] args) {
		Chap6_String cs = new Chap6_String();
		
		cs.test();
		cs.Chap5_P14_Q1();
		
		
	}
}















