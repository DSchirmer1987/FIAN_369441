package cc.comcave.Pizzeria.model;

import java.util.Random;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

public class Pizza {
	private Double preis;
	private Integer ID;
	private Integer groesse;
	private String name;
	
	public Pizza(Integer iD, Integer groesse, String name) {
		super();
		ID = iD;
		this.groesse = groesse;
		this.name = name;
		this.preis = RandomUtils.nextDouble(5.0, 12.01);
	}
	
	public void setName(String name) {
		if(StringUtils.isAlpha(name)) {
			this.name = name;
		} else {
			this.name = StringUtils.replaceChars(name, "123456789-.,#+", "");
		}
	}
	
	public String getName() {
		return this.name;
	}
}
