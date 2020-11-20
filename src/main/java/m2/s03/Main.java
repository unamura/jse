package m2.s03;

public class Main {
	public static void main(String[] args) {
		Dog tom = new Dog("tom");
		Dog[] dogs = new Dog[6]; // creo un array di cani, ma dentro non ci sara niente, i reference infatti nell
								 // array avranno null
		// quando creo un array non sto creando oggetti di quel tipo ma un contenitore
		// per oggetti di quel tipo

		// posso creare un cane, con nome o senza perchè è stato creato un costruttore
		// che accetta string o niente (in questo caso)

		// per avere un cane nel mio array devo mettercelo esplicitamente
		dogs[0] = new Dog("Bob");
		// per i cani rimantenti ci mettero un cane senza nome
		for (int i = 1; i < dogs.length; i++) {
			dogs[i] = new Dog();
		}

		dogs[0].bark();
		dogs[dogs.length - 1].bark();// faccio abbaiare l'ultimo cane dell array, che era no name

		// System.gc(); //per chiamare il gc

		tom.bark();

		//MyMath mm = new MyMath(); // questo codice funzione , e crea da solo un costruttore. Ma non voglio che uno
								  // possa farlo
		System.out.println(MyMath.cubicSquare(42));//costringo a fare cosi
		
		MyMath mm = MyMath.getInstance();
		MyMath mm2 = MyMath.getInstance();
		
		System.out.println(mm == mm2);//in realtà cosi non ha molto senso
	}
}
