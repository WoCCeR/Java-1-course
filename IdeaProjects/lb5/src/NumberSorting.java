import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NumberComparatorDecreasing implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        return Integer.compare(getDigitSum(num2), getDigitSum(num1));
    }

    private int getDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

class NumberComparatorIncreasing implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        return Integer.compare(getDigitSum(num1), getDigitSum(num2));
    }

    private int getDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

public class NumberSorting {
    public static void main(String[] args) {
        List<Integer> numbers = readFromFile("input.txt");
        sortAndSaveToFile(numbers, "decreasing_sorted.txt", new NumberComparatorDecreasing());
        sortAndSaveToFile(numbers, "increasing_sorted.txt", new NumberComparatorIncreasing());
    }

    private static List<Integer> readFromFile(String fileName) {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    int number = Integer.parseInt(token);
                    numbers.add(number);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    private static void sortAndSaveToFile(List<Integer> numbers, String fileName, Comparator<Integer> comparator) {
        Collections.sort(numbers, comparator);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer number : numbers) {
                writer.write(number + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
