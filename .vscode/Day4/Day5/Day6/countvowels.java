import java.util.Scanner;
public class countvowels{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        int count=0;
        String a=scan.nextLine();
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: "+count);
    }
}