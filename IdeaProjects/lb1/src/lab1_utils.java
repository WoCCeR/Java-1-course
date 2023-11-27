
import java.util.Scanner;

public class lab1_utils {

    public static double Func(double x) {
        final int n = 9;
        double y = 0;
        double tmp  = 0;
        fxt:
        for (int i = 1; i <= n-1; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j + x) {
                    continue fxt;
                }
                if (j + x == 0){
                    break fxt;
                }
                y += i/(j + x);
                tmp = y;
            }
            y *= tmp;
        }
        return y;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter a value for j: ");
        double j =  scanner.nextDouble();
        double result = Func(x);
        System.out.println("Result: " + result);
    }

}