package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void Menu(){	

		//creating menu for the user, Only printing lines
		System.out.println("Welcome to <Christian Vargas>'s Calculator");
		System.out.println("\n1. Addition.");
		System.out.println("2. Substraction.");
		System.out.println("3. Multiplication.");
		System.out.println("4. Division.");
		System.out.println("5. Exit.");
	}

	public static int getUserChoice(Scanner readInput){
		int inputInt; //creating variable 
		
		do{// loop until we got the OK input.
			//print line for getting input from the user 
			System.out.println("\nPlease enter a number between [1/2/3/4/5] to continue : ");
			try{
				//checking user input
				inputInt = readInput.nextInt();
				if ( inputInt >= 1 && inputInt <= 5){
					break; //users choice correct got it
				}else {
					System.out .println("You have not entered a number between 1 and 5. Try again!");
					continue;
					//continue looping if its a wrong number 
				}
			}catch (final InputMismatchException e) {
				System.out .println("You have entered an invalid choice. Try Again!\n");
				Menu(); //print again the user menu if user input was not good.
				readInput.nextLine();
				continue;
			}			
		}while(true);
		return inputInt;
	}
	
	public static float[] getTwoFloats(float[] myFloats, Scanner readInput, int userChoice){
		
		float userNumber1 = 0;
		float userNumber2 = 0;
		boolean booleanError = true;
		System.out.print("\nEnter two floats separated by a space: ");
		
		do { // Loop until we have correct input
			try {
				userNumber1 = readInput.nextFloat(); // wait for user input
				userNumber2 = readInput.nextFloat();
				if (userChoice==4 && userNumber2==0) {
					System.out.println("\nYou can't devide by zero");
					System.out.println("\nEnter two floats separated by a space: ");
				}else{
					booleanError = false;
				}
			}catch (final InputMismatchException e) {
				System.out.println("\nInvalid input. Try again.");
				System.out.println("\nEnter two floats separated by a space: ");
			} 
			readInput.nextLine();
			
		}while (booleanError);
		
		myFloats[0] = userNumber1;
        myFloats[1] = userNumber2;

        return myFloats;
	}
	
	
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
	
		int userChoice; 					//creating variables for the main method
		float [] myFloats = new float[2]; 	//creating variables for the main method
		
		do{

			Menu();								//print the menu
			userChoice = getUserChoice(sc);		//calling getUSerChoice method to save it in a variable
			System.out .printf("\nYou entered a valid choice\n",userChoice);		
		
			switch (userChoice){				//switch statement and testing the cases
				case 1:
					getTwoFloats(myFloats, sc, userChoice);	//calling the method getTwoFloats 
					float totalAddition = myFloats[0] + myFloats[1];
					String totalAdditionAsString = String.format ("%.2f", totalAddition);	//formating the float numbers with 2 decimal points
					System.out.println("\nThe addition between " + myFloats[0] + " and " + myFloats[1] + " is " + totalAdditionAsString);
					System.out.println();		//print a blank line
					break;				
				
				case 2:
					getTwoFloats(myFloats, sc, userChoice);
					float totalSubtraction = myFloats[0] - myFloats[1];
					String totalSubtractionAsString = String.format ("%.2f", totalSubtraction);
					System.out.println("\nThe subtraction between " + myFloats[0] + " and " + myFloats[1] + " is " + totalSubtractionAsString);
					System.out.println();
					break;
				
				case 3:
					getTwoFloats(myFloats, sc, userChoice);
					float totalMultiplication = myFloats[0] * myFloats[1];
					String totalMultiplicationAsString = String.format ("%.2f", totalMultiplication);
					System.out.println("\nThe multiplication between " + myFloats[0] + " and " + myFloats[1] + " is " + totalMultiplicationAsString);
					System.out.println();
					break;
					
				case 4:
					getTwoFloats(myFloats, sc, userChoice);
					float totalDivision = myFloats[0] / myFloats[1];
					String totalDivisionAsString = String.format ("%.2f", totalDivision);
					System.out.println("\nThe division between " + myFloats[0] + " and " + myFloats[1] + " is " + totalDivisionAsString);
					System.out.println();
					break;
				
				case 5:
					System.out.println("Thank you. \nGood Bye.");
					System.out.println();
					break;
			}
		}while(userChoice != 5);
			
		System.out.println("@Christian Vargas Calculator MidTerm project UCSC Silicon Valley Extension");
		}
	}
		

