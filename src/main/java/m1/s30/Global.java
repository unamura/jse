package m1.s30;

import java.util.logging.Logger;

public class Global {
	//global, è logger molto facile permette di saltare certi passaggi.
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {//posso loggare solo da info in avanti però
        LOG.info("Hello");
    }
}
//Il log in uscita è meno bello, lo mette su più righe invece che una sola.
