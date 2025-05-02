package ex1;

public class Movie {
	private String name;
	private double score;
	private String author;
	private int sYear;
	
	Movie(){
		name = "야당";
		score = 4.3;
		author = "미정";
		sYear = 2025;
	}
	Movie(String s, double d, String a, int i){
		name = s;
		score = d;
		author = a;
		sYear = i;
	}
	
	void print() {
		System.out.println("영화 제목 : "+name);
		System.out.println("영화 평점 : "+score);
		System.out.println("영화 감독 : "+author);
		System.out.println("개봉 연도 : "+sYear);
	}
	
	public static void main(String[] args) {
		Movie m = new Movie();
		m.print();
		System.out.println();
		
		Movie me = new Movie("퍼시픽림", 4.9, "스트브 버그", 2020);
		me.print();
	}
}
