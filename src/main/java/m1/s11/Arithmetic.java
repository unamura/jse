package m1.s11;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

//        System.out.println(a / 0); // ArithmeticException

        double c = 3.0;

        System.out.println(a + c); // 13.0
        System.out.println(a / c); // 3.3333333333333335
        System.out.println(a % c); // 1.0

        System.out.println(c - 2.1); // 0.8999999999999999
        System.out.println(c / 0); // Infinity

        int alpha = 2;

        alpha += 8; // 10 // alpha = alpha + 8
        System.out.println(alpha);

        alpha -= 3; // 7
        System.out.println(alpha);

        alpha *= 2; // 14
        System.out.println(alpha);

        alpha /= 2; // 7
        System.out.println(alpha);

        alpha %= 5; // 2
        System.out.println(alpha);
    }
}
