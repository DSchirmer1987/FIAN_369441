package cc.comcave.testsuite.model;

public class Calculator {
	private Integer numberOne;
	private Integer numberTwo;
	private Integer result;
	
	public Calculator() {
		this.numberOne = 5;
		this.numberTwo = 5;
		this.result = 0;
	}
	
	public Calculator(Integer a, Integer b) {
		this.numberOne = a;
		this.numberTwo = b;
		this.result = 0;
	}
	
	public Integer getNumberOne() {
		return numberOne;
	}

	public Integer getNumberTwo() {
		return numberTwo;
	}

	public Integer getResult() {
		return result;
	}

	public void multiply() {
		this.result = this.numberOne * this.numberTwo;
	}
	
	public void multiply(Integer a, Integer b) {
		this.result = a * b;
	}
	
	public void add(){
		this.result = this.numberOne + this.numberTwo;
	}

	public void sub(Integer a, Integer b) {
		this.result = a - b;
	}
	
	public void divide(Integer a, Integer b) {
		this.result = a / b;
	}
}
