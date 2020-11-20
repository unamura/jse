package m2.s13.ex2;

import java.util.logging.Logger;

public class Car extends Vehicle implements Guide{
	private static final Logger LOG = Logger.getGlobal();
	
    @Override
    public void steer(boolean right) {
        LOG.info("Steer by car");
    }
	

}
