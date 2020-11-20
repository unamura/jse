package m1.s06;

public class Narrowing {
    public static void main(String[] args) {
        double d = 42;
        float f = (float)d;//devi confermare di voler buttare via dei bit
        long l = (long)f;//se mi sposto da sx a dx devo confermarlo col cast esplicito
        int i = (int)l;
        short s = (short)i;
        byte b = (byte)s;
        
        System.out.println(b);

        char c = (char) i;
        short s2 = (short)c;
        System.out.println(c + " " + s2);
        
        byte neg = -1;//rappresentazione spinosa. Funziona correttamente da byte ad int
        int neg2 = neg;
        
        System.out.println(neg + ", " + neg2);
        
        // beware of narrowing
        int million = 1_000_000;
        byte sliced = (byte)million;//ha buttato via i 3 byte più significativi, cast
        System.out.println(sliced);//esce sliced = 64
        
        // floating point -> integer
        // altrimenti largeValue 800_000_000_000.0
        double largeValue = 800_000_000_000L;//metto la L per far capire che non è un int
        int approx = (int)largeValue;//il largeValue non ci sta in approx, mette il num piu grosso che riesce a metterci
        System.out.println(approx);
    }
}

/*

int x = 65; ->  [00000000][00000000][00000000][01000001]
byte y = (byte)x; ->  [01000001]

 */