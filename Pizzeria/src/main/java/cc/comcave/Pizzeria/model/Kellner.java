package cc.comcave.Pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString @EqualsAndHashCode
public class Kellner {
	private Integer nummer;
	private String name;
	private Double gehalt;
	private String strasse;
	private String plz;
	private String ort;
	private String steuernummer;
	
	public void setOrt(String ort) {
		
	}
}
