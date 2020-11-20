package m2.s18;

public class Dog implements Comparable<Dog> {// implementa comparable, cosi posso avre il compareTo
	private String name;
	private String owner;

	public Dog(String name, String owner) {// costruttore. This vuol dire che sto lavorando sul name dell'oggetto
										   // corrente
		this.name = name;// il nome dell oggetto che sto costruendo è lo stesso nome della proprietà.
		this.owner = owner;
	}

	public String getName() {// permette di leggere esternament il valore, tipicamente privata
		return name;
	}

	public void setName(String name) {// per cambiare il valore, setter,
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	// voglio metodo per verificare se due cani sono uguali, se non lo scrivo mi
	// becco quello di Object (che dice che due cani son uguali solo se sono los
	// tesso). Se voglio farlo per due cani che hanno anche locazini divers ein
	// memoria, me lo scrivo.
//	@Override
//	public boolean equals(Object obj) {// sto facendo l'override, non posso mettere Dog obj, ma devo mantenere Object
//		// or use IDE auto-generation tool. Trovo su eclipse in source
//		if (obj == this) {
//			return true;
//		}
//		if (!(obj instanceof Dog)) {
//			return false;
//		}
//
//		Dog that = (Dog) obj;
//		if (Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner)) {
//			return true;
//		}
//
//		return false;
//	}
//
//	@Override
//	public int hashCode() {
//		// consider using an external library for better performance
//		// or use IDE auto-generation tool
//		// or extract code from Arrays.hashCode()
//		return Objects.hash(name, owner);77CHIAMA METODO HASH CHE FA LA STESSA COSA DEL CODICE ECLIPSE
//	}

	// Codice generrato da eclipse
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())// di che classe è questo obj? lo confronta con la classe del reference passato
			return false;
		Dog other = (Dog) obj;// sono sicuro che object èdello stesso tipo di Dog, posso fare un cast, da obj
							  // a other
		if (name == null) {// controolo i nmi
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))// confronto le due stringhe
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		}
		else if (!owner.equals(other.owner))
			return false;
		return true;// se dopo i controlli è ok ritorna true
	}

	@Override
	public int hashCode() {// hashcode, numero che permetta di verificare con minore possibilità di clash
						   // dove mettere nella hashtable il mio argomento
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public String toString() {// SCRIVO UNA STRINGA CHE RENDA COMPRENSIBILE L'OGGETTTO.. Posso fare in
							  // generate toString anche qui
		// or use IDE auto-generation tool
		return "Dog [" + name + ", " + owner + "]";
	}

	@Override
	public int compareTo(Dog that) {// compara solo cani con cani
		int cmp = this.name.compareTo(that.name);// compara nome corrente con quello dell altro cane. Se è 0, allora
												 // compara i proprietari
		if (cmp == 0) {
			return this.owner.compareTo(that.owner);
		}
		return cmp;// superati i test cmp sarà 0
	}
}
