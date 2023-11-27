public class Fibonacci {

    private static long[] fibArray;  // Static array to store Fibonacci numbers

    public static void main(String[] args) {
        int maxIndex = 92;  // Maximum index for Fibonacci numbers

        // Testing the function for different indices
        for (int i = 1; i <= 10; i++) {
            long result = calculateFibonacci(i, maxIndex);
            System.out.println("F(" + i + ") = " + result);
        }
    }

    /**
     * Function to calculate Fibonacci numbers using a helper array.
     *
     * @param index    Index of the Fibonacci number.
     * @param maxIndex Maximum index for Fibonacci numbers.
     * @return Value of the Fibonacci number for the given index.
     */
    private static long calculateFibonacci(int index, int maxIndex) {
        // Initialize the array during the first function call
        if (fibArray == null) {
            fibArray = new long[maxIndex];
            fibArray[0] = fibArray[1] = 1;
        }

        // Check if the Fibonacci number for the given index is already calculated
        if (fibArray[index - 1] != 0) {
            return fibArray[index - 1];
        }

        // Calculate the Fibonacci number and store it in the array
        fibArray[index - 1] = calculateFibonacci(index - 2, maxIndex) + calculateFibonacci(index - 1, maxIndex);
        return fibArray[index - 1];
    }
}
