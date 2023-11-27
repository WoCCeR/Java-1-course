public class lab1_pow {
    public static void main(String[] args) {
        int n = 9;
        System.out.println("З використанням арифметичних операцій:");
        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(8, i);
            System.out.println("8^" + i + " = " + result);
        }
    }
}