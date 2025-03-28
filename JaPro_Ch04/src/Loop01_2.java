import java.util.Scanner;

public class Loop01_2 {
   public static void main(String[] args) {
      int sum = 0;
      int num = 0;
      System.out.println("5���� ���ڸ� �Է��ϼ���.");

      for (int n = 1; n <= 5; n++) {        
         Scanner s = new Scanner(System.in);
         num = s.nextInt();
     }

//     for (int i: num) {
//         sum += i;     // sum = sum + num�� ���� �ڵ�
//     }     

     System.out.println("�հ� : " + sum);
   }
}