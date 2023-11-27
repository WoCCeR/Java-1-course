import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedWordCollection {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть речення:");
        String sentence = scanner.nextLine();
        scanner.close();

        SortedSet<String> wordSet = new TreeSet<>(Arrays.asList(sentence.split("\\s+")));
        SortedSet<String> lowerCaseWordSet = new TreeSet<>();
        for (String word : wordSet) {
            lowerCaseWordSet.add(word.toLowerCase());
        }

        System.out.println("Слова в алфавітному порядку у нижньому регістрі:");
        for (String word : lowerCaseWordSet) {
            System.out.println(word);
        }
    }
}
