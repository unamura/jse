package mx;

public class S03 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {

		if (value < 0) {
			return "negative";
		} else if (value > 0) {
			return "positive";
		} else
			return "zero";
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return true;
		} else
			return false;
		// return (value % 2 == 1) // ancora più corto
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
//		if (value < 0 && value >= 10) {
//			return "other";
//		}
		if (value == 0) {
			return "zero";
		} else if (value == 1) {
			return "one";
		} else if (value == 2) {
			return "two";
		} else if (value == 3) {
			return "three";
		} else if (value == 4) {
			return "four";
		} else if (value == 5) {
			return "five";
		} else if (value == 6) {
			return "six";
		} else if (value == 7) {
			return "seven";
		} else if (value == 8) {
			return "eight";
		} else if (value == 9) {
			return "nine";
		} else
			return "other";
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		// equivalente se parto dal basso
		if (percentile > 90) {
			return 'A';
		} else if (percentile > 80) {
			return 'B';
		} else if (percentile > 70) {
			return 'C';
		} else if (percentile > 60) {
			return 'D';
		} else if (percentile > 50) {
			return 'E';
		} else
			return 'F';
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		// bisestile se divisibile per 4, ma non 100
		// oppure anni secolari divisibili per 400
		if (year % 400 == 0) {
			return true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else
			return false;
	}

	/**
	 * return the input value as String
	 * 
	 * <p>
	 * special cases:
	 * 
	 * <li>3, 6, ... : "Fizz"
	 * <li>5, 10, ... : "Buzz"
	 * <li>15, 30, ... : "FizzBuzz"
	 * 
	 * @param value an integer
	 * @return Fizz, Buzz, or the integer as String
	 */
	public static String fizzBuzz(int value) {

		if (value % 5 == 0 && value % 3 == 0) {
			return "FizzBuzz";
		} else if (value % 3 == 0) {
			return "Fizz";
		} else if (value % 5 == 0) {
			return "Buzz";
		} else
			return Integer.toString(value);
		// return " " + value; //preferibile, converte int in una stringa, aggiunge char
		// vuoto

	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return the input values, sorted, in an array
	 */
	public static int[] sort(int a, int b, int c) {
		// esiste Arrays.sort(result);
		int[] result = new int[3];

		// bubble?
		// primi due elemnenti
//		if (a > b) {
//			if (a > c) {
//				result[2] = a;
//				if (b > c) {
//					result[1] = b;
//					result[0] = c;
//				} else {
//					result[1] = c;
//					result[0] = b;
//
//				}
//			} else {
//				result[2] = c;
//				if (b > a) {
//					result[1] = b;
//					result[0] = a;
//				} else {
//					result[1] = a;
//					result[0] = b;
//
//				}
//			}
//		}
// trovarne uno bello
		return result;
	}
	//Operatore ternario, se vero ritorna cio dopo il ?
	// altrimenti ritorna cio dopo i :
}
