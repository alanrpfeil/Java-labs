package io;

import java.util.*;
import java.io.*;

public class PhoneNums {

	public ArrayList<String> readPhoneNumbers() {

		String filename = "data/phone.txt"; 
		ArrayList<String> output = new ArrayList<String>();

		try {
			Scanner input = new Scanner ( new FileReader(filename) );

			while (input.hasNextLine()) {
				

				input.useDelimiter("-");
				input.useDelimiter("+");
				System.out.print("Country Code: ");
				System.out.println(input.next());
				System.out.print("Area Code: ");
				System.out.println(input.next());
				System.out.print("Phone Number: ");
				System.out.println(input.next());
				//System.out.println(input.nextLine()); // Comment this line out 
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return output;
		
	}
	
	

}
