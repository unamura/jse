package m2.s02;

public class Main {
    public static void main(String[] args) {
        MyClass reference = new MyClass();
        //reference.   mi fa uscire una lista con vari metodi. Dentro ha il metodo toString
        //public String toString() ... (objectClass)
        MyClass reference2 = new MyClass();
        //tra i vari overload della prinLn prendo quello che prende una stringa
        
        
        System.out.println(reference);
        System.out.println(reference2.toString());
        //avro risultato simile con parte di dx del @ diversa
    }
}
