import java.util.Scanner;
public class ternary{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int age=scan.nextInt();
        String result=(age>=18)?"Adult":"Child";
        System.out.println(result);
    }
}