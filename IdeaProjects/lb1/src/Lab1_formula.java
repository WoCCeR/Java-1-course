import java.util.Scanner;

class Formula {

    public static double F(double x) {
        final int n = 6;
        double y;
        int k = 1;
        if (x <= 5) {
            y = -0.2 * x;
            for (int i = 1; i <= n; i++) {
                int sum = 1;

                y += k * Math.exp(0.2 * x - 1);
            }
            return y;
        }
        return 5 * Math.cos(0.6 * x - 3) + 15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        double x = scanner.nextDouble();
        double result = F(x);
        System.out.println("Result: " + result);
    }
}