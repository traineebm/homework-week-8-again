import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Program_8_SymbolTriangle {
    public static void symbolTriangle(int n){
        for (int i = 0; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.println("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        symbolTriangle(sc.nextInt());
        // Closing the scanner object
        sc.close();
    }
}
