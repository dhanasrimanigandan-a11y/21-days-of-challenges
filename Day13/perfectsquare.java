import java.util.Scanner;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sqrt=(int)Math.sqrt(n);
        if(sqrt*sqrt==n){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not perfect square");
        }
    }
}