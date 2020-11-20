package m2.s15;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate
//        Abstract ma = new Abstract(); //NON posso farlo
//        Abstract2 ma2 = new Abstract2();

    	//Classe Concrete estende l'Abstract, quindi posso fare questa cosa
        Abstract ma = new Concrete();
        ma.anAbstractMethod();// istanza di concrete

        Abstract2 ma2 = new Concrete2();
        ma2.aConcreteMethod(); //dentro ho un'istanza di concrete2, quindi funziona correttamente
    }
}
