import java.util.Scanner;
public class secondlargest{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scan.nextInt();;
        int secondlargest=0;
        int b=0;
        while(a>0){
            int r=a%10;
            if(r>b){
                secondlargest=b;
                b=r;
            }
            else if(r>secondlargest && r!=b){
                secondlargest=r;
            }
            a=a/10;
        }
        System.out.println("Second largest digit is "+secondlargest);
    }
}
