package cc.comcave.Pizzeria.model;

public class Kunde {
	private Integer nummer;
	private String name;
	private String IBAN;
	private String BIC;
	private String strasse;
	private String plz;
	private String ort;
	private String land;
	
	public Kunde(Integer nummer, String name, String iBAN, String bIC, String strasse, String plz, String ort,
			String land) {
		super();
		this.nummer = nummer;
		this.name = name;
		IBAN = iBAN;
		BIC = bIC;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.land = land;
	}

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer(Integer nummer) {
		this.nummer = nummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getBIC() {
		return BIC;
	}

	public void setBIC(String bIC) {
		BIC = bIC;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	@Override
	public String toString() {
		return "Kunde [nummer=" + nummer + ", name=" + name + ", IBAN=" + IBAN + ", BIC=" + BIC + ", strasse=" + strasse
				+ ", plz=" + plz + ", ort=" + ort + ", land=" + land + "]";
	}
	
	
	
}
