import java.util.Scanner;
public class greatest3no{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a>b&&a>c){
            System.out.println("Greatest of three numbers is: "+a);
        }
        else if(b>a&&b>c){
            System.out.println("Greatest of three numbers is: "+b);
        }
        else{
            System.out.println("Greatest of three numbers is: "+c);
        }

    }
} 