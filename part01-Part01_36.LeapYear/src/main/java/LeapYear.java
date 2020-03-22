
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int year;
        boolean leap = false;
        
        System.out.print("Type a year: ");
        year = Integer.valueOf(scan.nextLine());
        
        boolean leapDiv4 = year % 4 == 0 && year % 100 != 0;
        boolean leapDiv400 = year % 400 == 0;
        
        if (leapDiv4 || leapDiv400) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
