package cc.comcave.Pizzeria;

import cc.comcave.Pizzeria.model.Besitzer;
import cc.comcave.Pizzeria.model.Kellner;
import cc.comcave.Pizzeria.model.Koch;
import cc.comcave.Pizzeria.model.Pizza;
import cc.comcave.Pizzeria.model.Restaurant;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		Restaurant r = new Restaurant("Pizza ", "Berlin");
//		
//		Koch k1 = Koch.createKoch("Norbert", "Hiller", 50.0);
//		Koch k2 = Koch.createKoch("Narbert", "Hiller", 50.0);
//		Koch k3 = Koch.createKoch("Nirbert", "Hiller", 50.0);
//		Koch k4 = Koch.createKoch("Nurbert", "Hiller", 50.0);
//		
//		r.kochEinstellen(k1);
//		r.kochEinstellen(k2);
//		r.kochEinstellen(k3);
//		r.kochEinstellen(k4);
//		
////		Koch[] koeche = new Koch[] {k1, k2, k3, k4};
////		r.kochEinstellen(koeche);
//		
//		r.kochEinstellen(k1, k2, k3, k4);
//		System.out.println(r.getKoeche());
//		
//		r.kochEinstellen("Hallo", k1, "Welt");
		
//		Pizza p = new Pizza(11, 12, "Pizza");
//		p.setName("1337-Pizza");
//		System.out.println(p.getName());
		
//		Kellner k = new Kellner(null, null, null, null, null, null, null);
//		Kellner k2 = new Kellner(null, null, null, null, null, null, null);
//		k.setName("Peter");
//		k2.setName("Peter");
//		System.out.println(k);
//		System.out.println(k2);
//		System.out.println(k.equals(k2));
//		
//		Besitzer b = new Besitzer();
//		b.setName("Norbert");
		
//		Restaurant r = new Restaurant("Pizza 42", "Berlin");
//		Koch k1 = Koch.createKoch("Norbert", "Hiller", 50.0);
//		r.kochEinstellen(k1);
//		k1 = null;
//		r.kochEinstellen(k1);
//		System.out.println(r);
		
		
		Besitzer b = new Besitzer();
		b.sageZahl(5);
		b.sageZahl(5.6);
	}
}
