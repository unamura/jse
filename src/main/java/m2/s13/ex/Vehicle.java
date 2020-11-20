package m2.s13.ex;

import java.util.logging.Logger;

public class Vehicle {
    private static final Logger LOG = Logger.getGlobal();

    public void steer(boolean right) {//qua definisco il metodo per la prima volta
        LOG.info("Steering " + (right ? "right" : "left"));
    }

    public void brake() {//qui è davvero una definizione, che esiste nella classe madre, vehicle
        LOG.info("Braking");
    }
}
