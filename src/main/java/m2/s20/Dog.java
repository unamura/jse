package m2.s20;

public class Dog extends Pet {
	private double speed;

	public Dog() {// questo chiama quello sotto, che chiama il cror ancora sotto,
		this("No name");
	}

	public Dog(String name) {
		this(name, 0.0);
	}

	public Dog(String name, double speed) {
		super(name);
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		// dico che quando fai la toString del Dog chaiama anche la toString di Pet,
		// dopo la toString del Dog, genera la stringa con la veloc del ane e concatena
		// il toString del Pet. Cosi ho stringa con la vel e nome. Se non mettessi
		// super.toString, esegue una chiamata ricorsiva proprio a questo metodo che si
		// chiama toString.Se commentassi il toString in Pet, userebbe quello di Object.
		return "Dog [speed=" + speed + "] " + super.toString();
	}
}