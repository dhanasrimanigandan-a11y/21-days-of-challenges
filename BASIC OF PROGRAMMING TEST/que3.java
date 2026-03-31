import java.util.Scanner;
public class que3{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int requests=scan.nextInt();
        if(requests<=5){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Blocked");
        }
    }
}
