public class Eratosthenes{
    public static void main(String[] args) {
        // Розмір масиву
        int size = 300;

        // Створення та заповнення масиву послідовними додатними значеннями
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }

        // Заміна значень, які не є простими числами, від'ємним значенням
        for (int i = 1; i < size; i++) {
            if (array[i] > 1) {
                for (int j = 2 * array[i]; j <= size; j += array[i]) {
                    array[j - 1] = -1;
                }
            }
        }

        // Виведення простих чисел (додатніх значень)
        System.out.println("Прості числа у масиві:");

        for (int num : array) {
            if (num > 1) {
                System.out.print(num + " ");
            }
        }
    }
}
