package cc.comcave.Pizzeria.model;

import lombok.Data;

@Data
public class Besitzer {
	private String name;
	private String telefon;
	private String strasse;
	private String plz;
	private String ort;
	
//	public void sageZahl(Integer zahl) {
//		System.out.println(zahl + " Integer ");
//	}
//	
//	public void sageZahl(Double zahl) {
//		System.out.println(zahl + " Double ");
//	}
	
	public void sageZahl(Number zahl) {
		System.out.println(zahl + zahl.getClass().getSimpleName());
	}
}
