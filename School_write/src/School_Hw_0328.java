
import java.util.*;
import java.text.SimpleDateFormat;


public class School_Hw_0328 {
//	Scanner scan = new Scanner(System.in);
//	----------------------------조건문----------------------------
	void S_Length_Judgement(Scanner scan) {
		// 입력 받은 문자의 길이가 5보다 큰지 작은지 판단 (장문, 단문)
		String str = "";
		
		System.out.println("문장의 길이 측정: 문장을 입력해주세요.");
		str = scan.nextLine();
		System.out.println();
		
		System.out.println("입력 받은 문장: "+str+'\n'+"입력 받은 문장의 길이: "+str.length());
		if (str.length() >= 5) {
			System.out.println("해당 문장은 장문 입니다.");
		}else {
			System.out.println("해당 문장은 단문 입니다.");
		}
	}
	
	void Adult_Judgement(Scanner scan) {
		// 생년월일을 입력받아 오늘을 기준으로 18세 이상 유무 판단 (성년, 미성년)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar c = Calendar.getInstance();
		String Today = sdf.format(c.getTime());
		String barth = "";
		String[] year = new String[] {"",""};
		String[] month = new String[] {"",""};
		String[] date = new String[] {"",""};
		int barth2 = 0;
		
		while(true) { // 형식과 일치 할 때까지 반복
			System.out.println("태어난 생년월일을 입력해주세요! (ex: yyyyMMdd)");
			barth = scan.next();
			
			try {
				barth2 = Integer.valueOf(barth);
			} catch (NumberFormatException e) {
				barth2 = 0;
			}
			
			if(barth2 != 0 && barth.length()==8) {
				break;
			}else {
				System.out.println("입력 형식이 잘못되었습니다.");
			}
			System.out.println();
		}
		
		for(int i=0; i<8; i++) {
			if(i<4) {
				year[0] += barth.charAt(i);
				year[1] += Today.charAt(i);
			}else if(i>=4 && i<6) {
				month[0] += barth.charAt(i);
				month[1] += Today.charAt(i);
			}else {
				date[0] += barth.charAt(i);
				date[1] += Today.charAt(i);
			}
		}
		if (Integer.valueOf(year[1])-Integer.valueOf(year[0]) > 18) {
			System.out.println("성년");
		}else if (Integer.valueOf(year[1])-Integer.valueOf(year[0]) == 18) {
			if (Integer.valueOf(month[1]+date[1]) >= Integer.valueOf(month[0]+date[0])) {
				System.out.println("성년");
			}else {
				System.out.println("미성년");
			}
		}else {
			System.out.println("미성년");
		}
	}
	
	
//	----------------------------분기문----------------------------
	void Sum_Num(Scanner scan) {
		// 숫자 하나 입력 받기 -> 1~해당 숫자 의 합 연산 후 출력
		// 합계가 1000을 넘을 경우 계산 중단 후 결과 출력 (합이 1000이 넘는 순간 roop 탈출)
		int sum = 0;
		int num = 0;
		
		System.out.println("입력한 숫자까지의 합을 구하려 합니다.");
		System.out.print("숫자를 입력하시오 : ");
		num = scan.nextInt();
		
		int i = 1;
		while(i <= num) { // 45 max
			sum += i;
			if (sum > 1000) {
				break;
			}
			i++;
		}
		System.out.println("1 ~ "+num+" 의 합은 "+sum+"입니다.");
	}
	
	void Check_Date(Scanner scan) {
		// 년, 월, 일을 입력 받기 -> 1900.01.01 부터 몇 번째 날인지 계산 후 출력
		// 고려 사항 -> 윤년 365 / 366
		int[] ymd = new int[] {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
		int dummi = 0;
		int sum = 0;
		String year = "";
		String month = "";
		String day = "";
		String date = " "; // 입력 저장 위치
		
		while(true) { 
			System.out.println("1900. 01. 01 ~ 계산을 원하는 날짜를 입력하시오 (ex: yyyyMMdd)");
			date = scan.next();
			
			try {
				dummi = Integer.valueOf(date);
			} catch (NumberFormatException e) {
				dummi = 0;
			}
			
			if(dummi != 0 && date.length()==8) {
				break;
			}else {
				System.out.println("입력 형식이 잘못되었습니다.");
			}
			System.out.println();
		}

		for(int i=0; i<8; i++) {
			if(i<4) {
				year += date.charAt(i);
			}else if(i>=4 && i<6) {
				month += date.charAt(i);
			}else {
				day += date.charAt(i);
			}
		}
		
		int y = Integer.valueOf(year) -1900;
		int m = Integer.valueOf(month) -1;
		int d = Integer.valueOf(day) -1;
		
		if(y == 0) { // 입력 값이 1900인지 판단
			sum = ymd[m];
			sum += d;
		} else {
			int i1 = y/4;
			int i2 = y%4;
			if (y != 4 && i2 != 0 && m+1 <= 2 ) {
				d -= 1;
			}
			sum = y*365;
			sum += ymd[m];
			sum += d;			
			sum += i1;
		}
		System.out.println("1900. 01. 01 부터 "+sum+"일 지났습니다.");
	}
	
	
	public static void main(String[] args) {
		School_Hw_0328 sw = new School_Hw_0328();
		Scanner scan = new Scanner(System.in);
		
		sw.S_Length_Judgement(scan);
		
		System.out.println();
		sw.Adult_Judgement(scan);
		
		System.out.println();
		sw.Sum_Num(scan);

		System.out.println();
		sw.Check_Date(scan);
		
		
		
		scan.close();
		
		
	}
}
