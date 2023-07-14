package cc.comcave.VRRTicketautomat.model;

public enum Geld {
	Ein_Cent(1), 
	Zwei_Cent(2), 
	Fuenf_Cent(5), 
	Zehn_Cent(10), 
	Zwanzig_Cent(20), 
	Fuenfzig_Cent(50), 
	Ein_Euro(100), 
	Zwei_Euro(200),
	Fuenf_Euro(500), 
	Zehn_Euro(1000), 
	Zwanzig_Euro(2000);
	
	private final int wert;
	
	Geld(int i) {
		this.wert = i;
	}
	
	public int getWert() {
		return this.wert;
	}

	public static Geld findByValue(Integer value) {
		Geld result = null;
		for (Geld geld : values()) {
			if(geld.getWert() == value) {
				result = geld;
			}
		}
		return result;
	}
	

}
