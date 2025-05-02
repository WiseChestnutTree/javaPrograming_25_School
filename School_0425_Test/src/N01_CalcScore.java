

public class N01_CalcScore {
	
	int getRandomScore() {
		return( (int)(Math.random() * 101) );
	}
	
	void scoreCalculation() {
		// 학생 클래스 생성,  성적 계산, 결과 출력
		int[] scores = new int[30];
		for(int i=0; i<30; i++) {
			scores[i] = getRandomScore();
		}
		
		N01_Student s1 = new N01_Student(scores[0],scores[1],scores[2], 1);
		N01_Student s2 = new N01_Student(scores[3],scores[4],scores[5], 2);
		N01_Student s3 = new N01_Student(scores[6],scores[7],scores[8], 3);
		N01_Student s4 = new N01_Student(scores[9],scores[10],scores[11], 4);
		N01_Student s5 = new N01_Student(scores[12],scores[13],scores[14], 5);
		N01_Student s6 = new N01_Student(scores[15],scores[16],scores[17], 6);
		N01_Student s7 = new N01_Student(scores[18],scores[19],scores[20], 7);
		N01_Student s8 = new N01_Student(scores[21],scores[22],scores[23], 8);
		N01_Student s9 = new N01_Student(scores[24],scores[25],scores[26], 9);
		N01_Student s10 = new N01_Student(scores[27],scores[28],scores[29], 10);
		
	}
	
	
	public static void main(String[] args) {
		N01_CalcScore cs = new N01_CalcScore();
		cs.scoreCalculation();
		
	}
}
