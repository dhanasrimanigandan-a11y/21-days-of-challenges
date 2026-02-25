import java.util.Scanner;
public class simpleinterest{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter p,r,t:");
        double p=scan.nextDouble();
        double r=scan.nextDouble();
        double t=scan.nextDouble();
        double si=(p*r*t)/100;
        System.out.println("Simple Interest is: "+si);
    }
}
