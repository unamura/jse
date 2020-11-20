package mx;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		//
		int result = 0;

		while (first <= last) {
			result += first;
			first++;
		}
		return result;

		// int result = 0;s
		// for (int cur = first; cur <= last; cur ++) {
		// result += cur;
		// }
		// return result;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		//
		int result = 0;

		while (first <= last) {// forse togliere
			// for (int cur = first; cur <= last; cur ++) {
			if (first % 2 == 0) {
				result += first;
			}
			first++;
		}
		return result;
		// Cosi faccio tanti if pero
		// if (first % 2 == 1) {
		// first += 1; // salto al successivo, che sarà dispari
		// for (.....; cur += 2) // salto a quelli che mi servoon
		// result += cur;
	}

	/**
	 * Generate an array on n strings like "X", but sized 1 .. n
	 * 
	 * @param n
	 * @return the generated array
	 */
	public static String[] pyramid(int n) {

		String[] result = new String[n];

		for (int i = 0; i < n; i++) {
			result[i] = "";
			for (int j = 0; j <= i; j++) {
				result[i] += 'X';
			}
		}
		return result;
	}

	/**
	 * Square root using Newton method Epsilon should be set to 0.001
	 * 
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
		// TODO
		return 0.0;
	}

	/**
	 * Square root using Newton method
	 * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
	public static double sqrt(double value, double epsilon) {
		// TODO
		return 0.0;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		// TODO
		long result = 1L;
		if (value < 0) {
			return 0;
		}
		for (int i = 0; i < value; i++) {
			result *= (value - i);
		}
		return result;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {

		int[] result = new int[value];
		result[0] = 0;
		result[1] = 1;

		for (int i = 2; i < value; i++) {
			result[i] = result[i - 2] + result[i - 1];
		}

		return result[value - 1];
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

		// TODO

		return result;
	}
}
