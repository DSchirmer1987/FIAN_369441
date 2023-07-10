package schneckenrennen;

import schneckenrennen.model.Rennen;
import schneckenrennen.model.Rennschnecke;
import schneckenrennen.model.Wettbuero;

public class AppSchneckenrennen {

	public static void main(String[] args) {
		Rennschnecke racer1 = new Rennschnecke("Max", "Weinberg", 25);
		Rennschnecke racer2 = new Rennschnecke("Olaf", "Nackt", 25);
		Rennschnecke racer3 = new Rennschnecke("Michel", "Koch", 25);
		
		Rennen race1 = new Rennen("Race 1", 2500);
		race1.addRennschnecke(racer1);
		race1.addRennschnecke(racer2);
		race1.addRennschnecke(racer3);

		Wettbuero wb = new Wettbuero(race1);
		wb.wetteAnnehmen("Max", 100, "Daniel");
		wb.rennenDurchfuehren();
	}

}
