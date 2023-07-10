package schneckenrennen.model;

public class Wette {
	private String spieler;
	private Integer wettEinsatz;
	private Rennschnecke rennschnecke;
	
	public Wette(Rennschnecke rennschnecke, Integer wettEinsatz, String spieler) {
		this.rennschnecke = rennschnecke;
		this.wettEinsatz = wettEinsatz;
		this.spieler = spieler;
	}
	
	public String getSpieler() {
		return this.spieler;
	}
	
	public Integer getWettEinsatz() {
		return this.wettEinsatz;
	}
	
	public Rennschnecke getRennschnecke() {
		return this.rennschnecke;
	}

	@Override
	public String toString() {
		return "Wette [spieler=" + spieler + ", wettEinsatz=" + wettEinsatz + ", rennschnecke=" + rennschnecke + "]";
	}
	
	
}
