package m2.s21;

public class Main {
	public static void main(String[] args) {
//		Cat cat = (Cat) new Dog(); //NON si puo fare!! non posso trasformare Dog in cat, e metterlo in Cat

		Pet pet = new Dog("Bob");// UPCAST, è lecito e sempre sicuro.

		// risky
		Dog dog = (Dog) pet;// rischioso, DOWNCASTING, potrebbe funzionare o no. Qui posso farlo perchè l'ho
							// fatto in riga 7. Non lo voglio fare però.TROPPO RISCHIOSO, NON FARE
		dog.bark();

		// next line leads to a ClassCastException
//		Cat cat = (Cat) pet; // il compilare no si lamenta. Si fida di me, ma è una cosa terribile, voglio
		// castare Dog in Cat. Io so che pet è un Dog, ma il compilatore no. Dopo il
		// programma si fermerà, darà il problema inesecuzione. NON FARE
		// next line is just not to have a warning for unused cat on the previous line
//        System.out.println(System.identityHashCode(cat));//toglie il warning

		// per far miagolare un pet lo proteggo con instance of,invece. Dico, vorrei
		// fare questo codice, e prima mi accerto che sia davvero Cat, ritorna true solo
		// se è Cat. Qui mi darà false, e salterà il blocco
		if (pet instanceof Cat) {
			Cat tom = (Cat) pet;
			tom.meow();
		}
		else {
			System.out.println("This pet is not a cat!");
		}

		Pet[] pets = { new Dog("Tom"), new Cat("Bob") };

		f(pets);
	}

	// scrivi metodo in cui uno passa array di Pet e tu devi farli abbaiare o
	// miagolare in base a cosa sono. Prima mi accerto di cosa sono
	static void f(Pet[] pets) {
		if (pets == null) {
			return;
		}

		// ho array di Pet e vorrei fare abbaiare i cani che ci sono dentro, e miagolare
		// i atti dentro. Ho l'operatore instance of che mi permette di capire che cosa
		// sono. Se è cane fai downcast con Dog e fai abbaiare,..
		for (Pet pet : pets) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet;
				dog.bark();
			}
			if (pet instanceof Cat) {
				Cat cat = (Cat) pet;
				cat.meow();
//				((Cat)pet).meow(); // formato molto compatto, con un po di esperienza si puo fare cosi
			}
		}
	}
}
