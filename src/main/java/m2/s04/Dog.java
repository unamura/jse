package m2.s04;

import java.util.logging.Logger;

public class Dog {
    private static final Logger LOG = Logger.getGlobal();

    private String name;//se mettessi static sarebbe come dire che il nome è relativo a tiutti i cani, alla classe

    // not a good parameter name, see "this"
    private Dog(String nm) {
        name = nm;
        LOG.info(String.format("A new dog has been created with name [%s]", name));
    }

    public static Dog createWithNoName() {
        /*
         * 1. fetch images for components a: nose b: tail c: ... 2. goto database for
         * info on dog breed ...
         */

        return new Dog("No name");
    }

    public static Dog createWithName(String name) {
        return new Dog(name);
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
