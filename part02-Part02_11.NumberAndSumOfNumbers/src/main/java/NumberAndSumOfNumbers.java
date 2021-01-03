
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;
        int count = 0; 
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                ones = ones + number;
                count = count + 1;
            }
            if (number == 0) {
                break;
            }  
        }
        System.out.println("Sum of the numbers: " + ones);
        System.out.println("Number of numbers: " + count);

    }
}
