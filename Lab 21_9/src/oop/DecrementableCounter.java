package oop;

public class DecrementableCounter extends Counter {

	public void decrement() {
		if (myCount != 0) {
			myCount--;
		}
	}
	
}
