import java.util.Scanner;
public class que2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total=scan.nextInt();
        if(total<=100){
            System.out.println("Status: Normal, Active: "+total+", Compressed: 0");
        }
        else{
            System.out.println("Status: Optimized, Active: 100, Compressed: "+(total-100));
        }
    }
}