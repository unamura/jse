package m2.s04;

public class Main {
	public static void main(String[] args) {
		String boolAsStringClassic = "" + true;// converto booleano in str concatenando
		System.out.println("A boolean converted to string: " + boolAsStringClassic);

		String boolAsStringModern = String.valueOf(true);// metodo valueof, della classe stringa, converte, è static
														 // factpy method
		System.out.println("Another boolean converted to string: " + boolAsStringModern);

		Dog[] dogs = new Dog[2];

		dogs[0] = Dog.createWithName("Bob");
		dogs[1] = Dog.createWithNoName();

		for (Dog dog : dogs) {
			dog.bark();
		}
	}
}
