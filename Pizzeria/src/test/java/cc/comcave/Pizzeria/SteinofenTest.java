package cc.comcave.Pizzeria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import cc.comcave.Pizzeria.model.Steinofen;

public class SteinofenTest {
	private Steinofen steinofen;
	
	@BeforeEach
	public void init() {
		steinofen = Steinofen.getInstance();
	}
	
	@Test
	public void testSingleton() {
		assertEquals(1, Steinofen.getCount());
	}
	
	@RepeatedTest(10)
	public void testSingletonMulti() {
		steinofen = Steinofen.getInstance();
		assertEquals(1, Steinofen.getCount());
	}
	
	
}
