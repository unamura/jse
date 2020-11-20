package m1.s29;

import java.util.logging.Logger;

//non c'è main per eseguirlo
public class Simple {
	//creo oggetto logger, creo metodi, da riga 12
    private static final Logger LOG = Logger.getLogger(Simple.class.getName());

    public void f() {
        System.out.println("simple");//mess all'utente, poco senso in realtà

        //voglio loggare con severità diversa
        LOG.finest("finest message");//messaggio molto comune ma non interessante
        LOG.finer("finer message");
        LOG.fine("fine message");
        LOG.config("config message");
        LOG.info("info message");//mess particolare, che voglio tracciare
        LOG.warning("warning message");//c'è possibile probl
        LOG.severe("severe message");//catastrofe
    }
}
