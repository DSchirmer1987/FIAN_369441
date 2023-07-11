package cc.comcave.Pizzeria.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
	private String name;
	private String ort;
	private Kueche kueche;
	private ArrayList<Koch> koeche;
	
	public Restaurant(String name, String ort) {
		super();
		this.name = name;
		this.ort = ort;
		this.kueche = Kueche.INSTANCE;
		this.koeche = new ArrayList<Koch>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public ArrayList<Koch> getKoeche() {
		return koeche;
	}

	public void setKoeche(ArrayList<Koch> koeche) {
		this.koeche = koeche;
	}

	public Kueche getKueche() {
		return kueche;
	}
	
	public void kochEinstellen(Koch koch) {
		this.koeche.add(koch);
	}
	
//	public void kochEinstellen(Koch[] koeche) {
//		this.koeche.addAll(Arrays.asList(koeche));
//	}
	
	public void kochEinstellen(ArrayList<Koch> koeche) {
		this.koeche.addAll(koeche);
	}
	
	public void kochEinstellen(Koch...koeche) {
		this.koeche.addAll(Arrays.asList(koeche));
	}
	
	public void kochEinstellen(String message, Koch...koeche) {
		
	}
	
	public void kochEinstellen(Object...objects) {
		for (Object object : objects) {
			if(object instanceof String) {
				System.out.println(object);
			} else {
				System.out.println("Kein String");
			}
		}
	}
	
}
