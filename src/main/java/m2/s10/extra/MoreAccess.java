package m2.s10.extra;

import m2.s10.Access;

public class MoreAccess extends Access{
	void f () {
		System.out.println(b);//è in una classe derivata, questa, posso accedere a b
		//System.out.println(a); // a non è visibile, o lo metto protetto p non posso accedere
		
		//questa classe non è nel package degli altri , non vede c, anche se statico
		//System.out.println(c);
	}
 
}
