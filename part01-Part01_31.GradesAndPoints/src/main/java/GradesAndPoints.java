
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String grade = "";
        
        System.out.println("Give points [0-100]:");
        int points = scan.nextInt();
        
        if (points < 0) {
            grade = "impossibl!";
        } else if (points <= 49) {
            grade = "failed";
        } else if (points <= 59) {
            grade = "1";
        } else if (points <= 69) {
            grade = "2";
        } else if (points <=79) {
            grade = "3";
        } else if (points <= 89) {
            grade = "4";
        } else if (points <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }
        
        System.out.println("Grade: " + grade);
    }
}
