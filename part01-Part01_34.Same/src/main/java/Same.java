
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String first = scan.nextLine();
        System.out.println("nter the second string:");
        String second = scan.nextLine();
        
        if (!first.equals(second)) {
            System.out.println("Different");
        } else {
            System.out.println("Same");
        }
    }
}
