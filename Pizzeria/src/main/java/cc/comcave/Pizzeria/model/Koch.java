package cc.comcave.Pizzeria.model;
/***
 * 
 * @author Dozent
 * 
 * Koch-Klasse als Builder-Pattern
 * 
 * Builder-Pattern = Besitzt Methoden um Instanzen der Klasse zu erzeugen
 *
 */
public class Koch {
	private Integer ID;
	private String vorname;
	private String nachname;
	private Double gehalt;

	private Koch(Integer ID, String vorname, String nachname, Double gehalt) {
		this.ID = ID;
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Double getGehalt() {
		return gehalt;
	}

	public void setGehalt(Double gehalt) {
		this.gehalt = gehalt;
	}

	public static Koch createKoch(String vorname, String nachname, Double gehalt) {
		return new Koch(0, vorname, nachname, gehalt);
	}

	public static Koch loadKoach(Integer id, String vorname, String nachname, Double gehalt) {
		return new Koch(id, vorname, nachname, gehalt);
	}
}
