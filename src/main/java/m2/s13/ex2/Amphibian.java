package m2.s13.ex2;

import java.util.logging.Logger;

//vogli omezzo anfibio che vada su strada e mare
public class Amphibian extends Vehicle implements Guide, Navigate {
	private static final Logger LOG = Logger.getGlobal();
	
    @Override
    public void steer(boolean right) {
        LOG.info("Steer by amphibian");
    }
    
    @Override
	public void move (boolean right) {
		LOG.info("Moving a amphibian");
	}

}
