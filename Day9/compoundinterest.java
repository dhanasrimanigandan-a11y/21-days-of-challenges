import java.util.Scanner;
public class compoundinterest{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter p,r,t:");
        double p=scan.nextDouble();
        double r=scan.nextDouble();
        double t=scan.nextDouble();
        double A=p*(Math.pow(1+r/100,t));
        double ci=A-p;
        System.out.println("Compound Interest is: "+ci);
    }
}