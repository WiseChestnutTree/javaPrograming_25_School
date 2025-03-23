package chap3;
public class Example03 {
   public static void main(String[] args) {
      int x = 10;
      System.out.println(x<10 && x<20);	// returns false
      System.out.println(x<10 || x<20); 		// returns true
      System.out.println(!(x<10 &&  x<20)); 	// returns true
   }
}
