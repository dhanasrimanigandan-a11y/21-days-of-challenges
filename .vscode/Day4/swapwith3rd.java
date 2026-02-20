import java.util.Scanner;
public class swapwith3rd{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c;
        System.out.println("Before swapping: a="+a+", b="+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping: a="+a+", b="+b);
    }
}