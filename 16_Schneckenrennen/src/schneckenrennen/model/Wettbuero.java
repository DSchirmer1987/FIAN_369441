package schneckenrennen.model;

import java.util.ArrayList;
import java.util.Random;

public class Wettbuero {
	private Rennen rennen;
	private ArrayList<Wette> wetten;
	private Integer faktor;
	
	public Wettbuero(Rennen rennen) {
		this.rennen = rennen;
		this.wetten = new ArrayList<Wette>();
		this.faktor = (new Random().nextInt(25) + 1 );
	}
	
	public boolean wetteAnnehmen(String schneckenName, Integer wettEinsatz, String spieler) {
		for(Rennschnecke r : this.rennen.getTeilnehmer()) {
			if(schneckenName.equals(r.getName())){
				this.wetten.add(new Wette(r, wettEinsatz, spieler));
				return true;
			}
		}
		return false;
	}
	
	public void rennenDurchfuehren() {
		this.rennen.durchfuehren();
		System.out.println("Gewinner ist: " + this.rennen.ermittleGewinner());
		System.out.println(this.gewinnErmitteln());
	}
	
	private String gewinnErmitteln() {
		for(Wette w : this.wetten) {
			if(this.rennen.ermittleGewinner() == w.getRennschnecke()) {
				return "Die Wette wurde gewonnen von: " + w.getSpieler() + " mit einem Gewinn von: " + (w.getWettEinsatz() * this.faktor);
			}
		}
		return "";
	}
}
