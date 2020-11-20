package m1.s06;

public class Widening {
    public static void main(String[] args) {
        byte b = 42;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(d);

        char c = (char) s; //devo fare cast esplicito, senno da errore
        int i2 = c;
        System.out.println(c + " " + i2);
        
        
        char x = '*';
        int x2 = x;
        System.out.println(x + ", " + x2);
        
        long bigValueL = 1_000_000_000_000_000_000L;
        float bigValueF = bigValueL;//prova a convertire ma non troppo bene
        double bigValueD = bigValueL;// esegue correttamente la conversione
        System.out.println(bigValueL + ", " + bigValueF + ", " + bigValueD);
        System.out.println(String.format("%.0f, %.0f", bigValueF, bigValueD));
    }
}
