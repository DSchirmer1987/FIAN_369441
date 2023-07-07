package schneckenrennen.model;

import java.math.BigInteger;
import java.util.Random;
import java.util.UUID;

public class Rennschnecke {
	private String name;
	private String rasse;
	private Integer maxG;
	private Integer distanz;
	private static Integer objCount = 0;
	private Integer id;
	
	public Rennschnecke(String name, String rasse, Integer MaxG) {
		this.name = name;
		this.rasse = rasse;
		this.maxG = MaxG;
		this.distanz = 0;
		this.id = objCount;
		objCount++;
	}
	
	public String getName() {
		return name;
	}

	public String getRasse() {
		return rasse;
	}

	public Integer getMaxG() {
		return maxG;
	}

	public Integer getDistanz() {
		return distanz;
	}

	public void krieche() {
		Random r = new Random();
		Integer speed = r.nextInt(this.maxG);
		while (speed <= 0) {
			speed = r.nextInt(this.maxG);
		}
		this.distanz += speed;
	}

	@Override
	public String toString() {
		return "Rennschnecke [name=" + name + ", rasse=" + rasse + ", maxG=" + maxG + ", distanz=" + distanz + "]";
	}
	
	
}
