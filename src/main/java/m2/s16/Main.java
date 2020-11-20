package m2.s16;

public class Main {
	public static void main(String[] args) {
		Mammal[] mammals = { new Dog(63, 40), new Cat(63, 20) };// Se fosse array di Object: Object[] mammals... potrei
																// ggiungere anche un numero, che non c'entra nulla. Al
																// 9 è stato fatto un boxing, è diventato Integer

		for (Mammal mammal : mammals) {//Object mammal:...
			System.out.println(mammal);
		}

		// Voglio far scodinzolare un cane ora
		Dog dog = new Dog(0, 0);
		dog.wag();// faccio scodinzolare il cane
		// Non posso scrivere
		// dog.tail.getSize()
		// Perchè è privata, e posso acedervi sol all interno del Dog
		dog.eat();//eat viene da mammal infatti, eat è pubblico nella classe mammal
	}
}
