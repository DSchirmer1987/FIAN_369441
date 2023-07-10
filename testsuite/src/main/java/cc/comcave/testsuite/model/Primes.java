package cc.comcave.testsuite.model;

public enum Primes {
	ONE(1),
	TWO(2), 
	THREE(3), 
	FIVE(5),
	SEVEN(7);
	
	private Integer value;
	
	Primes(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return this.value;
	}
}
