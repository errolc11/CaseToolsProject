package Programs;

public class NumberOfDigitsRBCA22129 {
    public int countDigits(int number) {
        if (number == 0)
            return 1;

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage of countDigits method
        NumberOfDigitsRBCA22129 digitCounter = new NumberOfDigitsRBCA22129();

        // Count digits in a number
        int number = 12345;
        int digitCount = digitCounter.countDigits(number);

        // Print out the number of digits
        System.out.println("Number of digits in " + number + ": " + digitCount);
    }
}