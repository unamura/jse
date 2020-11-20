package m2.s16;

public abstract class Mammal {
	protected int gestation;// si puo usare protected, cosi che la proprietò sia visibile alle classe figlie

	//Se ci metto un costruttore, senza parametri. Cosi in Cat, non devo per forza usape super
//	public Mammal () {
//		this.gestation = 100;
//	}
	
	//Avendo questo ctor, non ci posso mettere quello vuoto
	public Mammal(int gestation) {
		this.gestation = gestation;// riparleremo di cosa è il this. Chi vuole costruire mammal, deve dire il
								   // numero di giorni della gestazione.
	}
	
	public void eat() {
		System.out.println("Munch!");
	}

	@Override
	public String toString() {
		return "Mammal [gestation=" + gestation + "]";
	}
}
