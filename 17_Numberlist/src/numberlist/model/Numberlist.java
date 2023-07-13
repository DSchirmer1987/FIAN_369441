package numberlist.model;

import java.util.Arrays;
import java.util.Iterator;

public class Numberlist implements Iterable<Number>{
	private Integer size;
	private Number[] elements;
	private Double price;

	public Double getPrice(){
		return this.price;
	}

	public void setPrice(Double price){
		this.price = price;
	}
	
	public Numberlist() {
		this.size = 0;
		this.elements = new Number[this.size];
	}
	
	public Integer getSize() {
		return this.size;
	}
	
	public Number get(Integer index) {
		if(index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		return this.elements[index];
	}
	
	public void add(Number n) {
		this.size++;
		this.elements = Arrays.copyOf(this.elements, this.size);
		this.elements[this.size - 1] = n;
	}
	
	public void remove(Integer index) {
		if(index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		this.elements[index] = null;
		this.size--;
		Number[] newElements = new Number[this.size];
		Integer counter = 0;
		for(int i = 0; i < this.elements.length; i++) {
			if(this.elements[i] != null) {
				newElements[counter] = this.elements[i];
				counter++;
			}
		}
		this.elements = newElements;
 	}

	@Override
	public String toString() {
		return "Numberlist [size=" + size + ", elements=" + Arrays.toString(elements) + "]";
	}

	@Override
	public Iterator<Number> iterator() {
		Iterator<Number> it = new Iterator<Number>() {
			private Integer currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				return currentIndex < size && elements[currentIndex] != null;
			}

			@Override
			public Number next() {
				return elements[currentIndex++];
			}
		};
		return it;
	}
	
	
}
