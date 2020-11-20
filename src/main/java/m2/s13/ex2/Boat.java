package m2.s13.ex2;

import java.util.logging.Logger;

public class Boat extends Vehicle implements Navigate{
	private static final Logger LOG = Logger.getGlobal();
	
	@Override
	public void move (boolean right) {
		LOG.info("Moving a boat");
	}
}
