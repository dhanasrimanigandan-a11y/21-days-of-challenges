import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scan.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}