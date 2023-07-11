package cc.comcave.Pizzeria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cc.comcave.Pizzeria.model.Kueche;

public class KuecheTest {
	private Kueche kueche;
	
	@BeforeEach
	public void init() {
		this.kueche = Kueche.INSTANCE;
	}
	
	@Test
	public void testKueche() {
		assertEquals(1, kueche.getSteinofen().getCount());
	}
}
