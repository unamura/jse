package m2.s13.ex;

// non ha niente a che vedere con i veicoli, ma miserve il condizionamento
import java.util.logging.Logger;

public class Flat implements Conditioning {
    private static final Logger LOG = Logger.getGlobal();

    @Override
    public void setTemperature(int newTemp) {
        LOG.info("new temperature is " + newTemp);
    }
}
