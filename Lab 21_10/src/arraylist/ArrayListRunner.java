package arraylist;

import java.util.ArrayList;

public class ArrayListRunner {
	
	// Use this class to run your code

	public static void main(String[] args) {
		
		testArrayList();
	}

	
	
	public static void testArrayList() {
		
		TrackedArrayList<String> words = new TrackedArrayList<String>();
		words.add ("a");
		words.maxSizeSoFar();
		System.out.println();
		words.add ("b");
		words.maxSizeSoFar();
		System.out.println();
		words.add ("c");
		words.maxSizeSoFar();
		System.out.println();
		words.remove ("b");
		words.maxSizeSoFar();
		System.out.println();
		words.add ("d");
		words.maxSizeSoFar();
		System.out.println();
		words.remove ("a");
		words.maxSizeSoFar();
		System.out.println();
		words.add ("e");
		words.maxSizeSoFar();
		System.out.println();
		words.remove ("b");
		words.maxSizeSoFar();
		System.out.println();
		words.add ("d");
		words.maxSizeSoFar();
		System.out.println();
		words.remove ("c");
		words.maxSizeSoFar();
		System.out.println();
		words.remove ("d");
		words.maxSizeSoFar();
		System.out.println();
		System.out.println(words.toString());
	}
	

}
