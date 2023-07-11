package cc.comcave.Pizzeria.model;

public enum Kueche {
	INSTANCE("", 5, Steinofen.getInstance());
	
	private String bezeichnung;
	private Integer anzahlKoeche;
	private Steinofen steinofen;

	Kueche(String string, int i, Steinofen instance2) {
		this.bezeichnung = string;
		this.anzahlKoeche = i;
		this.steinofen = instance2;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public Integer getAnzahlKoeche() {
		return anzahlKoeche;
	}

	public Steinofen getSteinofen() {
		return steinofen;
	}
	
	public String toString() {
		return "Kueche [Bezeichnung="+this.bezeichnung+" Anzahl Koeche="+this.anzahlKoeche+" Steinofen="+this.steinofen;
	}
}
