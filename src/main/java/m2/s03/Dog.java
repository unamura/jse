package m2.s03;

import java.util.logging.Logger;

public class Dog {
    private static final Logger LOG = Logger.getGlobal();//stampo log a console

    private String name;
    //voglio aggiungere una proprietà per il padrone, ma ho gia un costruttore con stringa
    //private String owner;

    public Dog() {
        name = "No name";
        LOG.info("A new anonymous dog has been created");
    }

    // not a good parameter name, see "this"
    public Dog(String nm) {
        name = nm;
        LOG.info("A new dog named " + name + " has been created");
    }
    
//    public Dog(String ownerName) {
//        name = nm;
//        LOG.info("A new dog named " + name + " has been created");
//    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
