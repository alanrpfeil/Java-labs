import java.util.Scanner;
public class remainderFunc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max, divisor;
		System.out.print("Please enter the max number: ");
		max = input.nextInt();
		
		System.out.print("Please enter the divisor: ");
		divisor = input.nextInt();
		
		int i, answer = 0;
		for(i = 1; i <= max; i++) {
			answer = i % divisor;
			System.out.println("Num: " + i + " % " + divisor + " = " + answer);
		}

	}

}
