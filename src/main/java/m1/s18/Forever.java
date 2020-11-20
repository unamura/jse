package m1.s18;

public class Forever {
    public static void main(String[] args) {
        boolean something = false;

        for (;;) {//potrei anche scrivere for (true), while(true)
            System.out.println("something is " + something);

            if (something) {
                break;//rompe esecuz del for più vicino
            }

            something = true;
        }
    }
}
/* Se faccio   while (true) {
*                    for (;;) {
*                        }
*                    }
* Il break rompe solo il for e non il while che fara fare il for all infinito
*  Attenzione
*/