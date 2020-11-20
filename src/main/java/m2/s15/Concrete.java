package m2.s15;

//Se faccio cosi non posso rendere la classe Concrete concreta, perche estende la classe astratta. O metto etichetta abstract dopo public, o faccio override del metodo
// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract {
//}

public class Concrete extends Abstract {// il nome Concrete è sottointeso di solito, sono le altre classi. Se faccio
										// override del metodo astratto, questa classe e concreta
	@Override
	public void anAbstractMethod() {
		System.out.println("not abstract anymore");
	}
}
