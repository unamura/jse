package m1.s16;

public class SwitchString {
    public static void main(String[] args) {
        String value = "1";

        // ...

        switch (value) {
        case "1":
            System.out.println("value is one");
            break;
        case "2":
            System.out.println("value is two?");
            // !!! fall through !!!//Non c'è perche magari se c'è 2 voglio che faccia la domanda
            // !!! no break needed here !!!
        case "3":
            System.out.println("value is three?");//se c'è 3 li stampa tutti.
            break;
        default:
            System.out.println("value is neither one nor two");
            break;
        }
    }
}
