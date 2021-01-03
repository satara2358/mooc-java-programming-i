
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ones = 0;
        int count = 0; 
        double prom = 0;
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                ones = ones + number;
                count = count + 1;
            }else if (number == 0) {
                prom = (double)ones / (double)count;
                break;
            }   
        }
        if (ones > 1){
            System.out.println("Sum of the numbers: " + ones);
        }
        if (count > 1){
            System.out.println("Number of numbers: " + count);
        }
        if (prom > 0){
            System.out.println("Average of the numbers: " + prom);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
