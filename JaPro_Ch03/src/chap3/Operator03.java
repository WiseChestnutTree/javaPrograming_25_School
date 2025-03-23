package chap3;
public class Operator03 {
   public static void main(String[] args) {
      int a = 5, b = 10;
      System.out.println(a > b); 	// prints false
      System.out.println(!(a > b)); 	// prints true
      System.out.println((a == b) && (a == 5)); 		// prints false
      System.out.println((a != b) && (a == 5)); 		// prints true
      System.out.println(!((a != b) && (a == 5))); 	// prints false
   }
}
