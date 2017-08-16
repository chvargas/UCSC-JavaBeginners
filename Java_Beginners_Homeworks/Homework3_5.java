import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework3_5 
{
	public static void main(String[] args) 
	{
		System.out.println
		("1. Title \n" + "2. Rank \n" + "3. Date \n" + "4. Stars \n" + "5. Likes");
		
		Scanner input = new Scanner(System.in);
        boolean cathError = true;
        int option = 0;

        do 
        {
            try 
            {
                System.out.println("Enter your choice must be between 1 and 5:");
                option = input.nextInt();

                if (option<1 || option>5)
                {
                    System.out.println("Invalid choice. Try again.");
                }
                
                else
                {
                    System.out.println("You entered valid choice was: " + option + "\nThanks");
                    cathError = false;
                }
            }
            
            catch (InputMismatchException e) 
            {
                System.out.println("Invalid choice. Try again.");
            }
            input.nextLine();
       
        } while (cathError);
	}
}
