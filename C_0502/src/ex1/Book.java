package ex1;

public class Book {
	private String title;
	private String author;
	
	Book(){
		title = "x";
		author = "x";
	}
	Book(String t, String a){
		this.title = t;
		this.author = a;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	void printInfo() {
		System.out.println("Title: "+title+" , author: "+author);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("어린 왕자", "생택쥐베리");
		
		b1.printInfo();
		b2.printInfo();
		
		b1.setTitle("자바프로그래밍");
		b1.setAuthor("정원용");
		b1.printInfo();
	}
	
	

}
