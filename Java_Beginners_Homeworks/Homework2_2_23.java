import java.util.Scanner;

public class Homework2_2_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double distance;
		double miles_x_galon;
		double galon_price;
		
	// User input
		System.out.println("Enter the driving distance: ");
		distance = input.nextDouble();
		
		System.out.println("Enter miles per galon: ");
		miles_x_galon = input.nextDouble();
		
		System.out.println("Enter price per galon: ");
		galon_price = input.nextDouble();
		
		input.close(); //Closing input
		
		double total = distance / miles_x_galon * galon_price;
		
		System.out.println(" The total cost of driving " + distance + " miles" +
		" in a car with fuel efficiency of" + miles_x_galon + " per galon" +
		" whit a price of " + galon_price + " per galon" + " is " + total);
		
	input.close(); //Closing input
		
	}

}
