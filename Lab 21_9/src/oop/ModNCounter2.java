package oop;

public class ModNCounter2 extends Counter {
	
	int cycleLength = 0;
	
	public ModNCounter2 (int n) { 
    	cycleLength = n; 
    }  
	
    public int value() {
    	return myCount;
    }
    
    public void works() {
    	System.out.println("ModNCounter2 is up and running!");
    }
    
}
