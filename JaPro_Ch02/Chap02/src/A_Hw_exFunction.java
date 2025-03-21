
public class A_Hw_exFunction {

	public static void main(String[] args) {
//		1~10 합 계산
//		A: 두수의 하볘를 반복하여 처리 => 변수 = 합계 저장 , 제어변수
//		 + 반보을 하여 진행해야 함
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
//		자바 시험 성적이 85면, 산정된 등급은 무엇인가
//		A: 변수 -> 자바 시험 성적 , 등급
		int score = 85;
//		
		if(95 <= score && score <= 100) {
			System.out.println("JAVA 등급 : A+");
		}else if (90 <=score && score<95) {
			System.out.println("JAVA 등급 : A");
		}else if (85 <= score && score < 90) {
			System.out.println("JAVA 등급 : B+");
		}
		
//		은행 계좌 정보를 이름, 연락처, 잔고로 정하고 각각을 출력하시오
//		A: 변수 -> 이름 연락처 잔고
		String name = "빵빵";
		String phonNumber = "010.xxxx.xxxx";
		
		System.out.println("이름 : "+name+" / 전화번호 : "+phonNumber);
		
//		아이스크림의 일별, 주별 월별 판매량을 계산하시오
//		A: 일별 데이터는 매일이니 저장은 해야함
//			+ 일별 데이터만 있다면 연산을 통해 주, 월별 판매량을 계산할 수 잇다.
//			+ 따라서 변수 생성에 고려해야할 부분이 있음.

//		회사의 주가가 현재가, 52주 평균, 상한가, 하한가를 각각 출력하시오
//		A: 현재가, 일별 중가 가격 (이를 가지고 있으면 상한가, 하한가 계산 가능)
//		내생각엔 일별 상*하한, 현재는 저장해놓는 것이 좋다 생각하는데.. 흠..
		
//		감상문을 출력
//		A: text 만 저장하면 됨 -> 문자열 데이터를 변수로 가져야 함.
	}

}
