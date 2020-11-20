package m2.s13;

//questa classe implementa l'interfaccia
//servono le annotazioni @Override, che posso non metter. Ma è utile, dice che bark non nasce qui in Fox ma nasce altrove. In Barker c'è bark infatti
//eclipse lo segnala con una freccina, in Java8 c'è il tag
//se faccio errori su bark, mi da errore

public class Fox implements Barker {
	@Override
	public String bark() {
		return "Yap";
	}
}