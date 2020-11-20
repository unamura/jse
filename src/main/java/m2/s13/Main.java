package m2.s13;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Barker barker = new Barker(); //non posso creare un oggetto da interfaccia

//        Barker[] group = new Barker[3];//posso fare pero, un array di barker. Dentro ci saranno 3 null, che posso poi riempire
//        
//        group[0] = new Fox();
//        group[1] = new Dog();
//        group[2] = new Robot();

		Barker[] barkers = { new Fox(), new Dog(), new Robot(), new Poodle() };// non posso fare new Barker, ma una
																			   // classe completa
		// che implementa l'interfaccia. Per esempio Fox, che è
		// una clsse concreta. Ci metto vari oggetti che
		// implementato barker
		System.out.println(barkers);// se lo stampo, so che l'array non implementa il metodo toString, ma quella
									// standard. Devo usare toString
		System.out.println(Arrays.toString(barkers));// uso questo utility method, toString. L'out di dog sarà più
													 // leggibile perche ho fatto un override

		for (Barker aBarker : barkers) {// "for each", su array di Barkers. (aBarker è un barker generico definito qua).
										// Viene messa copia del reference dell'elemento corrente di barker
			System.out.println(aBarker.bark());// stampo l'abbaiata del barker corrente. Il bark giusto è beccato da
											   // java grazie al polimorfismo.
		}

		WaggingBarker baw = new Dog();// posso creare oggetto di classe concreta, e metto dentro il suo reference
									  // quello che è il reference ad una interfaccia. Nel refernce, dico, che
									  // chiamerò solo metodi estesi da WaggingBarker. Mi interessa solo che
									  // scodinzoli e abbai. Se non mi interessa il numero di volte che abbai allora
									  // non ha senso entrare in Dog. Più riesco a limitare l'accessomegli è.
		System.out.println(baw.wag());

		Dog dog = new Dog();// Qui invece voglio avere accesso anche a funzionalità specifiche del dog.
		System.out.println(dog.bark(3));

		interact(dog);

		Object obj = new Dog();// Object è allabse di tutte le classi. Posso fare cosi. Io lo tratto come un
							   // reference a object, ma java sa che è Dog.
		System.out.println(obj.toString());
	}

	// solitamente arriva cosi, non so quale barker sia io, so solo che è un barker
	static void interact(Barker barker) {// prende come parametro un barker, il metodo interAct puo essere chiamato su
										 // qualunque barker. Se avessi fatto su dog, è meno potente, perche lavora solo
										 // sui cani, invece cosi lavora anche su chi implementa la funzione barker, se
										 // avessi usato dog, solo chi è dog..
		System.out.println(barker.bark());
		// dico che l'oggetto che è un barker, lo vedo come un barker
	}

	static void interact(Object obj) {
		System.out.println(obj.toString());
	}
}
