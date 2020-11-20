package m1.s23;

public class AboutMath {
    public static void main(String[] args) {
        System.out.println("E is " + Math.E);
        System.out.println("PI is " + Math.PI);
        
        System.out.println("abs: " + Math.abs(-13.4));
        System.out.println("ceil: " + Math.ceil(23.1));//come floor?
        System.out.println("cos: " + Math.cos(2 * Math.PI));
        System.out.println("exp: " + Math.exp(Math.PI));//2exp PI
        System.out.println("floor: " + Math.floor(23.9));//riporto float all'int. Elimina parte frazionaria
        System.out.println("log: " + Math.log(Math.E));
        System.out.println("max: " + Math.max(2.3001, 2.30001));//tprna il + grande
        System.out.println("min: " + Math.min(2.3001, 2.30001));
        System.out.println("pow: " + Math.pow(2, 3));//2^3
        System.out.println("random: " + Math.random());//genera num casuale, ta 0.0 e 1.0. Pseudo casuale
        System.out.println("round: " + Math.round(2.4999));//arrotonda all'int
        System.out.println("square root: " + Math.sqrt(121));
        System.out.println("to degrees: " + Math.toDegrees(Math.PI));
        System.out.println("to radians: " + Math.toRadians(180));
    }
}
//Se interessa libreria + matematica, Apache CommonsMath https://commons.apache.org/proper/commons-math/