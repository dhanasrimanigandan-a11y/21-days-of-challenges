import java.util.Scanner;
public class strongno{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int sum=0;
        int original=n;
        while(n>0){
            int r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==original){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}
