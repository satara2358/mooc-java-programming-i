
public class AdvancedAstrology {

    for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }
    public static void printTriangle(int size) {
        /*int x =0;
        int ad = 1;
        int y = size;
        while(x <= size){
            printSpaces(y);
            y--;
            if (y<=18 && y >=0){
                printStars(x);   
            }
            x++;
            //ad++;  
        }*/ 
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }
    public static void christmasTree(int height) {
        /**int x =0;
        int ad = 1;
        int y = height;
        while(x <= height){
            printSpaces(y);
            y--;
            if (y<=18 && y >=0){
                printStars(x+ad);   
            }
            x++;
            ad++; 
        }
        for(int i= 0; i < 2; i++){
            printSpaces(height/2+1);
            printStars(3);
        }**/
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i+(i-1));
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
