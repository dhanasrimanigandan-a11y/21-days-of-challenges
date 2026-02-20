import java.util.Scanner;
public class swapwithout3rd{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("Before swapping:a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:a="+a+",b="+b);
    }
}

