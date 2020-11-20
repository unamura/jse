package m1.s21;

public class Caesar {
	static String encrypt(String in, int gap) {
		if (in == null || in.isEmpty()) {
			return in;
		}

		String input = in.toUpperCase();
		StringBuilder result = new StringBuilder();

		for (int j = 0; j < input.length(); j++) {
			char c = input.charAt(j);

			if (c < 'A' || c > 'Z') {// ignoro i non caratteri alfabetici
				continue;
			}

			// confronto un char con char
			char k = (char) ('A' + ((c - 'A' + gap) % 26));// controllo la distanza da A, e aggiungo il 7
			
			if (k < 'A' || k > 'Z') {
				k += 26;
				//System.out.println(k);// Capisci un po perchè
			}
			
			
			result.append(k);

			
			
		}
		// String myCrypto = "temp";
		return result.toString();
	}

	static String decrypt(String input) {
		String myDecrypt = "temp";
		return myDecrypt;
	}

	public static void main(String[] args) {
		// Cifr Cesare sposta lettere di + 7 (modifico con int gap)
		// A -> H
		// Z -> G
		String message = "Hello";
		String mCrypt = encrypt(message, 15);

		System.out.println(message + " -> " + mCrypt);

		// Decrypting
		String mDecrypt = encrypt(mCrypt, -15);

		System.out.println(mCrypt + " -> " + mDecrypt);
	}
	
	
	


}
// Pensare operatore modulo
