
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int i = 0;
        double prom = 0;
        int par = 0;
        int imp = 0;
        while (true){
            System.out.println("Give numbers: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num != -1){
                if (num % 2 == 0){
                    par ++;
                }else{
                    imp ++;                    
                }
                i++;
                cont = cont + num;
                continue;
            }
            
            if (num == -1){
                prom = (double)cont / i ;
                System.out.println("Thx! Bye!");
                break;
            }
        }
        System.out.println("Sum: "+cont);
        System.out.println("Numbers: "+i);
        System.out.println("Average: "+ prom);
        System.out.println("Even: "+par);
        System.out.println("Odd: "+imp);

    }
}
