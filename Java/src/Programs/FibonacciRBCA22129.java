package Programs;

import java.util.Arrays;

public class FibonacciRBCA22129 {
    public int[] generateFibonacciSeries(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Number of terms should be greater than zero");

        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        if (n > 1) {
            fibonacciSeries[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }
        }
        return fibonacciSeries;
    }

    public static void main(String[] args) {
        // Example usage of generateFibonacciSeries method
        FibonacciRBCA22129 fibonacciCalculator = new FibonacciRBCA22129();

        // Generate Fibonacci series of 10 terms
        int[] series = fibonacciCalculator.generateFibonacciSeries(10);

        // Print out the generated Fibonacci series
        System.out.println("Generated Fibonacci series: " + Arrays.toString(series));
    }
}