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
	}
