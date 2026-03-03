import java.util.Scanner;
public class sumevendigits{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int sum=0;
        while(n>0){
            int r=n%10;
            if(r%2==0){
                sum=sum+r;
            }
            n=n/10;
        }
        System.out.println("Sum of even digits is "+sum);
    }
}