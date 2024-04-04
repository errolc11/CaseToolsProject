package Programs;

public class FactorialRBCA22129 {
    public int calculateFactorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Example usage of calculateFactorial method
        FactorialRBCA22129 factorialCalculator = new FactorialRBCA22129();

        // Calculate factorial of a positive number
        int number = 5;
        int result = factorialCalculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        // Attempt to calculate factorial of a negative number
        try {
            int negativeNumber = -5;
            int negativeResult = factorialCalculator.calculateFactorial(negativeNumber);
            System.out.println("Factorial of " + negativeNumber + " is: " + negativeResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}