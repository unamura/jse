package mx;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		//
		StringBuilder app = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			app.append(s.charAt(s.length() - 1 - i));
		}

		return app.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {

		for (int i = 0; i < (s.length() / 2); i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPali(String s) {
		// loppo finchè non trovo un palindromo
		// parte un conteggio da sx, e uno da dx
		// abba
		// | |
		// | |
		// |

		// ho una sola chiamata alength
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	void g(String s) {
		// dentro ogni volta faccio una chiamata a funzione
		// puo dare fastidio a qualcuno
		// for (int i=0; i < s.length(); i++) {
		// System.out.println(s.charAt(i));
		// salvo il valore, che vive solo in quel blocco
		for (int i = 0, len = s.length(); i < len; i++) {
			System.out.println(s.charAt(i));
		}
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		//
		StringBuilder app = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char pos = s.charAt(i);

			// trasformare in and
			if (pos != 'a' && pos != 'e' && pos != 'i' && pos != 'o' && pos != 'u' && pos != 'A' && pos != 'E'
					&& pos != 'I' && pos != 'O' && pos != 'U') {
				// if (!(pos == 'a' || pos == 'e' || pos == 'i' || pos == 'o' || pos == 'u')) {
				app.append(pos);
			}
//			else if (s.charAt(i) != 'e') {
//				app.append(s.charAt(i));
//			}
//			else if (s.charAt(i) != 'i') {
//				app.append(s.charAt(i));
//			}
//			else if (s.charAt(i) != 'o') {
//				app.append(s.charAt(i));
//			}
//			else if (s.charAt(i) != 'u') {
//				app.append(s.charAt(i));
//			}
			// else app.append("");
		}
		return app.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// [1][0][0][0][1]
		// 43_210
		// 2

		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] x) {
		//reverseInPlace();
		
		int temp = 0;
		for (int i=0; i<x.length;i++) {
			temp = x[i];
			x[i] = x[x.length - i];
			x[x.length - i] = temp;
		}


		return x;

	}
	
	/**
	 * Reverse an array of integers in place
	 * 
	 * ex. [4,5,1,3] -> [3,1,5,4]
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	
	public static void reverseInPlace() {
		//int[] x = {4, 5, 1, 2};
		//reverseInPlace();
		// TODO

	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		// 
		double temp = 0.0;
		for (int i=0; i<data.length; i++) {	
			temp += data[i];
		}
		double result = temp / data.length;
		
		return result;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		if (data.length == 0 || data == null) {
			return Integer.MIN_VALUE;
		}

		int maxim = data[0];

		for (int i = 1; i < data.length; i++) {
			if (maxim < data[i]) {
				maxim = data[i];
			}
		}
		return maxim;
	}
}
