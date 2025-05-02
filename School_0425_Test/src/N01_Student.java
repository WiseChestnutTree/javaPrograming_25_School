
public class N01_Student {
	int kuk;
	int eng;
	int math;
	int num;
	int sum;
	double avg;
		
	N01_Student(){
		kuk = 0;
		eng = 0;
		math = 0;
		num = 0;
		System.out.println("학번: "+num+", 총점: "+getTotal()+", 평균: "+getAverage()+", 등급"+getGrade());
	}
	N01_Student(int kuk, int eng, int math, int num){
		this.kuk = kuk;
		this.eng = eng;
		this.math = math;
		this.num = num;
		System.out.println("학번: "+num+", 총점: "+getTotal()+", 평균: "+getAverage()+", 등급"+getGrade());
	}
	
	int getTotal() {
		// 총점 계산
		sum = kuk + eng + math;
		return sum;		
	}
	double getAverage() {
		// 평균 계산
		avg = (double)sum;
		avg /= 3;
		return avg;
		
	}
	char getGrade() {
		// 평균 성적을 이용한 A to F
		// 90/ 80/ 70/ 60/ F
		char c = 'F';
		if(avg>=90) {
			c = 'A';
		}else if(avg>=80 && avg<90) {
			c = 'B';
		}else if(avg>=70 && avg<80) {
			c = 'C';
		}else if(avg>=60 && avg<70) {
			c = 'D';
		}else if(avg<60) {
			c = 'F';
		}
		return c;
	}
}
