import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Create a Scanner
		System.out.print("\n Enter a letter between A and Z: "); 	// Prompt the user to enter a phone number as a string
		
		String userInput = input.nextLine(); // gets the entire line
		char ch = userInput.charAt(0);
		ch = Character.toUpperCase(ch);
		int number = 0; 
	
		 if (Character.isLetter(ch)) 
		 {
			 if (ch >= 'W') 
				 number = 9;			
			 	else if (ch >= 'T')
					number = 8;
				else if (ch >= 'P')
					number = 7;
				else if (ch >= 'M')
					number = 6;
				else if (ch >= 'J')
					number = 5;
				else if (ch >= 'G')
					number = 4;
				else if (ch >= 'D')
					number = 3;
				else if (ch >= 'A')
					number = 2; 
			 	System.out.println("The corresponding number is " + number);
		}
		else
				System.out.println(ch + " is an invalid input, \n Try again. \n \n The input must be a Letter between A and Z.");
	input.close(); 
		}
}
