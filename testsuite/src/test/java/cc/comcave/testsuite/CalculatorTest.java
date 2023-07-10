package cc.comcave.testsuite;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import cc.comcave.testsuite.model.Calculator;
import cc.comcave.testsuite.model.Primes;

@TestMethodOrder(OrderAnnotation.class)
public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	@Order(1)
	@DisplayName("Number one should work fine")
	public void testNumberOne() {
		assertEquals(5, calculator.getNumberOne());
	}
	
	@Test
	@Order(2)
	public void testNumberTwo() {
		assertEquals(5, calculator.getNumberTwo());
	}
	
	@Test
	@Order(3)
	public void testMultiply() {
		calculator.multiply();
		assertEquals(25, calculator.getResult());
	}
	
	@RepeatedTest(5)
	public void testMultiplyWithZero() {
		calculator.multiply(0, 5);
		assertEquals(0, calculator.getResult(), "Multiply with Zero should be Zero");
		calculator.multiply(5, 0);
		assertEquals(0, calculator.getResult(), "Multiply with Zero should be Zero");
	}
	
	@Test
	public void testAttributes() {
		assertAll("Calculator Attributes", 
				() -> assertEquals(5, calculator.getNumberOne()),
				() -> assertEquals(5, calculator.getNumberTwo()),
				() -> assertEquals(0, calculator.getResult())
		);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	public void valueTest(Integer args) {
		calculator.multiply(0, args);
		assertEquals(0, calculator.getResult());
	}
	
	private static Integer[] getRandomNumbers() {
		Integer[] randoms = new Integer[5];
		for(int i = 0; i < randoms.length; i++) {
			randoms[i] = new Random().nextInt(50);
		}
		return randoms;
	}
	
	@ParameterizedTest(name = "Test with Int: {0}")
	@MethodSource("getRandomNumbers")
	public void testWithRandoms(Integer data) {
		calculator.multiply(0, data);
		assertEquals(0, calculator.getResult());
	}
	
	@ParameterizedTest
	@EnumSource(Primes.class)
	public void testWithEnum(Primes prime) {
		calculator.multiply(0, prime.getValue());
		assertEquals(0, calculator.getResult());
	}
	
	@ParameterizedTest
	@EnumSource(value = Primes.class, mode = EXCLUDE, names = {"THREE", "FIVE"})
	public void testWithExlusion(Primes prime) {
		calculator.multiply(0, prime.getValue());
		assertEquals(0, calculator.getResult());
	}
	
	private static Arguments[] getValues(){
		Arguments[] argsArray = new Arguments[5];
		for (int i = 0; i < argsArray.length; i++) {
			argsArray[i] = Arguments.arguments((new Random().nextInt(100)) + 1, 2);
		}
		return argsArray;
	}
	
	@ParameterizedTest
	@MethodSource("getValues")
	public void testWithMoreRandoms(Integer a, Integer b) {
		calculator.multiply(a, b);
		assertTrue(calculator.getResult() % 2 == 0);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/CalculatorCSV.csv")
	public void testWithCSV(Integer a, Integer b, Integer result) {
		calculator.multiply(a, b);
		assertEquals(result, calculator.getResult());
	}
	
	@Test
	public void testSub() {
		calculator.sub(10, 5);
		assertEquals(5 , calculator.getResult());
	}
	
	@Test
	public void testDivide() {
		assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
		assertEquals(0, calculator.getResult());
	}
}
