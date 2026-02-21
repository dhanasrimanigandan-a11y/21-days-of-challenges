import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scan.nextInt();
        int rev=0;
        int original=n;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(original==rev){
            System.out.println("The number is a palindrome: " + rev);
        }
        else{
            System.out.println("The number is not a palindrome: " + rev);
        }
    }
}