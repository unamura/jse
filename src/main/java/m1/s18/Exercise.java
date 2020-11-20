package m1.s18;

import java.util.Arrays;

public class Exercise {
	public static void main(String[] args) {
		// 1. print all values in [0 .. 9], expected output:
		// 0 1 2 3 4 5 6 7 8 9
		// do it using a for and a while loop
		int j = 0;

		while (j < 10) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();// va a capo se non metto nulla

		for (int k = 0; k < 10; k++) {
			System.out.println(k);
		}

		// 2. given a boolean array, change its false values to true
		boolean[] flags = { true, false, false };

		System.out.println(Arrays.toString(flags));

		for (int h = 0; h < flags.length; h++) {
			if (flags[h] == false) {//faccio un check, sull elem corrente
				flags[h] = true;
			}
		}
		System.out.println(Arrays.toString(flags));
	}
}
