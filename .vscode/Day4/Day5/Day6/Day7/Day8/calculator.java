import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("Enter the operator:");
        char op=scan.next().charAt(0);
        switch(op){
           case '+' -> System.out.println("The sum is:"+(a+b));
           case '-' -> System.out.println("The difference is:"+(a-b));
           case '*' -> System.out.println("The product is:"+(a*b));
           case '/' -> System.out.println("The quotient is:"+(a/b));
           default -> System.out.println("Invalid operator");
        }
    }
}
