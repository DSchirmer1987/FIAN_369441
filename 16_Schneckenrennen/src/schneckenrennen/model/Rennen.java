package schneckenrennen.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Rennen {
	private String name;
	private Integer anzahlSchnecken;
	private ArrayList<Rennschnecke> teilnehmer;
	private Integer renndistanz;
	
	public Rennen(String name, Integer rennDistanz) {
		this.name = name;
		this.anzahlSchnecken = 0;
		this.teilnehmer = new ArrayList<Rennschnecke>();
		this.renndistanz = rennDistanz;
	}
	
	public String getName() {
		return name;
	}

	public Integer getAnzahlSchnecken() {
		return anzahlSchnecken;
	}

	public ArrayList<Rennschnecke> getTeilnehmer() {
		return teilnehmer;
	}

	@Override
	public String toString() {
		return "Rennen [name=" + name + ", anzahlSchnecken=" + anzahlSchnecken + ", teilnehmer=" + teilnehmer + "]";
	}

	public void addRennschnecke(Rennschnecke neueSchnecke) {
		this.teilnehmer.add(neueSchnecke);
		this.anzahlSchnecken++;
	}
	
	public void removeRennschnecke(String name) {
		for (Rennschnecke rennschnecke : new ArrayList<Rennschnecke>(teilnehmer)) {
			if(rennschnecke.getName().equals(name)) {
				teilnehmer.remove(teilnehmer.indexOf(rennschnecke));
				anzahlSchnecken--;
			}
		}		
	}
	
	public Rennschnecke ermittleGewinner() {
		for (Rennschnecke rennschnecke : teilnehmer) {
			if(rennschnecke.getDistanz() >= this.renndistanz) {
				return rennschnecke;
			}
		}
		return null;
	}
	
	public void lasseSchneckenKriechen() {
		for (Rennschnecke rennschnecke : teilnehmer) {
			rennschnecke.krieche();
		}
	}
	
	public void durchfuehren() {
		while(this.ermittleGewinner() == null) {
			this.lasseSchneckenKriechen();
		}
	}
	
	
}
