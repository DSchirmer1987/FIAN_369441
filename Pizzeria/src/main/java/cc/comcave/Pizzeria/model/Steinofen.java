package cc.comcave.Pizzeria.model;

/***
 * 
 * @author Dozent
 *
 * Steinofen-Klasse als Singleton
 * 
 * Singleton-Pattern = Von einer Klasse KANN nur 1 Objekt existieren.
 * 
 */
public final class Steinofen {
	private String model;
	private static Integer count = 0;
	private Integer kapazitaet;
	private static Steinofen instance;
	
	private Steinofen() {
		this.kapazitaet = 5;
		this.model = "UltraPizza 9000";
		count++;
	}
	
	public static Steinofen getInstance() {
		if(instance == null) {
			instance = new Steinofen();
		}
		return instance;
	}
	
	/*
	 * destroy und reset weichen das Singleton-Pattern etwas auf.
	 */

	private static Boolean destroyInstance() {
		if(instance != null) {
			instance = null;
			return true;
		} else {
			return false;
		}
	}
	
	public static void reset() {
		if(destroyInstance()) {
			getInstance();
		}
	}

	public String getModel() {
		return model;
	}

	public static Integer getCount() {
		return count;
	}

	public Integer getKapazitaet() {
		return kapazitaet;
	}

	@Override
	public String toString() {
		return "Steinofen [model=" + model + ", kapazitaet=" + kapazitaet + "]";
	}
	
	
}
