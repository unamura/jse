package m2.s16;

public class Dog extends Mammal {// se estendo una classe, nel body di solito ci metto qualcosa in più
	private Tail tail;// Se voglio che il mio cane abbia la coda, ho messo questa proprietà, Tail è un
					  // tipo reference, dopo dovo costruirla. L'aggregazione è trattarla in modo
					  // informale, non è un tipo standard, ma uno che ho creato io, devo stare
					  // attento. Il Dog ha in più il emetodo wag
	// Potrei essere distratto
	//private int gestation; // non mi da problemi nel codice. Ma è strano, il cane ha due proprietà
						   // gestation, una del cane e una mammal. è un incubo gestire questo codice

	public Dog(int gestationDays, int tailLen) {// ctor, metodo particolare
		super(gestationDays);
		this.tail = new Tail(tailLen);
	}

	@Override
	public String toString() {
		return "Dog [tail=" + tail + ", gestation=" + gestation + "]";
	}

	// Qui si vede l'idea dell'aggregazione
	public void wag() {
		tail.wag();// metodo wag in tail, che va a chiamare il metodo wag di tail, delega lo
				   // scodinzolamento all'ogetto private Tail tail. Delega la chiamta a Tail, che
				   // conterra il metodo wag.
		// Per avere la size posso fare cosi
		// System.out.println("Tail length is:" + tail.getSize());

	}
}
