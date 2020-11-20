package m1.s19;

public class MethodCaller {
    public static void main(String[] args) {//Lavoro anche sulla classe Simple
        System.out.println(Simple.h());//Chiamo il metodo h, statico, della classe Simple.
        
        Simple reference = new Simple();//istanza della classe Simple
        
        int result = reference.f(7, 6);//Ora posso usare le funzioni f g, qui devo mettere per forza due int senno da errore
        System.out.println(result);
        
        reference.g(true);
        reference.g(false);
    }
}
