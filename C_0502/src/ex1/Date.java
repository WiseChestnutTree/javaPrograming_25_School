package ex1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date() {
		year = 1;
		month = 1;
		day = 1;
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void print1() {
		LocalDate d = LocalDate.of(year, month, day);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy.M.d"); 
		String fo = d.format(f);
		
		System.out.println(fo);
	}
	public void print2() {
		LocalDate d = LocalDate.of(year, month, day);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM d. yyyy", Locale.ENGLISH); 
		String fo = d.format(f);
		
		System.out.println(fo);
	}
	
	void sPrint1() {
		System.out.println(year+". "+month+". "+day);
	}
	void sPrint2() {
		String[] me = {"Jan","Feb", "Mar", "Apr", "May", "Jul"};
		System.out.println(me[month-1]+" "+day+", "+year);
	}
	
	public static void main(String[] args) {
		Date dd = new Date(2025, 5, 2);
		dd.print1();
		dd.print2();
		System.out.println();
		dd.sPrint1();
		dd.sPrint2();
	}
	
}
