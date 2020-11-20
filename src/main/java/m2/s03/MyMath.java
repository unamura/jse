package m2.s03;

public class MyMath {
	private static MyMath instance = new MyMath();// creo un data member statico, che posso inizializzare poichè son o
												  // dentro a l classe

	// se non metto il costruttore esplicito NON posso impedire di creare un oggetto
	// dal main. Lo facci private allora
	private MyMath() {// costruttore privato che impedisce la creazione di oggetto

	}

	public static double cubicSquare(double value) {
		return 0;
	}

	public static MyMath getInstance() {//static factory method
		// sono dentro la classe e QUI, POSO fare un oggetto
		return instance;
		// ritorna l'instance creata all'inizio dalla jvm. Posso creare un SOLO ogg da Main
	}
}
