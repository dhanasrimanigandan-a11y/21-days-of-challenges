
import java.util.Scanner;

class Day1{

   public static void main(String[] args) {
      System.out.println("Welcome to Java");
      System.out.println("To find even or odd");
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      if (n % 2 == 0) {
         System.out.println("Even number");
      } else {
         System.out.println("odd number");
      }

      System.out.println("Java is fun, Enjoy learning");
   }
}
