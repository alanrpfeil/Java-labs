import java.util.Scanner;

public class AnyAverageArr {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("This program will find the average of any numbers Please choose amount of numbers to average");

	int max = in.nextInt();
	int i = 0;
	int [] arr1 = new int[max];
	int currentCount = 0;
	
	while (i < max) {
		System.out.println("Please enter " + i + " number:");
		arr1 [i] = in.nextInt();
		currentCount += i;
		i++;
		}
	
	System.out.println("Numbers averaged:");
	for (i = 0; i <= max; i++) {
		if ((i+1) % 5 == 0) {
			System.out.println(arr1 [i-4] + " " + arr1 [i-3] + " " + arr1 [i-2] + " " + arr1 [i-1] + " " + arr1 [i]);
		}
	}
	
	int average = currentCount / max;
	
	System.out.println("Average of all numbers is: " + average);
	
	}
}
