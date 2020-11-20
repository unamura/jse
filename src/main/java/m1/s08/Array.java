package m1.s08;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[12];
        array[0] = 7;// con questa notazione posso accede in lettura e scrittura

        System.out.println(array[0] + ", " + array[11]);

        int value = array[5];
        System.out.println(value);

//        value = array[12]; // exception, ci sono solo fino a 11 indici

        System.out.println("Done");
    }
}
