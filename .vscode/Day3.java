
import java.util.Scanner;

class Day3{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else if(a==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Invalid input");
        }
     }
 }