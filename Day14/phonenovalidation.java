import java.util.Scanner;

public class phonenovalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String phone = sc.nextLine();
        if (phone.matches("[0-9]{10}")) {
            System.out.println(phone + " is a valid phone number.");
        } else {
            System.out.println(phone + " is not a valid phone number.");
        }
    }
}