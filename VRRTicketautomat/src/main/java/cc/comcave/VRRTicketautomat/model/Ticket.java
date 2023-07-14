package cc.comcave.VRRTicketautomat.model;

public enum Ticket {
	A("A", 230),
	B("B", 470),
	C("C", 960),
	D("D", 1140),
	K("K", 140);
	
	private String preisstufe;
	private Integer preis;
	
	Ticket(String preisstufe, Integer preis){
		this.preisstufe = preisstufe;
		this.preis = preis;
	}

	public String getPreisstufe() {
		return preisstufe;
	}

	public Integer getPreis() {
		return preis;
	}
	
	public String toString() {
		return "Ticket: " + this.preisstufe + " Preis: " + this.preis;
	}
}
