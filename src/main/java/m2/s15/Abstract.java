package m2.s15;

public abstract class Abstract {
    public abstract void anAbstractMethod();//devo scrivere abstract (keyword) prima del void.

    public void aConcreteMethod() {// metodo concreto
    }
    //poichè anche solo un metodo è astratto NON posso dire che la classe sia concreta, NON posso fare new Abstract
}
