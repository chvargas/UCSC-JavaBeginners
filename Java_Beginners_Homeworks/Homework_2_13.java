import java.util.Scanner;

public class Homework_2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();
	
		
		double finalAmount1 = savingAmount * ( 1 + 0.00417);
		double finalAmount2 = (savingAmount + finalAmount1) * ( 1 + 0.00417);
		double finalAmount3 = (savingAmount + finalAmount2) * ( 1 + 0.00417);
		double finalAmount4 = (savingAmount + finalAmount3) * ( 1 + 0.00417);
		double finalAmount5 = (savingAmount + finalAmount4) * ( 1 + 0.00417);
		double finalAmount6 = (savingAmount + finalAmount5) * ( 1 + 0.00417);
		
		System.out.println("The Saving Amount entered was " + savingAmount);
		
		System.out.println("The final Amount in the first month is: " + finalAmount1);
		System.out.println("The final Amount in the second month is: " + finalAmount2);
		System.out.println("The final Amount in the third month is: " + finalAmount3);
		System.out.println("The final Amount in the fourth month is: " + finalAmount4);
		System.out.println("The final Amount in the fifth month is: " + finalAmount5);
		System.out.println("The final Amount after six months is: " + finalAmount6);
	
		input.close(); //Closing input
	}

}
