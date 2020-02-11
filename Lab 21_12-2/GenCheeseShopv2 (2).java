import java.util.Random;
import java.util.Scanner;
public class GenCheeseShopv2 {

	public static void intro(String[] names, double[]prices, int[] amounts) {
		Random ranGen = new Random(100);
		
		if (names.length > 0) {
		names[0] = "Dalaran Sharp"; prices[0] = 1.25;
		} if (names.length > 1) {
		names[1] = "Stormwind Brie"; prices[1] = 10.00;
		} if (names.length > 2) {
		names[2] = "Alterac Swiss"; prices[2] = 40.00;
		}
		
		for (int i = 3; i < names.length; i++) {
		names[i] = "Cheese Type " + (char)('A'+i); prices[i] = ranGen.nextInt(1000)/100.0; amounts[i] = 0;
		}
		
		System.out.println("We sell " + amounts.length + " kinds of cheese");
		for (int i = 0; i < prices.length; i++) {
			System.out.println(names[i] + ": " + prices[i] + " per pound.");
		}
	}

	public static void getAmount(Scanner input, String[] names, int[] amounts) {
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the amount of " + names[i]);
			amounts[i] = input.nextInt();
		}
	}

	public static void itemizedList(String[] names, double[]prices, int[] amounts) {
		for (int i = 0; i < prices.length; i++) {
			if (amounts[i] >= 1) {
			System.out.println(amounts[i] + " lbs of " + names[i] + " @ " + prices[i] + " = $" + (amounts[i] * prices[i]));
			}
		}
	}

	public static double calcSubTotal(double[] prices, int[] amounts) {
			double subTotal = 0;
			for (int i = 0; i < amounts.length; i++) {
				subTotal += (prices[i] * amounts[i]);
			}
		return subTotal;
	}

	public static int discount(double subTotal){
		int discount = 0;
		if (subTotal >= 100) {
			discount = 25;
		}
		else if (subTotal >= 50) {
			discount = 10;
		}
		return discount;
	}

	public static void printTotal(double subTotal, int discount) {
		System.out.println("Sub Total: $" + subTotal);
		System.out.println("-Discount : $" + (double)discount);
		System.out.println("Total : $" + (subTotal - discount));
	}

	public static void main(String[] args) {

		final int MAXCHEESE = 4;

		// DO NOT CHANGE ANYTHING BELOW
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		Scanner input = new Scanner(System.in);

		intro(names, prices, amounts);

		getAmount(input, names, amounts);

		double total = calcSubTotal(prices, amounts);
		
		if (MAXCHEESE > 0) {
			System.out.print("Display the itemized list? (1 for yes) ");
			int itemized = input.nextInt();

			if (itemized == 1) {
				itemizedList(names, prices, amounts);
			}
		}

		System.out.println();

		printTotal(total,discount(total));
	}
}