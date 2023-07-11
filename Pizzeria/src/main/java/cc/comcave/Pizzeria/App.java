package cc.comcave.Pizzeria;

import cc.comcave.Pizzeria.model.Koch;
import cc.comcave.Pizzeria.model.Restaurant;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Restaurant r = new Restaurant("Pizza ", "Berlin");
		
		Koch k1 = Koch.createKoch("Norbert", "Hiller", 50.0);
		Koch k2 = Koch.createKoch("Narbert", "Hiller", 50.0);
		Koch k3 = Koch.createKoch("Nirbert", "Hiller", 50.0);
		Koch k4 = Koch.createKoch("Nurbert", "Hiller", 50.0);
		
		r.kochEinstellen(k1);
		r.kochEinstellen(k2);
		r.kochEinstellen(k3);
		r.kochEinstellen(k4);
		
//		Koch[] koeche = new Koch[] {k1, k2, k3, k4};
//		r.kochEinstellen(koeche);
		
		r.kochEinstellen(k1, k2, k3, k4);
		System.out.println(r.getKoeche());
		
		r.kochEinstellen("Hallo", k1, "Welt");
	}
}
