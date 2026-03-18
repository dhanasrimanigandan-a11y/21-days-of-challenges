import java.util.Scanner;
public class perfectno{
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            int sum=0;
            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    sum+=i;
                }
            }
            if(sum==n){
                System.out.println("perfect number");
            }
            else{
                System.out.println("not perfect number");
            }
        }
}