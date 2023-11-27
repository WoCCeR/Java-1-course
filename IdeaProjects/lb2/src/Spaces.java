import java.util.Arrays;
import java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.print("Введіть елементи масиву: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        System.out.print("Введіть рядок: ");
        scanner.nextLine();
        String inputString = scanner.nextLine();

        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Результат: " + reversedString);

        System.out.print("Введіть рядок для видалення літери 'a': ");
        String stringWithA = scanner.nextLine();

        String resultString = stringWithA.replaceAll("a", "");
        System.out.println("Результат: " + resultString);
    }
}
