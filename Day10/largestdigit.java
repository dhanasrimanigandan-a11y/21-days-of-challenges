import java.util.Scanner;
public class largestdigit{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scan.nextInt();
        int largest=0;
        while(n>0){
            int r=n%10;
            if(r>largest){
                largest=r;
            }
            n=n/10;
        }
        System.out.println("Largest digit is "+largest);
    }
}
