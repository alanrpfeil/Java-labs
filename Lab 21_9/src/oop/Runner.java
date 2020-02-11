package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();
		
		testCounter7Statements();

		testModNCounter();
		
		testModNCounter2();
		
	}

	public static void testModNCounter2() {
		ModNCounter2 myN2 = new ModNCounter2(2);
		System.out.println("-- testing ModNCounter2");
		System.out.println (myN2.value ( ));
		myN2.increment();
		System.out.println (myN2.value ( ));
		myN2.reset();
		System.out.println (myN2.value ( ));
		myN2.works();
	}
	
	public static void testModNCounter() {
		System.out.println("-- testing ModNCounter");
		ModNCounter myN = new ModNCounter(2);
		System.out.println (myN.value ( )); 
		myN.increment ( );
		System.out.println (myN.value ( ));
		myN.increment ( );
		System.out.println (myN.value ( ));
		myN.increment ( );
		
	}
	
	public static void testCounter() {
		System.out.println("-- testing Counter");

		Counter c = new Counter();
		c.increment();
		c.increment();
		c.increment();
		System.out.println(c.value());

	}

	
	// Use this method to complete exercise 1c
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- testing 7 statements");
		c.increment();
		c.increment();
		c.increment();
		c.reset();
		c.increment();
		c.increment();
		c.increment();

		System.out.println("current value: " + c.value());
	}

}
