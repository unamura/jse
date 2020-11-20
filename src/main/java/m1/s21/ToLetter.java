package m1.s21;

public class ToLetter {
	public static void main(String[] args) {
		String s = "hello";
		String t = toUpper(s);
		System.out.println(s + ", " + t);
	}

	static String toUpper (String input){
		StringBuilder result = new StringBuilder(input.length());
		for (int i = 0; i < input.length(); i++) {
			char x = input.charAt(i);//variabile locale
			if (x >= 'a' && x <= 'z') {//se è lettera minuscola
				char c = (char) (x - 32);
				result.append(c);
			}
			else {// cosa faccio se ho il +? metto il +32, diciamo
				result.append(x);
			}
		}
				
		return result.toString();
	}

}
