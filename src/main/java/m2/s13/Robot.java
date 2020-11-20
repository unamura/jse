package m2.s13;

//implemento due interfacce
public class Robot implements Barker, Jumper{
    @Override
    public String bark() {
        return "B-A-R-K";
    }

	@Override
	public void Jump() {//ha un body che non fa nulla
		// ho dovuto creare questo per implementare Jumper
		
	}
}
