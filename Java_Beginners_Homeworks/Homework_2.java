import java.util.Scanner;

public class Homework_2 {

	public static void main(String[] args) {

	// Prompt the user for input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 1000:");
		int	integer = input.nextInt();

		System.out.println("The integer that you typed was " + integer);
		
		int ones = integer % 10;				    // find ones by reminder
		int tens = (integer / 10) % 10; 	     	// find tens by reminder
		int hundreds = (integer /100) %10;		    // find hundreds by reminder
		int answer = ones + tens + hundreds;
		
		System.out.print(" The sum of the digit is " + answer);
	
		input.close(); //Closing input
	}

}
