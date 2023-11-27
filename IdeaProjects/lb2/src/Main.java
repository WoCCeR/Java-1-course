import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int rows = 6;
        int columns = 4;

        int[][] intArray = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                intArray[i][j] = random.nextInt(18) + 8;
            }
        }


        int[] stringLengths = {5, 8, 6, 4};
        String[] stringArray = new String[columns];
        for (int i = 0; i < columns; i++) {
            char[] chars = new char[stringLengths[i]];
            Arrays.fill(chars, 'A');
            stringArray[i] = new String(chars);
        }

        // Сортування масиву рядків за зменшенням довжини
        Arrays.sort(stringArray, Comparator.comparingInt(String::length));

        // Виведення результатів
        System.out.println("Двовимірний масив цілих чисел:");
        for (int[] row : intArray) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nОдновимірний масив рядків:");
        System.out.println(Arrays.toString(stringArray));
    }
}
