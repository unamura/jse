package m2.s16;

public class Cat extends Mammal {
	private Tail tail;

	public Cat(int gestationDays, int tailLen) {// costruttore ha due parametri. Se voglio costruire un gatto prima devo
												// cpstruire ci che ci sta dentro, Mammal
		super(gestationDays);//Cosi, dico che sto chiamando il costruttore del super, la classe che è stata estesa. super (int)
		this.tail = new Tail(tailLen);//Passo ad inizializzare correttamente la parte cat del Cat, è responsabilità del programmatore. 
	}

	@Override
	public String toString() {
		return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
	}
}
