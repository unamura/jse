package m2.s08;

public class Initialize {
	//se non metto inizializz, ci pensa lui a mettere dentro delle cose
	private int i; // 0
	private boolean flag; // false
	private String t; // null

	public void f() {
		// devo inzializzare le variabili prima di usarle
		int i = 42;
		int j; // commenta questo
		String s = new String("Hello");

		System.out.println(s + i);

//        System.out.println(j); // error: variable j might not have been initialized
		j = i / 2; // int j = i / 2;
		System.out.println(j);
	}

	public void g() {
		System.out.println(t + ", " + i + ", " + flag);
	}
}
