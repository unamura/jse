package m1.s19;

public class Simple {
    static String h() {
        return "Hi";
    }

    int f(int a, int b) {
        return a * b;
    }
 //Non posso creare metodo con stessi tipi dentri
 // NON mi interessa neanche il return type
//    int f(int c, int ) {
//        return a * b;
//    }
    void f(double s, int b) {
        return ;
    }

    void g(boolean flag) {
        if (flag) {
            System.out.println("Hello");
            return;
        }

        System.out.println("Goodbye");
    }
}
// f g sono relativi all'istanza di Simple, non li posso richiamare senza istanza.'
// Se una classe non ha main non posso eseguirla. Posso eseguire method caller