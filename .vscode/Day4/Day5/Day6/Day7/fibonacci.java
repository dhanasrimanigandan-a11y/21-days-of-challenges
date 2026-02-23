import  java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        int a=0,b=1,c,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers");
        n=scan.nextInt();
        System.out.println("Fibonacci series in" +n+" number is:");
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}

