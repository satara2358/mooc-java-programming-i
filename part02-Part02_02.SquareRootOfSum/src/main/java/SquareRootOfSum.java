
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int int1 = Integer.valueOf(scanner.nextLine());
        int int2 = Integer.valueOf(scanner.nextLine());
        
        int sum = int1 + int2;
        
        double squareRoot = Math.sqrt(sum);
        
        System.out.println(squareRoot);
    }
}
