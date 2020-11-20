package m2.s16;

import java.util.logging.Logger;

public class Tail extends Object {// c'è scritto che extend Object, ma di solito non si scrive, è sottointeso
	private static final Logger LOG = Logger.getGlobal();
	private int size;

	public Tail(int size) {
		this.size = size;
	}

	public int getSize() {// metodo, chiamato getter. Metodi che accedono alla proprieta per accedervi al
						  // di fuori della classe, sono chiamati getter
		return size;
	}

	@Override
	public String toString() {
		return "Tail [size=" + size + "]";
	}

	public void wag() {
		LOG.info(toString());
	}
}
