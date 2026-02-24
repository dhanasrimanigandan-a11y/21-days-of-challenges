import java.util.Scanner;
public class dteg{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        scan.nextLine();
        String Name=scan.nextLine();
        String Gender=scan.nextLine();
        char Grade=scan.next().charAt(0);
        double cgpa=scan.nextDouble();
        System.out.println("Age: "+age+", Name: "+Name+", Gender: "+Gender+", Grade: "+Grade+" , CGPA: "+cgpa);
        System.out.println("Let's learn Java with confidence:) ");
        }
 }
